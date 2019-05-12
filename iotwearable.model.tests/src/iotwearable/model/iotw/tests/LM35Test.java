/**
 */
package iotwearable.model.iotw.tests;

import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.LM35;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>LM35</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LM35Test extends InputDeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LM35Test.class);
	}

	/**
	 * Constructs a new LM35 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LM35Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this LM35 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LM35 getFixture() {
		return (LM35)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IotwFactory.eINSTANCE.createLM35());
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

} //LM35Test
