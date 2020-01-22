package iotwearable.gen.cce.device;

import iotwearable.model.iotw.ArduinoWiFiESP8266WeMosD1;
import iotwearable.model.iotw.LED;
import iotwearable.model.iotw.Mainboard;

public class LEDSingleCodeCreationEngine extends LEDCodeCreationEngine{
	LED led;
	private Mainboard mainboard;
	private DeviceCodeCreationEngine deviceCodeCreationEngine;
	
	public LEDSingleCodeCreationEngine(LED led) {
		this.led = led;
		mainboard = led.getMainboard();
		deviceCodeCreationEngine = CodeCreationEngineFactory.create(mainboard);
	}

	@Override
	public String createInclude() {
		return "";
	}

	@Override
	public String createInitLoop() {
		return "";
	}
	@Override
	public String createDefine() {
		String pin = mainboard.findPin(led.getPinConnecteds().get(0)).getName();
		if(mainboard instanceof ArduinoWiFiESP8266WeMosD1)
		{
			ArduinoWiFiESP8266WeMosD1CodeCreationEngine _deviceCodeCreationEngine = (ArduinoWiFiESP8266WeMosD1CodeCreationEngine) deviceCodeCreationEngine;
			pin = _deviceCodeCreationEngine.mapPin(pin);
	    }
		return super.createDefine()
				.replaceAll("<id>", led.getId())
				.replaceAll("<pin>", pin);
	}
	@Override
	public String createInitSetup() {
		return super.createInitSetup()
				.replaceAll("<id>", led.getId());
	}

	@Override
	public String createPrototype() {
		return "";
	}

	@Override
	public String createMethodImpl() {
		return "";
	}
}