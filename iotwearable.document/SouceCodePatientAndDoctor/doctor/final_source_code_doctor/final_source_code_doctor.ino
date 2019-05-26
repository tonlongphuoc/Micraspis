
/*Source code for

*/

#include <ArduinoJson.h>

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

const char *ssid = "Ngoc";

const char *password = "24681012";

//Define kepad4x4 - keypad

/*Button A : Emergency

  Button B : Fever

  Button C : Incubation

  Button D : Recovery

  Button # : Back

*/

char keypad_keys[4][4] ={{'1','2','3','A'},{'4','5','6','B'},{'7','8','9','C'},{'*','0','#','D'}};

byte keypad_rowPins[4] = {16,5,4,0};

byte keypad_columnPins[4] = {2,14,12,13};

Keypad keypad = Keypad(makeKeymap(keypad_keys), keypad_rowPins, keypad_columnPins, 4, 4);
//Define LED - led output

const int led = 15;

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

void checkEmergency();

void printJsonArray(String text, String label);

void printJsonObject(String text);

/*--------------------END Prototype--------------------*/

void setup()
{
  Serial.begin(115200);
  for (uint8_t t = 4; t > 0; t--)
  {
    Serial.printf("[SETUP] WAIT %d...\n", t);
    Serial.flush();
    delay(1000);
  }
  WiFi.mode(WIFI_OFF);
  WiFiMulti.addAP(ssid, password);
  pinMode(led, OUTPUT);
  lcd.init();
  lcd.begin(20, 4);
  lcd.backlight();
  if (currentState == 0)
  {
    stateReady();
  }
}

void loop()
{
  char keypadClientKey = keypad.getKey();
  Serial.print(currentState);
  Serial.print(keypadClientKey);
   checkEmergency();
  switch (currentState)
  {
    case 0:
      //TODO Implement method "connected"
      stateEmergency();
      //<case0>
      break;
    case 1:
      //Event: "Back" button pressed
      if (keypadClientKey == '#')
      {
        stateListening();
      }
      //TODO Implement method """ received"
      stateListening();
      //<case1>
      break;
    case 2  :
      //Event: "Recovery" button pressed
      if (keypadClientKey == 'D')
      {
        stateRecovery();
      }
      //Event: "Emergency" button pressed
      if (keypadClientKey == 'A')
      {
        stateEmergency();
      }
      //Event: "Fever" button pressed
      if (keypadClientKey == 'B')
      {
        stateFever();
      }
      //Event: "Incubation" button pressed
      if (keypadClientKey == 'C')
      {
        stateIncubation();
      }
      //<case2>
      break;
    case 3:
      //Event: "Back" button pressed
      if (keypadClientKey == '#')
      {
        stateListening();
      }
      //<case3>
      break;
    case 4:
      //Event: "Back" button pressed
      if (keypadClientKey == '#')
      {
        stateListening();
      }
      //<case4>
      break;
    case 5:
      //Event: "Back" button pressed
      if (keypadClientKey == '#')
      {
        stateListening();
      }
      //<case5>
      break;
    default:
      break;
  }
}

/*--------------------Implement--------------------*/

String get(String url)
{
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
String post(String url, String data)
{
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
void stateReady()
{
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
void stateEmergency()
{
  //TODO Implement method "Get patients Emergency"
  String urlGetEmergency = "http://192.168.1.204:3000/Emergency";
  String res = get(urlGetEmergency);
  //TODO Implement method "Show result"
  if (res != "[]")
  {
    printJsonArray(res, "Emergency: ");
    currentState = 0;
    digitalWrite(led, HIGH);
  }
  else
    currentState = 1;
  delay(200);
}
void stateListening()
{
  //TODO Implement method "Get patient list status"
  String urlListPatient = "http://192.168.1.204:3000/listPatient";
  String res = get(urlListPatient);
  //TODO Implement method "Show result"
  digitalWrite(led, LOW);
  if (res != "")
  {
    printJsonObject(res);
  }
  //TODO Implement method "check emergency"
  checkEmergency();
  currentState = 2;
  delay(200);
}
void stateRecovery()
{
  //TODO Implement method "Get patients recovery"
  String urlGetRecovery = "http://192.168.1.204:3000/Recovery";
  String res = get(urlGetRecovery);
  //TODO Implement method "Show result"
  if (res != "[]")
  {
    printJsonArray(res, "Recovery: ");
  }
  //TODO Implement method "check emergency"
  checkEmergency();
  currentState = 3;
  delay(200);
}
void stateFever()
{
  //TODO Implement method "Get patients fever"
  String urlGetFever = "http://192.168.1.204:3000/Fever";
  String res = get(urlGetFever);
  //TODO Implement method "Show result"
  if (res != "[]")
  {
    printJsonArray(res, "Fever: ");
  }
  //TODO Implement method "check emergency"
  checkEmergency();
  currentState = 4;
  delay(200);
}
void stateIncubation()
{
  //TODO Implement method "Get patients Incubation"
  String urlGetIncubation = "http://192.168.1.204:3000/Incubation";
  String res = get(urlGetIncubation);
  //TODO Implement method "Show result"
  if (res != "[]")
  {
    printJsonArray(res, "Incubation: ");
  }
  //TODO Implement method "check emergency"
  checkEmergency();
  currentState = 5;
  delay(200);
}

void checkEmergency()
{
  //TODO Implement method "Get patients Emergency"
  String urlGetEmergency = "http://192.168.1.204:3000/Emergency";
  String res = get(urlGetEmergency);
  //TODO Implement method "Show result"
  if (res != "[]")
  {
    printJsonArray(res, "Emergency: ");
    currentState = 0;
  }
  delay(200);
}

void printJsonObject(String text)
{
  char arr[text.length()];
  int i;
  for (i = 0; i < sizeof(arr); i++) {
    arr[i] = text[i];
  }
  lcd.clear();
  DynamicJsonDocument doc(1024);
  deserializeJson(doc, arr);
  JsonObject root = doc.as<JsonObject>();
  int line = 0 ;
  for (JsonObject::iterator it = root.begin(); it != root.end(); ++it) {
    lcd.setCursor(0, line);
    lcd.print(it->key().c_str());
    lcd.setCursor(12, line);
    lcd.print(it->value().as<int>());
    line ++;
  }
  delay(1000);
}
void printJsonArray(String text, String label)
{
  lcd.clear();
  int col = 0;
  char textArr[text.length()];
  int i;
  for (i = 0; i < sizeof(textArr); i++) {
    textArr[i] = text[i];
  }
  DynamicJsonDocument doc(1024);
  deserializeJson(doc, textArr);
  JsonArray arr = doc.as<JsonArray>();
  lcd.setCursor(0, 0);
  lcd.print(label);
  for (JsonArray::iterator it = arr.begin(); it != arr.end(); ++it) {
    lcd.setCursor(col, 1);
    lcd.print(it->as<int>());
    col = col + 2;
  }
  delay(1000);
}
/*--------------------END Implement--------------------*/
