/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code.impl;

import java.util.Collection;

import kdm.code.AbstractCodeElement;
import kdm.code.CodePackage;
import kdm.code.Includes;
import kdm.code.PreprocessorDirective;

import kdm.core.impl.ElementImpl;

import kdm.kdm.ExtendedValue;
import kdm.kdm.Stereotype;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Includes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.code.impl.IncludesImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.code.impl.IncludesImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.code.impl.IncludesImpl#getTo <em>To</em>}</li>
 *   <li>{@link kdm.code.impl.IncludesImpl#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludesImpl extends ElementImpl implements Includes {
	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected EList<Stereotype> stereotype;

	/**
	 * The cached value of the '{@link #getTaggedValue() <em>Tagged Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedValue> taggedValue;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected AbstractCodeElement to;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected PreprocessorDirective from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.INCLUDES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, CodePackage.INCLUDES__STEREOTYPE);
		}
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedValue> getTaggedValue() {
		if (taggedValue == null) {
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, CodePackage.INCLUDES__TAGGED_VALUE);
		}
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCodeElement getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (AbstractCodeElement)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.INCLUDES__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCodeElement basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(AbstractCodeElement newTo) {
		AbstractCodeElement oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.INCLUDES__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessorDirective getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (PreprocessorDirective)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.INCLUDES__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessorDirective basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(PreprocessorDirective newFrom) {
		PreprocessorDirective oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.INCLUDES__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodePackage.INCLUDES__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.INCLUDES__STEREOTYPE:
				return getStereotype();
			case CodePackage.INCLUDES__TAGGED_VALUE:
				return getTaggedValue();
			case CodePackage.INCLUDES__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case CodePackage.INCLUDES__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodePackage.INCLUDES__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case CodePackage.INCLUDES__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case CodePackage.INCLUDES__TO:
				setTo((AbstractCodeElement)newValue);
				return;
			case CodePackage.INCLUDES__FROM:
				setFrom((PreprocessorDirective)newValue);
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
			case CodePackage.INCLUDES__STEREOTYPE:
				getStereotype().clear();
				return;
			case CodePackage.INCLUDES__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case CodePackage.INCLUDES__TO:
				setTo((AbstractCodeElement)null);
				return;
			case CodePackage.INCLUDES__FROM:
				setFrom((PreprocessorDirective)null);
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
			case CodePackage.INCLUDES__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case CodePackage.INCLUDES__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case CodePackage.INCLUDES__TO:
				return to != null;
			case CodePackage.INCLUDES__FROM:
				return from != null;
		}
		return super.eIsSet(featureID);
	}

} //IncludesImpl
