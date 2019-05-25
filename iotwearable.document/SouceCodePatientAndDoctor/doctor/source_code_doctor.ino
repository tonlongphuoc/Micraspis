
/*Source code for 

*/

#include <ESP8266WiFi.h>

#include <ESP8266WiFiMulti.h>

#include <ESP8266HTTPClient.h>

#include <WiFiClient.h>

#include <Keypad.h>

#include <LiquidCrystal_I2C.h>


/*Each state in the application corresponds to one the integer.

Numbered starting at 0

stateCurrent is a variable that stores the current state of the application.

Ready: 0

Emergency: 1

Listening: 2

Recovery: 3

Fever: 4

Incubation: 5

*/

int currentState = 0;

int nextState = -1;


/*--------------------Define--------------------*/

ESP8266WiFiMulti WiFiMulti;

//Define kepad4x4 - keypad 


/*Button A : Emergency

Button B : Fever

Button C : Incubation

Button D : Recovery

Button # : Back

*/

char keypad_keys[4][4] ={{'1','2','3','A'},{'4','5','6','B'},{'7','8','9','C'},{'*','0','#','D'}};

byte keypad_rowPins[4] = {4,0,2,14};

byte keypad_columnPins[4] = {12,13,15,3};

Keypad keypad = Keypad(makeKeymap(keypad_keys), keypad_rowPins, keypad_columnPins, 4, 4);

//Define LED - led output

const int led = 1;

// Define LiquidCrystal_I2C - lcd 

LiquidCrystal_I2C lcd(0x27, 20, 4);


/*--------------------END Define--------------------*/


/*--------------------Prototype--------------------*/

//HTTP GET

String get(String url);

//HTTP POST

String post(String url, String data);

void stateReady();

void stateEmergency();

void stateListening();

void stateRecovery();

void stateFever();

void stateIncubation();


/*--------------------END Prototype--------------------*/


void setup() {
	Serial.begin(19200);
	for (uint8_t t = 4; t > 0; t--)
	{
		Serial.printf("[SETUP] WAIT %d...\n", t);
		Serial.flush();
		delay(1000);
	}
	WiFi.mode(WIFI_OFF);
	pinMode(led, OUTPUT);
	lcd.init();
	lcd.begin(20, 4);
	lcd.backlight();
	if(currentState == 0){
		stateReady();
	}
}

void loop() {
	char keypadClientKey = keypad.getKey();
	switch(currentState){
		case 0:
		//TODO Implement method "connected"
		//<case0>
		break;
		case 1:
		//Event: "Back" button pressed
		if(keypadClientKey == '#'){
			stateListening();
		}
		//TODO Implement method """ received"
		//<case1>
		break;
		case 2:
		//Event: "Recovery" button pressed
		if(keypadClientKey == 'D'){
			stateRecovery();
		}
		//Event: "Emergency" button pressed
		if(keypadClientKey == 'A'){
			stateEmergency();
		}
		//Event: "Fever" button pressed
		if(keypadClientKey == 'B'){
			stateFever();
		}
		//Event: "Incubation" button pressed
		if(keypadClientKey == 'C'){
			stateIncubation();
		}
		//<case2>
		break;
		case 3:
		//Event: "Back" button pressed
		if(keypadClientKey == '#'){
			stateListening();
		}
		//<case3>
		break;
		case 4:
		//Event: "Back" button pressed
		if(keypadClientKey == '#'){
			stateListening();
		}
		//<case4>
		break;
		case 5:
		//Event: "Back" button pressed
		if(keypadClientKey == '#'){
			stateListening();
		}
		//<case5>
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
void stateReady(){
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
void stateEmergency(){
	//TODO Implement method "Get patients emergency"
	//TODO Implement method "Show result"
	currentState = 1;
	delay(200);
}
void stateListening(){
	//TODO Implement method "Get patient list status"
	//TODO Implement method "Show result"
	//TODO Implement method "check emergency"
	currentState = 2;
	delay(200);
}
void stateRecovery(){
	//TODO Implement method "Get patients recovery"
	//TODO Implement method "Show result"
	//TODO Implement method "check emergency"
	currentState = 3;
	delay(200);
}
void stateFever(){
	//TODO Implement method "Get patients fever"
	//TODO Implement method "Show result"
	//TODO Implement method "check emergency"
	currentState = 4;
	delay(200);
}
void stateIncubation(){
	//TODO Implement method "Get patients incubation"
	//TODO Implement method "Show result"
	//TODO Implement method "check emergency"
	currentState = 5;
	delay(200);
}

/*--------------------END Implement--------------------*/

