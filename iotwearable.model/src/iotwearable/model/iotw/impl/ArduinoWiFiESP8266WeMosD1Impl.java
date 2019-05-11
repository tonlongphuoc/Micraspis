/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.ArduinoWiFiESP8266WeMosD1;
import iotwearable.model.iotw.ESP8266WiFiMode;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.Pin;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Wi Fi ESP8266 We Mos D1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinA0 <em>Pin A0</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD0 <em>Pin D0</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD1 <em>Pin D1</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD2 <em>Pin D2</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD3 <em>Pin D3</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD4 <em>Pin D4</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD5 <em>Pin D5</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD6 <em>Pin D6</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD7 <em>Pin D7</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD8 <em>Pin D8</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD9 <em>Pin D9</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD10 <em>Pin D10</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD11 <em>Pin D11</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD12 <em>Pin D12</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPinD13 <em>Pin D13</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getWifiMode <em>Wifi Mode</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getSsid <em>Ssid</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getPassword <em>Password</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getIp <em>Ip</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getDns <em>Dns</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ArduinoWiFiESP8266WeMosD1Impl#getBaud <em>Baud</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArduinoWiFiESP8266WeMosD1Impl extends MainboardImpl implements ArduinoWiFiESP8266WeMosD1 {
	/**
	 * The default value of the '{@link #getPinA0() <em>Pin A0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA0()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_A0_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "A0,IO");

	/**
	 * The cached value of the '{@link #getPinA0() <em>Pin A0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinA0()
	 * @generated
	 * @ordered
	 */
	protected Pin pinA0 = PIN_A0_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD0() <em>Pin D0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD0()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D0_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D0,IO");

	/**
	 * The cached value of the '{@link #getPinD0() <em>Pin D0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD0()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD0 = PIN_D0_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD1() <em>Pin D1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD1()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D1_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D1,IO");

	/**
	 * The cached value of the '{@link #getPinD1() <em>Pin D1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD1()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD1 = PIN_D1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD2() <em>Pin D2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD2()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D2_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D2,IO");

	/**
	 * The cached value of the '{@link #getPinD2() <em>Pin D2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD2()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD2 = PIN_D2_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD3() <em>Pin D3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD3()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D3_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D3,IO");

	/**
	 * The cached value of the '{@link #getPinD3() <em>Pin D3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD3()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD3 = PIN_D3_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD4() <em>Pin D4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD4()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D4_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D4,IO");

	/**
	 * The cached value of the '{@link #getPinD4() <em>Pin D4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD4()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD4 = PIN_D4_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD5() <em>Pin D5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD5()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D5_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D5,IO");

	/**
	 * The cached value of the '{@link #getPinD5() <em>Pin D5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD5()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD5 = PIN_D5_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD6() <em>Pin D6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD6()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D6_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D6,IO");

	/**
	 * The cached value of the '{@link #getPinD6() <em>Pin D6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD6()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD6 = PIN_D6_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD7() <em>Pin D7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD7()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D7_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D7,IO");

	/**
	 * The cached value of the '{@link #getPinD7() <em>Pin D7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD7()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD7 = PIN_D7_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD8() <em>Pin D8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD8()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D8_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D8,IO");

	/**
	 * The cached value of the '{@link #getPinD8() <em>Pin D8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD8()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD8 = PIN_D8_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD9() <em>Pin D9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD9()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D9_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D9,IO");

	/**
	 * The cached value of the '{@link #getPinD9() <em>Pin D9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD9()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD9 = PIN_D9_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD10() <em>Pin D10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD10()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D10_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D10,IO");

	/**
	 * The cached value of the '{@link #getPinD10() <em>Pin D10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD10()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD10 = PIN_D10_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD11() <em>Pin D11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD11()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D11_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D11,IO");

	/**
	 * The cached value of the '{@link #getPinD11() <em>Pin D11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD11()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD11 = PIN_D11_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD12() <em>Pin D12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD12()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D12_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D12,IO");

	/**
	 * The cached value of the '{@link #getPinD12() <em>Pin D12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD12()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD12 = PIN_D12_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinD13() <em>Pin D13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD13()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_D13_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "D13,IO");

	/**
	 * The cached value of the '{@link #getPinD13() <em>Pin D13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinD13()
	 * @generated
	 * @ordered
	 */
	protected Pin pinD13 = PIN_D13_EDEFAULT;

	/**
	 * The default value of the '{@link #getWifiMode() <em>Wifi Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWifiMode()
	 * @generated
	 * @ordered
	 */
	protected static final ESP8266WiFiMode WIFI_MODE_EDEFAULT = ESP8266WiFiMode.WIFI_OFF;

	/**
	 * The cached value of the '{@link #getWifiMode() <em>Wifi Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWifiMode()
	 * @generated
	 * @ordered
	 */
	protected ESP8266WiFiMode wifiMode = WIFI_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsid() <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsid()
	 * @generated
	 * @ordered
	 */
	protected static final String SSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsid() <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsid()
	 * @generated
	 * @ordered
	 */
	protected String ssid = SSID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDns() <em>Dns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns()
	 * @generated
	 * @ordered
	 */
	protected static final String DNS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDns() <em>Dns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns()
	 * @generated
	 * @ordered
	 */
	protected String dns = DNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected String gateway = GATEWAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnet() <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSubnet() <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected String subnet = SUBNET_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaud() <em>Baud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaud()
	 * @generated
	 * @ordered
	 */
	protected static final int BAUD_EDEFAULT = 19200;

	/**
	 * The cached value of the '{@link #getBaud() <em>Baud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaud()
	 * @generated
	 * @ordered
	 */
	protected int baud = BAUD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArduinoWiFiESP8266WeMosD1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinA0() {
		return pinA0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinA0(Pin newPinA0) {
		Pin oldPinA0 = pinA0;
		pinA0 = newPinA0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_A0, oldPinA0, pinA0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD0() {
		return pinD0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD0(Pin newPinD0) {
		Pin oldPinD0 = pinD0;
		pinD0 = newPinD0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D0, oldPinD0, pinD0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD1() {
		return pinD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD1(Pin newPinD1) {
		Pin oldPinD1 = pinD1;
		pinD1 = newPinD1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D1, oldPinD1, pinD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD2() {
		return pinD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD2(Pin newPinD2) {
		Pin oldPinD2 = pinD2;
		pinD2 = newPinD2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D2, oldPinD2, pinD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD3() {
		return pinD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD3(Pin newPinD3) {
		Pin oldPinD3 = pinD3;
		pinD3 = newPinD3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D3, oldPinD3, pinD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD4() {
		return pinD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD4(Pin newPinD4) {
		Pin oldPinD4 = pinD4;
		pinD4 = newPinD4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D4, oldPinD4, pinD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD5() {
		return pinD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD5(Pin newPinD5) {
		Pin oldPinD5 = pinD5;
		pinD5 = newPinD5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D5, oldPinD5, pinD5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD6() {
		return pinD6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD6(Pin newPinD6) {
		Pin oldPinD6 = pinD6;
		pinD6 = newPinD6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D6, oldPinD6, pinD6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD7() {
		return pinD7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD7(Pin newPinD7) {
		Pin oldPinD7 = pinD7;
		pinD7 = newPinD7;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D7, oldPinD7, pinD7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD8() {
		return pinD8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD8(Pin newPinD8) {
		Pin oldPinD8 = pinD8;
		pinD8 = newPinD8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D8, oldPinD8, pinD8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD9() {
		return pinD9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD9(Pin newPinD9) {
		Pin oldPinD9 = pinD9;
		pinD9 = newPinD9;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D9, oldPinD9, pinD9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD10() {
		return pinD10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD10(Pin newPinD10) {
		Pin oldPinD10 = pinD10;
		pinD10 = newPinD10;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D10, oldPinD10, pinD10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD11() {
		return pinD11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD11(Pin newPinD11) {
		Pin oldPinD11 = pinD11;
		pinD11 = newPinD11;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D11, oldPinD11, pinD11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD12() {
		return pinD12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD12(Pin newPinD12) {
		Pin oldPinD12 = pinD12;
		pinD12 = newPinD12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D12, oldPinD12, pinD12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinD13() {
		return pinD13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinD13(Pin newPinD13) {
		Pin oldPinD13 = pinD13;
		pinD13 = newPinD13;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D13, oldPinD13, pinD13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESP8266WiFiMode getWifiMode() {
		return wifiMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWifiMode(ESP8266WiFiMode newWifiMode) {
		ESP8266WiFiMode oldWifiMode = wifiMode;
		wifiMode = newWifiMode == null ? WIFI_MODE_EDEFAULT : newWifiMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__WIFI_MODE, oldWifiMode, wifiMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSsid() {
		return ssid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsid(String newSsid) {
		String oldSsid = ssid;
		ssid = newSsid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SSID, oldSsid, ssid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDns() {
		return dns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDns(String newDns) {
		String oldDns = dns;
		dns = newDns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__DNS, oldDns, dns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGateway(String newGateway) {
		String oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__GATEWAY, oldGateway, gateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnet() {
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnet(String newSubnet) {
		String oldSubnet = subnet;
		subnet = newSubnet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SUBNET, oldSubnet, subnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBaud() {
		return baud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaud(int newBaud) {
		int oldBaud = baud;
		baud = newBaud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__BAUD, oldBaud, baud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_A0:
				return getPinA0();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D0:
				return getPinD0();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D1:
				return getPinD1();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D2:
				return getPinD2();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D3:
				return getPinD3();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D4:
				return getPinD4();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D5:
				return getPinD5();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D6:
				return getPinD6();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D7:
				return getPinD7();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D8:
				return getPinD8();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D9:
				return getPinD9();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D10:
				return getPinD10();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D11:
				return getPinD11();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D12:
				return getPinD12();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D13:
				return getPinD13();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__WIFI_MODE:
				return getWifiMode();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SSID:
				return getSsid();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PASSWORD:
				return getPassword();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__IP:
				return getIp();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__DNS:
				return getDns();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__GATEWAY:
				return getGateway();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SUBNET:
				return getSubnet();
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__BAUD:
				return getBaud();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_A0:
				setPinA0((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D0:
				setPinD0((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D1:
				setPinD1((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D2:
				setPinD2((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D3:
				setPinD3((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D4:
				setPinD4((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D5:
				setPinD5((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D6:
				setPinD6((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D7:
				setPinD7((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D8:
				setPinD8((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D9:
				setPinD9((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D10:
				setPinD10((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D11:
				setPinD11((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D12:
				setPinD12((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D13:
				setPinD13((Pin)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__WIFI_MODE:
				setWifiMode((ESP8266WiFiMode)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SSID:
				setSsid((String)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PASSWORD:
				setPassword((String)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__IP:
				setIp((String)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__DNS:
				setDns((String)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__GATEWAY:
				setGateway((String)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SUBNET:
				setSubnet((String)newValue);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__BAUD:
				setBaud((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_A0:
				setPinA0(PIN_A0_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D0:
				setPinD0(PIN_D0_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D1:
				setPinD1(PIN_D1_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D2:
				setPinD2(PIN_D2_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D3:
				setPinD3(PIN_D3_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D4:
				setPinD4(PIN_D4_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D5:
				setPinD5(PIN_D5_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D6:
				setPinD6(PIN_D6_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D7:
				setPinD7(PIN_D7_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D8:
				setPinD8(PIN_D8_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D9:
				setPinD9(PIN_D9_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D10:
				setPinD10(PIN_D10_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D11:
				setPinD11(PIN_D11_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D12:
				setPinD12(PIN_D12_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D13:
				setPinD13(PIN_D13_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__WIFI_MODE:
				setWifiMode(WIFI_MODE_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SSID:
				setSsid(SSID_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__IP:
				setIp(IP_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__DNS:
				setDns(DNS_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__GATEWAY:
				setGateway(GATEWAY_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SUBNET:
				setSubnet(SUBNET_EDEFAULT);
				return;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__BAUD:
				setBaud(BAUD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_A0:
				return PIN_A0_EDEFAULT == null ? pinA0 != null : !PIN_A0_EDEFAULT.equals(pinA0);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D0:
				return PIN_D0_EDEFAULT == null ? pinD0 != null : !PIN_D0_EDEFAULT.equals(pinD0);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D1:
				return PIN_D1_EDEFAULT == null ? pinD1 != null : !PIN_D1_EDEFAULT.equals(pinD1);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D2:
				return PIN_D2_EDEFAULT == null ? pinD2 != null : !PIN_D2_EDEFAULT.equals(pinD2);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D3:
				return PIN_D3_EDEFAULT == null ? pinD3 != null : !PIN_D3_EDEFAULT.equals(pinD3);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D4:
				return PIN_D4_EDEFAULT == null ? pinD4 != null : !PIN_D4_EDEFAULT.equals(pinD4);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D5:
				return PIN_D5_EDEFAULT == null ? pinD5 != null : !PIN_D5_EDEFAULT.equals(pinD5);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D6:
				return PIN_D6_EDEFAULT == null ? pinD6 != null : !PIN_D6_EDEFAULT.equals(pinD6);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D7:
				return PIN_D7_EDEFAULT == null ? pinD7 != null : !PIN_D7_EDEFAULT.equals(pinD7);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D8:
				return PIN_D8_EDEFAULT == null ? pinD8 != null : !PIN_D8_EDEFAULT.equals(pinD8);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D9:
				return PIN_D9_EDEFAULT == null ? pinD9 != null : !PIN_D9_EDEFAULT.equals(pinD9);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D10:
				return PIN_D10_EDEFAULT == null ? pinD10 != null : !PIN_D10_EDEFAULT.equals(pinD10);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D11:
				return PIN_D11_EDEFAULT == null ? pinD11 != null : !PIN_D11_EDEFAULT.equals(pinD11);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D12:
				return PIN_D12_EDEFAULT == null ? pinD12 != null : !PIN_D12_EDEFAULT.equals(pinD12);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D13:
				return PIN_D13_EDEFAULT == null ? pinD13 != null : !PIN_D13_EDEFAULT.equals(pinD13);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__WIFI_MODE:
				return wifiMode != WIFI_MODE_EDEFAULT;
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SSID:
				return SSID_EDEFAULT == null ? ssid != null : !SSID_EDEFAULT.equals(ssid);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__DNS:
				return DNS_EDEFAULT == null ? dns != null : !DNS_EDEFAULT.equals(dns);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__GATEWAY:
				return GATEWAY_EDEFAULT == null ? gateway != null : !GATEWAY_EDEFAULT.equals(gateway);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SUBNET:
				return SUBNET_EDEFAULT == null ? subnet != null : !SUBNET_EDEFAULT.equals(subnet);
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__BAUD:
				return baud != BAUD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pinA0: ");
		result.append(pinA0);
		result.append(", pinD0: ");
		result.append(pinD0);
		result.append(", pinD1: ");
		result.append(pinD1);
		result.append(", pinD2: ");
		result.append(pinD2);
		result.append(", pinD3: ");
		result.append(pinD3);
		result.append(", pinD4: ");
		result.append(pinD4);
		result.append(", pinD5: ");
		result.append(pinD5);
		result.append(", pinD6: ");
		result.append(pinD6);
		result.append(", pinD7: ");
		result.append(pinD7);
		result.append(", pinD8: ");
		result.append(pinD8);
		result.append(", pinD9: ");
		result.append(pinD9);
		result.append(", pinD10: ");
		result.append(pinD10);
		result.append(", pinD11: ");
		result.append(pinD11);
		result.append(", pinD12: ");
		result.append(pinD12);
		result.append(", pinD13: ");
		result.append(pinD13);
		result.append(", wifiMode: ");
		result.append(wifiMode);
		result.append(", ssid: ");
		result.append(ssid);
		result.append(", password: ");
		result.append(password);
		result.append(", ip: ");
		result.append(ip);
		result.append(", dns: ");
		result.append(dns);
		result.append(", gateway: ");
		result.append(gateway);
		result.append(", subnet: ");
		result.append(subnet);
		result.append(", baud: ");
		result.append(baud);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public EList<Pin> getPins() {
		EList<Pin> pins = new BasicEList<Pin>();
		pins.add(pinA0);
		pins.add(pinD0);
		pins.add(pinD1);
		pins.add(pinD2);
		pins.add(pinD3);
		pins.add(pinD4);
		pins.add(pinD5);
		pins.add(pinD6);
		pins.add(pinD7);
		pins.add(pinD8);
		pins.add(pinD9);
		pins.add(pinD10);
		pins.add(pinD11);
		pins.add(pinD12);
		pins.add(pinD13);
		return pins;
	}
	
	@Override
	public void modifyPin(Pin pin) {
		if(pin == null){
			return;
		}
		if(pin.getName().equals(pinA0.getName())){
			setPinA0(pin);
		}
		if(pin.getName().equals(pinD0.getName())){
			setPinD0(pin);
		}
		else if(pin.getName().equals(pinD1.getName())){
			setPinD1(pin);
		}
		else if(pin.getName().equals(pinD2.getName())){
			setPinD2(pin);
		}
		else if(pin.getName().equals(pinD3.getName())){
			setPinD3(pin);
		}
		else if(pin.getName().equals(pinD4.getName())){
			setPinD4(pin);
		}
		else if(pin.getName().equals(pinD5.getName())){
			setPinD5(pin);
		}
		else if(pin.getName().equals(pinD6.getName())){
			setPinD6(pin);
		}
		else if(pin.getName().equals(pinD7.getName()))	{
			setPinD7(pin);
		}
		else if(pin.getName().equals(pinD8.getName())){
			setPinD8(pin);
		}
		else if(pin.getName().equals(pinD9.getName())){
			setPinD9(pin);
		}
		else if(pin.getName().equals(pinD10.getName())){
			setPinD10(pin);
		}
		else if(pin.getName().equals(pinD11.getName())){
			setPinD11(pin);
		}
		else if(pin.getName().equals(pinD12.getName())){
			setPinD12(pin);
		}
		else if(pin.getName().equals(pinD13.getName())){
			setPinD13(pin);
		}
	}

} //ArduinoWiFiESP8266WeMosD1Impl
