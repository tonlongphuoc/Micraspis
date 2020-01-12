/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.LM35;
import iotwearable.model.iotw.Pin;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LM35</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.LM35Impl#getPin1 <em>Pin1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LM35Impl extends InputDeviceImpl implements LM35 {
	/**
	 * The default value of the '{@link #getPin1() <em>Pin1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin1()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN1_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "1,IO");

	/**
	 * The cached value of the '{@link #getPin1() <em>Pin1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin1()
	 * @generated
	 * @ordered
	 */
	protected Pin pin1 = PIN1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected LM35Impl() {
		super();
		this.name = "LM35";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.LM35;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getPin1() {
		return pin1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPin1(Pin newPin1) {
		Pin oldPin1 = pin1;
		pin1 = newPin1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.LM35__PIN1, oldPin1, pin1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.LM35__PIN1:
				return getPin1();
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
			case IotwPackage.LM35__PIN1:
				setPin1((Pin)newValue);
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
			case IotwPackage.LM35__PIN1:
				setPin1(PIN1_EDEFAULT);
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
			case IotwPackage.LM35__PIN1:
				return PIN1_EDEFAULT == null ? pin1 != null : !PIN1_EDEFAULT.equals(pin1);
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
		result.append(" (pin1: ");
		result.append(pin1);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public EList<Pin> getPins() {
		EList<Pin> pins = new BasicEList<Pin>();
		pins.add(pin1);
		return pins;
	}
	
	@Override
	public void modifyPin(Pin pin) {
		if(pin.getName().equals(pin1.getName())){
			setPin1(pin);
		}
	}

} //LM35Impl
