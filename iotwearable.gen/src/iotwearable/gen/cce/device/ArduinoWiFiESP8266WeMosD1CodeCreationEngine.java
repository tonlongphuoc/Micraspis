package iotwearable.gen.cce.device;

import java.util.LinkedList;

import iotwearable.gen.comanalyzer.Token;
import iotwearable.model.iotw.ArduinoWiFiESP8266WeMosD1;
import iotwearable.model.iotw.ESP8266WiFiMode;

public class ArduinoWiFiESP8266WeMosD1CodeCreationEngine extends ArduinoWeMosCodeCreationEngine {
	
	private ArduinoWiFiESP8266WeMosD1 device;

	public ArduinoWiFiESP8266WeMosD1CodeCreationEngine(ArduinoWiFiESP8266WeMosD1 device) {
		this.device = device;
	}
	
	@Override
	public String createDefine() {
		// TODO Auto-generated method stub
		String define = "";
		
		if(device.getSsid() != null)
			if(!device.getSsid().isEmpty())
				define += "const char *ssid = \""+device.getSsid()+"\";\n";
		if(device.getPassword() != null)
			if(!device.getPassword().isEmpty())
				define += "const char *password = \""+device.getPassword()+"\";\n";
		
		return define;
	}

	@Override
	public String createInitSetup() {
		// TODO Auto-generated method stub
		String init = "";
		
		init += "Serial.begin("+device.getBaud()+");\n";
		
		init += "  for (uint8_t t = 4; t > 0; t--)\n" + 
				"  {\n" + 
				"    Serial.printf(\"[SETUP] WAIT %d...\\n\", t);\n" + 
				"    Serial.flush();\n" + 
				"    delay(1000);\n" + 
				"  }\n";
		
		if(device.getWifiMode() == null)
			init += "WiFi.mode("+ESP8266WiFiMode.WIFI_STA+");\n";
		else 
			init += "WiFi.mode("+device.getWifiMode()+");\n";
		
		if(device.getSsid() != null && device.getPassword() != null)
			init += "WiFiMulti.addAP(ssid, password);\n";
			
		return init;
	}

	@Override
	public String createInitLoop() {
		// TODO Auto-generated method stub
		return "";
	}


	@Override
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		// TODO Auto-generated method stub
		String code = super.createFromCommand(syntax, tokens);
		return code;
	}

}
