package iotwearable.editor.action;

import java.util.ArrayList;

import iotwearable.editor.MainboardEditor;
import iotwearable.editor.factory.BluetoothHC06Factory;
import iotwearable.editor.factory.BuzzerFactory;
import iotwearable.editor.factory.CDSFactory;
import iotwearable.editor.factory.I2CLCDFactory;
import iotwearable.editor.factory.Keypad4x4Factory;
import iotwearable.editor.factory.LEDFactory;
import iotwearable.editor.factory.LM35Factory;
import iotwearable.editor.factory.WifiESP8266Factory;
import iotwearable.model.iotw.ArduinoUNOR3;
import iotwearable.model.iotw.ArduinoWiFiESP8266WeMosD1;
import iotwearable.model.iotw.BluetoothHC06;
import iotwearable.model.iotw.Device;
import iotwearable.model.iotw.I2CLCD;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.Pin;

import org.eclipse.gef.Request;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.tools.CreationTool;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.ui.IWorkbenchPart;

public class MainboardContextMenuAction extends WorkbenchPartAction {

	public static final String ID_AddBuzzer = "AddBuzzer";
	public static final String ID_AddI2CLCD = "AddI2CLCD";
	public static final String ID_AddKeypad4x4 = "AddKeypad4x4";
	public static final String ID_AddLED = "AddLED";
	public static final String ID_AddBluetoothHC06 = "AddBluetoothHC06";
	public static final String ID_AddWifiESP8266 = "AddWifiESP8266";
	public static final String ID_AddLM35 = "AddML35";
	public static final String ID_AddCDS = "AddCDS";
	public static final String REQUEST = "MainboardContextMenu";
	public static final boolean EnableBuzzer = true;
	private ArrayList<String> listPinIO ;
	private boolean enable;
	private final Request request;
	private String Id;
	private Mainboard mainboard;
	public MainboardContextMenuAction(IWorkbenchPart part, String Id , Mainboard mainboard) {
		super(part);
		listPinIO = new ArrayList<String>();
		addListPinIO();
		this.mainboard = mainboard;
		this.enable = true;
		this.Id = Id;
		request = new Request(REQUEST);
		switch (Id) {
		case ID_AddBuzzer:
			setId(Id);
			setText("Add Buzze");
			break;
		case ID_AddI2CLCD:
			setId(Id);
			setText("Add I2C LCD");
			break;
		case ID_AddKeypad4x4:
			setId(Id);
			setText("Add Keypad 4x4");
			break;
		case ID_AddLED:
			setId(Id);
			setText("Add LED");
			break;
		case ID_AddBluetoothHC06:
			setId(Id);
			setText("Add Bluetooth HC06");
			break;
		case ID_AddWifiESP8266:
			setId(Id);
			setText("Add Wifi ESP8266");
			break;
		case ID_AddLM35:
			setId(Id);
			setText("Add LM35");
			break;
		case ID_AddCDS:
			setId(Id);
			setText("Add CDS");
			break;
		default:
			throw new IllegalArgumentException("Subkind " + Id + " is not supported.");
		}

	}
	private void addListPinIO()
	{
		if(mainboard instanceof ArduinoUNOR3) {
			listPinIO.add("2");
			listPinIO.add("3");
			listPinIO.add("4");
			listPinIO.add("5");
			listPinIO.add("6");
			listPinIO.add("7");
			listPinIO.add("8");
			listPinIO.add("9");
			listPinIO.add("10");
			listPinIO.add("11");
			listPinIO.add("12");
			listPinIO.add("13");
		}
		else if(mainboard instanceof ArduinoWiFiESP8266WeMosD1) {
			listPinIO.add("D0");
			listPinIO.add("D1");
			listPinIO.add("D2");
			listPinIO.add("D3");
			listPinIO.add("D4");
			listPinIO.add("D5");
			listPinIO.add("D6");
			listPinIO.add("D7");
			listPinIO.add("D8");
			listPinIO.add("D9");
			listPinIO.add("D10");
			listPinIO.add("D11");
			listPinIO.add("D12");
			listPinIO.add("D13");
		}

	}
	public Request getRequest() {
		return request;
	}

	@Override
	public void run() {
		MainboardEditor editor = (MainboardEditor) getWorkbenchPart();
		CreationTool tool ;
		switch (Id) {
		case ID_AddBuzzer:
			tool	= new CreationTool((CreationFactory) new BuzzerFactory());;
			editor.getEditDomain().setActiveTool(tool);
			break;
		case ID_AddI2CLCD:
			tool = new CreationTool((CreationFactory) new I2CLCDFactory());;
			editor.getEditDomain().setActiveTool(tool);
			break;
		case ID_AddKeypad4x4:
			tool = new CreationTool((CreationFactory) new Keypad4x4Factory());;
			editor.getEditDomain().setActiveTool(tool);
			break;
		case ID_AddLED:
			tool = new CreationTool((CreationFactory) new LEDFactory());;
			editor.getEditDomain().setActiveTool(tool);
			break;
		case ID_AddBluetoothHC06:
			tool = new CreationTool((CreationFactory) new BluetoothHC06Factory());;
			editor.getEditDomain().setActiveTool(tool);
			break;
		case ID_AddWifiESP8266:
			tool = new CreationTool((CreationFactory) new WifiESP8266Factory());;
			editor.getEditDomain().setActiveTool(tool);
			break;
		case ID_AddLM35:
			tool = new CreationTool((CreationFactory) new LM35Factory());
			editor.getEditDomain().setActiveTool(tool);
			break;
		case ID_AddCDS:
			tool = new CreationTool((CreationFactory) new CDSFactory());
			editor.getEditDomain().setActiveTool(tool);
			break;
		default:
			break;
		}
	}

	@Override
	protected boolean calculateEnabled() {
		switch (Id) {
		case ID_AddKeypad4x4:
			enable = true;//checkCalculateEnabledKeypad4x4();
			break;
		case ID_AddLED:
			enable = true;//checkCalculateEnabledLEDBuzzer();
			break;
		case ID_AddBuzzer:
			enable = true;//checkCalculateEnabledLEDBuzzer();
			break;
		case ID_AddI2CLCD:
			enable = true;//checkCalculateEnabledI2CLCD();
			break;
		case ID_AddBluetoothHC06:
			enable = true; //checkCalculateEnabledBluetooth();
			break;
		case ID_AddWifiESP8266:
			enable = true;//checkCalculateEnableWifiESP8266();
			break;
		case ID_AddLM35:
			enable = true;
			break;
		case ID_AddCDS:
			enable = true;
			break;	
		default:
			break;
		}
		return enable;
	}
	@SuppressWarnings("unused")
	private boolean checkCalculateEnabledKeypad4x4()
	{
		int countTypePin=0;
		for(Device device : mainboard.getDevices())
		{
			if(device instanceof Keypad4x4)
			{
				return false;
			}
		}
		for(Pin pin: mainboard.getPinConnecteds())
		{
			if(pin.getType().equals(Pin.TypePin.IO))
				countTypePin++;
		}
		if(countTypePin >=5)
			return false;
		return true;
	}
	@SuppressWarnings("unused")
	private boolean checkCalculateEnabledI2CLCD()
	{
		for(Device device : mainboard.getDevices())
		{
			if(device instanceof I2CLCD)
			{
				return false;
			}
		}
		return true;
	}
	@SuppressWarnings("unused")
	private boolean checkCalculateEnabledLEDBuzzer()
	{
		int count =0;
		for(Pin pin : mainboard.getPinConnecteds())
		{
			if(listPinIO.contains(pin.getName()))
				count++;
		}
		if(listPinIO.size() == count)
			return false;
		return true;
	}
	@SuppressWarnings("unused")
	private boolean checkCalculateEnabledBluetooth()
	{
		int count =0;
		for(Pin pin : mainboard.getPinConnecteds())
		{
			if(listPinIO.contains(pin.getName()))
				count++;
		}
		if(listPinIO.size()- count <2)
			return false;
		for(Device device : mainboard.getDevices())
		{
			if(device instanceof  BluetoothHC06)
				return false;
		}
		return true;
	}
	@SuppressWarnings("unused")
	private boolean checkCalculateEnableWifiESP8266()
	{
		for(Pin pin: mainboard.getPinConnecteds())
		{
			if(pin.getName().equalsIgnoreCase("0") || pin.getName().equalsIgnoreCase("1"))
				return false;
		}
		return true;
	}
}
