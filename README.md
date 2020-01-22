# Micraspis



This is a tool allowing generate source code for wearable devices by describing devices configuration and state schema  http://esp-lab.net/

## Syntax for States

| No. |	Syntax | Description | Component | Example |
|:--|:--------------------------|:------------------------------------|:-----------------------------|:------------------------------|
|1	| `Display <id>`            |Activate a device.			        |LED			                     | `Display` ledRed              |
|2	| `Hidden <id>`	            |Order to stop working.	    |LED			                     | `Hidden` ledRed               |
|3	| `Blink <id>`		          |Control device flashes.		    |LED, I2CLCD	                 | `Blink` lelRed, `Blink` lcd   |
|4	| `Beep <id>`		            |Emitted a Beep.				        |Buzzer			                   | `Beep` buzzer                 |
|5	| `Show <String>`	          |Display the string on the display device.	|LCD		                       | `Show` "Xin chao"             |


Notes: States will be changed only if an event occurs. So every connection must have an event, except connected to "end point" or "start point".

## Syntax for Connection/Link

| No. |	Syntax | Description | Component | Example |
|:--|:--------------------------|:------------------------------------|:-----------------------------|:------------------------------|
|1	| `<string> button pressed`	|Description of the keypress event.	            |keypad		                     | "Cancel" `button pressed`     |
|2	| `<id> push`	              |Receive a push-button event.		  |push button	                 | button `push`                 |
|3	| `<string> send`	          |Send data via wifi.				          |wifi esp8266	                 | "hello" `send`                |
|4	| `<string> received`	      |Receive to strings sent from other wifi.    |wifi esp8266	                 | "hello" `received`            |
|5	| `<id> : Display`	        |Check the status of the device.	    |LED	                         | ledRed : `Display`            |
|6	| `<id> : Hidden`	          |Check the status of the device.	    |LED	                         | ledRed : `Hidden`             |