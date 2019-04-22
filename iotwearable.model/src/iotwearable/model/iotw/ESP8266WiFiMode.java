/**
 */
package iotwearable.model.iotw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ESP8266 Wi Fi Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iotwearable.model.iotw.IotwPackage#getESP8266WiFiMode()
 * @model
 * @generated
 */
public enum ESP8266WiFiMode implements Enumerator {
	/**
	 * The '<em><b>WIFI OFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_OFF_VALUE
	 * @generated
	 * @ordered
	 */
	WIFI_OFF(0, "WIFI_OFF", "WIFI_OFF"),

	/**
	 * The '<em><b>WIFI AP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_AP_VALUE
	 * @generated
	 * @ordered
	 */
	WIFI_AP(1, "WIFI_AP", "WIFI_AP"),

	/**
	 * The '<em><b>WIFI STA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_STA_VALUE
	 * @generated
	 * @ordered
	 */
	WIFI_STA(2, "WIFI_STA", "WIFI_STA"),

	/**
	 * The '<em><b>WIFI AP STA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_AP_STA_VALUE
	 * @generated
	 * @ordered
	 */
	WIFI_AP_STA(3, "WIFI_AP_STA", "WIFI_AP_STA");

	/**
	 * The '<em><b>WIFI OFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIFI OFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIFI_OFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIFI_OFF_VALUE = 0;

	/**
	 * The '<em><b>WIFI AP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIFI AP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIFI_AP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIFI_AP_VALUE = 1;

	/**
	 * The '<em><b>WIFI STA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIFI STA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIFI_STA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIFI_STA_VALUE = 2;

	/**
	 * The '<em><b>WIFI AP STA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIFI AP STA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIFI_AP_STA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIFI_AP_STA_VALUE = 3;

	/**
	 * An array of all the '<em><b>ESP8266 Wi Fi Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ESP8266WiFiMode[] VALUES_ARRAY =
		new ESP8266WiFiMode[] {
			WIFI_OFF,
			WIFI_AP,
			WIFI_STA,
			WIFI_AP_STA,
		};

	/**
	 * A public read-only list of all the '<em><b>ESP8266 Wi Fi Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ESP8266WiFiMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ESP8266 Wi Fi Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESP8266WiFiMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESP8266WiFiMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESP8266 Wi Fi Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESP8266WiFiMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESP8266WiFiMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESP8266 Wi Fi Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESP8266WiFiMode get(int value) {
		switch (value) {
			case WIFI_OFF_VALUE: return WIFI_OFF;
			case WIFI_AP_VALUE: return WIFI_AP;
			case WIFI_STA_VALUE: return WIFI_STA;
			case WIFI_AP_STA_VALUE: return WIFI_AP_STA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ESP8266WiFiMode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ESP8266WiFiMode
