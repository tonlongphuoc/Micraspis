/**
 */
package iotwearable.model.iotw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DHT11</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iotwearable.model.iotw.DHT11#getPinGND <em>Pin GND</em>}</li>
 *   <li>{@link iotwearable.model.iotw.DHT11#getPinVcc <em>Pin Vcc</em>}</li>
 *   <li>{@link iotwearable.model.iotw.DHT11#getPinData <em>Pin Data</em>}</li>
 * </ul>
 *
 * @see iotwearable.model.iotw.IotwPackage#getDHT11()
 * @model
 * @generated
 */
public interface DHT11 extends InputDevice {
	/**
	 * Returns the value of the '<em><b>Pin GND</b></em>' attribute.
	 * The default value is <code>"GND,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin GND</em>' attribute.
	 * @see #setPinGND(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getDHT11_PinGND()
	 * @model default="GND,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinGND();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.DHT11#getPinGND <em>Pin GND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin GND</em>' attribute.
	 * @see #getPinGND()
	 * @generated
	 */
	void setPinGND(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin Vcc</b></em>' attribute.
	 * The default value is <code>"Vcc,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Vcc</em>' attribute.
	 * @see #setPinVcc(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getDHT11_PinVcc()
	 * @model default="Vcc,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinVcc();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.DHT11#getPinVcc <em>Pin Vcc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Vcc</em>' attribute.
	 * @see #getPinVcc()
	 * @generated
	 */
	void setPinVcc(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin Data</b></em>' attribute.
	 * The default value is <code>"Data,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Data</em>' attribute.
	 * @see #setPinData(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getDHT11_PinData()
	 * @model default="Data,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinData();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.DHT11#getPinData <em>Pin Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Data</em>' attribute.
	 * @see #getPinData()
	 * @generated
	 */
	void setPinData(Pin value);

} // DHT11
