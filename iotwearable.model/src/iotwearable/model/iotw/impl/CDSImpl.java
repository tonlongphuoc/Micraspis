/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.CDS;
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
 * An implementation of the model object '<em><b>CDS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.CDSImpl#getPinGND <em>Pin GND</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.CDSImpl#getPinVcc <em>Pin Vcc</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.CDSImpl#getPinD0 <em>Pin D0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDSImpl extends InputDeviceImpl implements CDS {
	/**
	 * The default value of the '{@link #getPinGND() <em>Pin GND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinGND()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_GND_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "GND,IO");

	/**
	 * The cached value of the '{@link #getPinGND() <em>Pin GND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinGND()
	 * @generated
	 * @ordered
	 */
	protected Pin pinGND = PIN_GND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinVcc() <em>Pin Vcc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinVcc()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_VCC_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "Vcc,IO");

	/**
	 * The cached value of the '{@link #getPinVcc() <em>Pin Vcc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinVcc()
	 * @generated
	 * @ordered
	 */
	protected Pin pinVcc = PIN_VCC_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected CDSImpl() {
		super();
		this.name ="CDS";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.CDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinGND() {
		return pinGND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinGND(Pin newPinGND) {
		Pin oldPinGND = pinGND;
		pinGND = newPinGND;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.CDS__PIN_GND, oldPinGND, pinGND));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPinVcc() {
		return pinVcc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinVcc(Pin newPinVcc) {
		Pin oldPinVcc = pinVcc;
		pinVcc = newPinVcc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.CDS__PIN_VCC, oldPinVcc, pinVcc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.CDS__PIN_D0, oldPinD0, pinD0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.CDS__PIN_GND:
				return getPinGND();
			case IotwPackage.CDS__PIN_VCC:
				return getPinVcc();
			case IotwPackage.CDS__PIN_D0:
				return getPinD0();
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
			case IotwPackage.CDS__PIN_GND:
				setPinGND((Pin)newValue);
				return;
			case IotwPackage.CDS__PIN_VCC:
				setPinVcc((Pin)newValue);
				return;
			case IotwPackage.CDS__PIN_D0:
				setPinD0((Pin)newValue);
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
			case IotwPackage.CDS__PIN_GND:
				setPinGND(PIN_GND_EDEFAULT);
				return;
			case IotwPackage.CDS__PIN_VCC:
				setPinVcc(PIN_VCC_EDEFAULT);
				return;
			case IotwPackage.CDS__PIN_D0:
				setPinD0(PIN_D0_EDEFAULT);
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
			case IotwPackage.CDS__PIN_GND:
				return PIN_GND_EDEFAULT == null ? pinGND != null : !PIN_GND_EDEFAULT.equals(pinGND);
			case IotwPackage.CDS__PIN_VCC:
				return PIN_VCC_EDEFAULT == null ? pinVcc != null : !PIN_VCC_EDEFAULT.equals(pinVcc);
			case IotwPackage.CDS__PIN_D0:
				return PIN_D0_EDEFAULT == null ? pinD0 != null : !PIN_D0_EDEFAULT.equals(pinD0);
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
		result.append(" (pinGND: ");
		result.append(pinGND);
		result.append(", pinVcc: ");
		result.append(pinVcc);
		result.append(", pinD0: ");
		result.append(pinD0);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public EList<Pin> getPins() {
		EList<Pin> pins = new BasicEList<Pin>();
		pins.add(pinGND);
		pins.add(pinVcc);
		pins.add(pinD0);
		return pins;
	}
	
	@Override
	public void modifyPin(Pin pin) {
		if(pin.getName().equals(pinGND.getName())){
			setPinGND(pin);
		}
		else if(pin.getName().equals(pinVcc.getName())){
			setPinVcc(pin);
		}
		else if(pin.getName().equals(pinD0.getName())) {
			setPinD0(pin);
		}
	}

} //CDSImpl
