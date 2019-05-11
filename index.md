# Arduino WiFi ESP8266 WeMos D1

Reference: [arduino.esp8266.vn/wifi](https://arduino.esp8266.vn/wifi/index.html)

Thiết bị kết nối vào mạng WIFI được gọi là station (trạm)
Access point (AP)


## Properties
  - `baud`: 300, 1200, 2400, 4800, 9600, 19200, 38400, 57600, 74880, 115200, 230400, 250000, 500000, 1000000, 2000000

  - `pass`: WPA encrypted networks use a password in the form of a string for security.

  - `key`: a hexadecimal string used as a security code for WEP encrypted networks.

  - `keyIndex`: WEP encrypted networks can hold up to 4 different keys. This identifies which key you are going to use.

  - `ssid`: the SSID (Service Set Identifier) is the name of the WiFi network you want to connect to.

  - `wifi mode`: WIFI_AP, WIFI_STA, WIFI_AP_STA, WIFI_OFF

  - `macAddress`: using for STA
  
  - `softAPmacAddress`: using for AP

  - `localIP`: string

  - `channel`: number

  -  `bssid`: string

  - `connect`: false, true
