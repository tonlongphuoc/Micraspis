
/*Source code for 

*/

#include ESP8266WiFi.h>

#include ESP8266WiFiMulti.h>

#include ESP8266HTTPClient.h>

#include WiFiClient.h>

#include OneWire.h>

#include DallasTemperature.h>


/*Each state in the application corresponds to one the integer.

Numbered starting at 0

stateCurrent is a variable that stores the current state of the application.

Initing: 0

Starting: 1

Emergence: 2

Recovery: 3

Incubation: 4

Fever: 5

Erroring: 6

*/

int currentState = 0;

int nextState = -1;


/*--------------------Define--------------------*/

const char *ssid = "ngoc";

const char *password = "2481012";

//Define LED - ledRed output

const int ledRed = 4;

//Define LED - ledGreen output

const int ledGreen = 0;

//Define LED - ledYellow output

const int ledYellow = 2;

//Define LED - ledOrange output

const int ledOrange = 14;

// Data wire is plugged into pin D1 on the ESP8266 12-E - GPIO 12 

#define ONE_WIRE_BUS 12

// Setup a oneWire instance to communicate with any OneWire devices (not just Maxim/Dallas temperature ICs)

OneWire oneWire(ONE_WIRE_BUS);

// Pass our oneWire reference to Dallas Temperature.

DallasTemperature DS18B20(&oneWire);


/*--------------------END Define--------------------*/


/*--------------------Prototype--------------------*/

//HTTP GET

String get(String url);

//HTTP POST

String post(String url, String data);

void stateIniting();

void stateStarting();

void stateEmergence();

void stateRecovery();

void stateIncubation();

void stateFever();

void stateErroring();


/*--------------------END Prototype--------------------*/


void setup() {
	Serial.begin(19200);
	for (uint8_t t = 4; t > 0; t--)
	{
		Serial.printf("[SETUP] WAIT %d...\n", t);
		Serial.flush();
		delay(1000);
	}
	WiFi.mode(WIFI_STA);
	WiFiMulti.addAP(ssid, password);
	pinMode(ledRed, OUTPUT);
	pinMode(ledGreen, OUTPUT);
	pinMode(ledYellow, OUTPUT);
	pinMode(ledOrange, OUTPUT);
	DS18B20.begin();
	if(currentState == 0){
		stateIniting();
	}
}

void loop() {
	switch(currentState){
		case 0:
		//TODO Implement method "inited"
		//<case0>
		break;
		case 1:
		//TODO Implement method ""Red" received"
		//TODO Implement method ""Green" received"
		//TODO Implement method ""Incubation" received"
		//TODO Implement method ""Orange" received"
		//TODO Implement method """ received"
		//<case1>
		break;
		case 2:
		//TODO Implement method "completed"
		//<case2>
		break;
		case 3:
		//TODO Implement method "completed"
		//<case3>
		break;
		case 4:
		//TODO Implement method "completed"
		//<case4>
		break;
		case 5:
		//TODO Implement method "completed"
		//<case5>
		break;
		case 6:
		//TODO Implement method "completed"
		//<case6>
		break;
		default:
		break;
	}
}

/*--------------------Implement--------------------*/

String get(String url){
	// wait for WiFi connection
	if ((WiFiMulti.run() == WL_CONNECTED))
	{
		WiFiClient client;
		HTTPClient http;
		Serial.print("[HTTP] begin...\n");
		if (http.begin(client, url))
		{
			Serial.print("[HTTP] GET...\n");
			// start connection and send HTTP header
			int httpCode = http.GET();
			// httpCode will be negative on error
			if (httpCode > 0)
			{
				// HTTP header has been send and Server response header has been handled
				Serial.printf("[HTTP] GET code: %d\n", httpCode);
				// file found at server
				if (httpCode == HTTP_CODE_OK || httpCode == HTTP_CODE_MOVED_PERMANENTLY)
				{
					String payload = http.getString();
					return payload;
				}
			}
			else
			{
				Serial.printf("[HTTP] GET failed, error: %s\n", http.errorToString(httpCode).c_str());
			}
			http.end();
		}
		else
		{
			Serial.printf("[HTTP] Unable to connect\n");
		}
	}
	delay(10000);
}
String post(String url, String data){
	// wait for WiFi connection
	if ((WiFiMulti.run() == WL_CONNECTED))
	{
		WiFiClient client;
		HTTPClient http;
		Serial.print("[HTTP] begin...\n");
		if (http.begin(client, url))
		{
			Serial.print("[HTTP] POST...\n");
			// start connection and send HTTP header
			http.addHeader("Content-Type", "application/json");
			int httpCode = http.POST(data);
			// httpCode will be negative on error
			if (httpCode > 0)
			{
				// HTTP header has been send and Server response header has been handled
				Serial.printf("[HTTP] POST code: %d\n", httpCode);
				// file found at server
				if (httpCode == HTTP_CODE_CREATED || httpCode == HTTP_CODE_MOVED_PERMANENTLY)
				{
					String payload = http.getString();
					return payload;
				}
			}
			else
			{
				Serial.printf("[HTTP] POST failed, error: %s\n", http.errorToString(httpCode).c_str());
			}
			http.end();
		}
		else
		{
			Serial.printf("[HTTP] Unable to connect\n");
		}
	}
	delay(10000);
}
void stateIniting(){
	while (WiFiMulti.run() != WL_CONNECTED)
	{
		delay(500);
		Serial.print(".");
	}
	Serial.println();
	Serial.print("Connected");
	currentState = 0;
	delay(200);
}
void stateStarting(){
	//TODO Implement method "Send request to server"
	currentState = 1;
	delay(200);
}
void stateEmergence(){
	digitalWrite(ledRed, HIGH);
	digitalWrite(ledYellow, LOW);
	digitalWrite(ledGreen, LOW);
	digitalWrite(ledOrange, LOW);
	currentState = 2;
	delay(200);
}
void stateRecovery(){
	digitalWrite(ledGreen, HIGH);
	digitalWrite(ledYellow, LOW);
	digitalWrite(ledOrange, LOW);
	digitalWrite(ledRed, LOW);
	currentState = 3;
	delay(200);
}
void stateIncubation(){
	digitalWrite(ledYellow, HIGH);
	digitalWrite(ledOrange, LOW);
	digitalWrite(ledGreen, LOW);
	digitalWrite(ledRed, LOW);
	currentState = 4;
	delay(200);
}
void stateFever(){
	digitalWrite(ledOrange, HIGH);
	digitalWrite(ledYellow, LOW);
	digitalWrite(ledGreen, LOW);
	digitalWrite(ledRed, LOW);
	currentState = 5;
	delay(200);
}
void stateErroring(){
	digitalWrite(ledRed, HIGH);
	delay(1000);
	digitalWrite(ledRed, LOW);
	delay(1000);
	currentState = 6;
	delay(200);
}

/*--------------------END Implement--------------------*/

