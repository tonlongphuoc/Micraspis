/**
 */
package iotwearable.model.iotw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CDS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iotwearable.model.iotw.CDS#getPinGND <em>Pin GND</em>}</li>
 *   <li>{@link iotwearable.model.iotw.CDS#getPinVcc <em>Pin Vcc</em>}</li>
 *   <li>{@link iotwearable.model.iotw.CDS#getPinD0 <em>Pin D0</em>}</li>
 * </ul>
 *
 * @see iotwearable.model.iotw.IotwPackage#getCDS()
 * @model
 * @generated
 */
public interface CDS extends InputDevice {
	/**
	 * Returns the value of the '<em><b>Pin GND</b></em>' attribute.
	 * The default value is <code>"GND,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin GND</em>' attribute.
	 * @see #setPinGND(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getCDS_PinGND()
	 * @model default="GND,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinGND();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.CDS#getPinGND <em>Pin GND</em>}' attribute.
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
	 * @see iotwearable.model.iotw.IotwPackage#getCDS_PinVcc()
	 * @model default="Vcc,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinVcc();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.CDS#getPinVcc <em>Pin Vcc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Vcc</em>' attribute.
	 * @see #getPinVcc()
	 * @generated
	 */
	void setPinVcc(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin D0</b></em>' attribute.
	 * The default value is <code>"D0,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin D0</em>' attribute.
	 * @see #setPinD0(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getCDS_PinD0()
	 * @model default="D0,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinD0();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.CDS#getPinD0 <em>Pin D0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin D0</em>' attribute.
	 * @see #getPinD0()
	 * @generated
	 */
	void setPinD0(Pin value);

} // CDS
