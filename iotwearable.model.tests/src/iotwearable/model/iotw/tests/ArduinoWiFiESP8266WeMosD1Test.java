/**
 */
package iotwearable.model.iotw.tests;

import iotwearable.model.iotw.ArduinoWiFiESP8266WeMosD1;
import iotwearable.model.iotw.IotwFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arduino Wi Fi ESP8266 We Mos D1</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoWiFiESP8266WeMosD1Test extends MainboardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArduinoWiFiESP8266WeMosD1Test.class);
	}

	/**
	 * Constructs a new Arduino Wi Fi ESP8266 We Mos D1 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoWiFiESP8266WeMosD1Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Arduino Wi Fi ESP8266 We Mos D1 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArduinoWiFiESP8266WeMosD1 getFixture() {
		return (ArduinoWiFiESP8266WeMosD1)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IotwFactory.eINSTANCE.createArduinoWiFiESP8266WeMosD1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ArduinoWiFiESP8266WeMosD1Test
