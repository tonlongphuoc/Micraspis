#ifndef CONFIG   /* Include guard */ 
#define CONFIG 

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
extern Ready;

Emergency: 1
extern Emergency;

Listening: 2
extern Listening;

Recovery: 3
extern Recovery;

Fever: 4
extern Fever;

Incubation: 5
extern Incubation;

*/

int currentState = 0;
extern int currentState ;

int nextState = -1;
extern int nextState ;


/*--------------------Define--------------------*/

ESP8266WiFiMulti WiFiMulti;

const char *ssid = "Ngoc";
extern const char *ssid ;

const char *password = "24681012";
extern const char *password ;

//Define kepad4x4 - keypad 


/*Button A : Emergency
extern /*Button A ;

Button B : Fever
extern Button B ;

Button C : Incubation
extern Button C ;

Button D : Revcovery
extern Button D ;

Button # : Back
extern Button # ;

*/

char keypad_keys[4][4] ={{'1','2','3','A'},{'4','5','6','B'},{'7','8','9','C'},{'*','0','#','D'}};
extern char keypad_keys[4][4] ;

byte keypad_rowPins[4] = {16,5,4,0};
extern byte keypad_rowPins[4] ;

byte keypad_columnPins[4] = {2,14,12,13};
extern byte keypad_columnPins[4] ;

Keypad keypad = Keypad(makeKeymap(keypad_keys), keypad_rowPins, keypad_columnPins, 4, 4);
extern Keypad keypad ;

//Define LED - led output

const int led = 15;
extern const int led ;

// Define LiquidCrystal_I2C - lcd 

LiquidCrystal_I2C lcd(0x27, 20, 4);


#endif // FOO_H_
