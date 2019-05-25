package iotwearable.gen.cce.device;

import java.util.LinkedList;

import iotwearable.gen.cce.device.DeviceLibrary;
import iotwearable.gen.comanalyzer.Token;

public abstract class ArduinoWeMosCodeCreationEngine extends DeviceCodeCreationEngine {
	@Override
	public String createInclude() {
		// TODO Auto-generated method stub
		return "#include " + DeviceLibrary.ESP8266WiFi + ".h>\n"
				+ "#include " + DeviceLibrary.ESP8266WiFiMulti + ".h>\n"
				+ "#include " + DeviceLibrary.ESP8266HTTPClient + ".h>\n"
				+ "#include " + DeviceLibrary.WiFiClient + ".h>\n";
	}
	
	@Override
	public String createPrototype() {
		// TODO Auto-generated method stub
		return  "\n//HTTP GET\n"
				+ "\nString get(String url);\n"
				+ "\n//HTTP POST\n"
				+ "\nString post(String url, String data);\n";
	}
	
	@Override
	public String createMethodImpl() {
		// TODO Auto-generated method stub
		String getMethod = "String get(String url){\n" + 
				"  // wait for WiFi connection\n" + 
				"  if ((WiFiMulti.run() == WL_CONNECTED))\n" + 
				"  {\n" + 
				"\n" + 
				"    WiFiClient client;\n" + 
				"    HTTPClient http;\n" + 
				"\n" + 
				"    Serial.print(\"[HTTP] begin...\\n\");\n" + 
				"    if (http.begin(client, url))\n" + 
				"    {\n" + 
				"\n" + 
				"      Serial.print(\"[HTTP] GET...\\n\");\n" + 
				"      // start connection and send HTTP header\n" + 
				"      int httpCode = http.GET();\n" + 
				"\n" + 
				"      // httpCode will be negative on error\n" + 
				"      if (httpCode > 0)\n" + 
				"      {\n" + 
				"        // HTTP header has been send and Server response header has been handled\n" + 
				"        Serial.printf(\"[HTTP] GET code: %d\\n\", httpCode);\n" + 
				"\n" + 
				"        // file found at server\n" + 
				"        if (httpCode == HTTP_CODE_OK || httpCode == HTTP_CODE_MOVED_PERMANENTLY)\n" + 
				"        {\n" + 
				"          String payload = http.getString();\n" + 
				"          return payload;\n" + 
				"        }\n" + 
				"      }\n" + 
				"      else\n" + 
				"      {\n" + 
				"        Serial.printf(\"[HTTP] GET failed, error: %s\\n\", http.errorToString(httpCode).c_str());\n" + 
				"      }\n" + 
				"\n" + 
				"      http.end();\n" + 
				"    }\n" + 
				"    else\n" + 
				"    {\n" + 
				"      Serial.printf(\"[HTTP] Unable to connect\\n\");\n" + 
				"    }\n" + 
				"  }\n" + 
				"\n" + 
				"  delay(10000);\n" + 
				"}";
		String postMethod = "String post(String url, String data){\n" + 
				"  // wait for WiFi connection\n" + 
				"  if ((WiFiMulti.run() == WL_CONNECTED))\n" + 
				"  {\n" + 
				"\n" + 
				"    WiFiClient client;\n" + 
				"    HTTPClient http;\n" + 
				"\n" + 
				"    Serial.print(\"[HTTP] begin...\\n\");\n" + 
				"    if (http.begin(client, url))\n" + 
				"    {\n" + 
				"\n" + 
				"      Serial.print(\"[HTTP] POST...\\n\");\n" + 
				"      // start connection and send HTTP header\n" + 
				"      http.addHeader(\"Content-Type\", \"application/json\");\n" + 
				"      int httpCode = http.POST(data);\n" + 
				"\n" + 
				"      // httpCode will be negative on error\n" + 
				"      if (httpCode > 0)\n" + 
				"      {\n" + 
				"        // HTTP header has been send and Server response header has been handled\n" + 
				"        Serial.printf(\"[HTTP] POST code: %d\\n\", httpCode);\n" + 
				"\n" + 
				"        // file found at server\n" + 
				"        if (httpCode == HTTP_CODE_CREATED || httpCode == HTTP_CODE_MOVED_PERMANENTLY)\n" + 
				"        {\n" + 
				"          String payload = http.getString();\n" + 
				"          return payload;\n" + 
				"        }\n" + 
				"      }\n" + 
				"      else\n" + 
				"      {\n" + 
				"        Serial.printf(\"[HTTP] POST failed, error: %s\\n\", http.errorToString(httpCode).c_str());\n" + 
				"      }\n" + 
				"\n" + 
				"      http.end();\n" + 
				"    }\n" + 
				"    else\n" + 
				"    {\n" + 
				"      Serial.printf(\"[HTTP] Unable to connect\\n\");\n" + 
				"    }\n" + 
				"  }\n" + 
				"\n" + 
				"  delay(10000);\n" + 
				"}";
		return getMethod
				+ "\n"
				+ postMethod;
	}
	
	@Override
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		// TODO Auto-generated method stub
		String code = "";
		
		if(syntax.equals("begin connecting")) {
			code = "  while (WiFiMulti.run() != WL_CONNECTED)\n" + 
					"  {\n" + 
					"    delay(500);\n" + 
					"    Serial.print(\".\");\n" + 
					"  }\n" + 
					"\n" + 
					"  Serial.println();\n" + 
					"  Serial.print(\"Connected\");\n";
		}
		
		else if(syntax.equals("get from url <String>")) {
			code = "get("+tokens.get(1).instance+");\n";
		}
		
		else if(syntax.equals("post to url <String> with data <String>")) {
			code = "post("+tokens.get(1).instance+","+tokens.get(3).instance+");\n";
		}
		
		return code;
	}
	
}
