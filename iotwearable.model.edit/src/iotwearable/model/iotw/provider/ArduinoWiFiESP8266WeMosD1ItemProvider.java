/**
 */
package iotwearable.model.iotw.provider;


import iotwearable.model.iotw.ArduinoWiFiESP8266WeMosD1;
import iotwearable.model.iotw.IotwPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iotwearable.model.iotw.ArduinoWiFiESP8266WeMosD1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoWiFiESP8266WeMosD1ItemProvider extends MainboardItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoWiFiESP8266WeMosD1ItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPinA0PropertyDescriptor(object);
			addPinD0PropertyDescriptor(object);
			addPinD1PropertyDescriptor(object);
			addPinD2PropertyDescriptor(object);
			addPinD3PropertyDescriptor(object);
			addPinD4PropertyDescriptor(object);
			addPinD5PropertyDescriptor(object);
			addPinD6PropertyDescriptor(object);
			addPinD7PropertyDescriptor(object);
			addPinD8PropertyDescriptor(object);
			addPinD9PropertyDescriptor(object);
			addPinD10PropertyDescriptor(object);
			addPinD11PropertyDescriptor(object);
			addPinD12PropertyDescriptor(object);
			addPinD13PropertyDescriptor(object);
			addWifiModePropertyDescriptor(object);
			addSsidPropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addIpPropertyDescriptor(object);
			addDnsPropertyDescriptor(object);
			addGatewayPropertyDescriptor(object);
			addSubnetPropertyDescriptor(object);
			addBaudPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pin A0 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinA0PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinA0_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinA0_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_A0,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D0 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD0PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD0_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD0_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D0,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD1_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD2_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD3_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD4_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D5 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD5PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD5_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD5_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D5,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D6 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD6PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD6_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD6_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D6,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D7 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD7PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD7_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD7_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D7,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D8 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD8PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD8_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD8_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D8,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D9 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD9PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD9_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD9_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D9,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D10 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD10PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD10_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD10_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D10,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D11 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD11PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD11_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD11_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D11,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD12_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D12,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pin D13 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinD13PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_pinD13_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_pinD13_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D13,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wifi Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWifiModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_wifiMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_wifiMode_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__WIFI_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ssid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSsidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_ssid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_ssid_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SSID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_password_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_ip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_ip_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_dns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_dns_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__DNS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gateway feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGatewayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_gateway_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_gateway_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__GATEWAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subnet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubnetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_subnet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_subnet_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SUBNET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Baud feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaudPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArduinoWiFiESP8266WeMosD1_baud_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArduinoWiFiESP8266WeMosD1_baud_feature", "_UI_ArduinoWiFiESP8266WeMosD1_type"),
				 IotwPackage.Literals.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__BAUD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ArduinoWiFiESP8266WeMosD1.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArduinoWiFiESP8266WeMosD1"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArduinoWiFiESP8266WeMosD1)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ArduinoWiFiESP8266WeMosD1_type") :
			getString("_UI_ArduinoWiFiESP8266WeMosD1_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ArduinoWiFiESP8266WeMosD1.class)) {
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_A0:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D0:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D1:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D2:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D3:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D4:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D5:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D6:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D7:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D8:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D9:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D10:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D11:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D12:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PIN_D13:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__WIFI_MODE:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SSID:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__PASSWORD:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__IP:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__DNS:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__GATEWAY:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__SUBNET:
			case IotwPackage.ARDUINO_WI_FI_ESP8266_WE_MOS_D1__BAUD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
