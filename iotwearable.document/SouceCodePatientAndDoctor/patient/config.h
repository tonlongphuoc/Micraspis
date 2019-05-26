#ifndef CONFIG   /* Include guard */ 
#define CONFIG 

/*Source code for 

*/

#include <ESP8266WiFi.h>

#include <ESP8266WiFiMulti.h>

#include <ESP8266HTTPClient.h>

#include <WiFiClient.h>

#include OneWire.h>

#include DallasTemperature.h>


/*Each state in the application corresponds to one the integer.

Numbered starting at 0

stateCurrent is a variable that stores the current state of the application.

Initing: 0
extern Initing;

Starting: 1
extern Starting;

Emergence: 2
extern Emergence;

Recovery: 3
extern Recovery;

Incubation: 4
extern Incubation;

Fever: 5
extern Fever;

Erroring: 6
extern Erroring;

*/

int currentState = 0;
extern int currentState ;

int nextState = -1;
extern int nextState ;


/*--------------------Define--------------------*/

ESP8266WiFiMulti WiFiMulti;

const char *ssid = "ngoc";
extern const char *ssid ;

const char *password = "2481012";
extern const char *password ;

//Define LED - ledRed output

const int ledRed = 4;
extern const int ledRed ;

//Define LED - ledGreen output

const int ledGreen = 0;
extern const int ledGreen ;

//Define LED - ledYellow output

const int ledYellow = 2;
extern const int ledYellow ;

//Define LED - ledOrange output

const int ledOrange = 14;
extern const int ledOrange ;

// Data wire is plugged into pin D1 on the ESP8266 12-E - GPIO 12 

#define ONE_WIRE_BUS 12
extern #define ONE_WIRE_BUS

// Setup a oneWire instance to communicate with any OneWire devices (not just Maxim/Dallas temperature ICs)

OneWire oneWire(ONE_WIRE_BUS);

// Pass our oneWire reference to Dallas Temperature.

DallasTemperature DS18B20(&oneWire);


#endif // FOO_H_
