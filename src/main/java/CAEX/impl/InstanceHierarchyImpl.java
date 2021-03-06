/*******************************************************************************
 * Copyright (c) 2015 Business Informatics Group at TU Wien
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Manuel Wimmer and Emanuel Maetzler
 *******************************************************************************/
/**
 */
package CAEX.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import CAEX.CAEXPackage;
import CAEX.InstanceHierarchy;
import CAEX.InternalElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CAEX.impl.InstanceHierarchyImpl#getInternalElement <em>Internal Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceHierarchyImpl extends CAEXObjectImpl implements InstanceHierarchy {
	/**
	 * The cached value of the '{@link #getInternalElement() <em>Internal Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalElement()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalElement> internalElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceHierarchyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.INSTANCE_HIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalElement> getInternalElement() {
		if (internalElement == null) {
			internalElement = new EObjectContainmentEList<InternalElement>(InternalElement.class, this, CAEXPackage.INSTANCE_HIERARCHY__INTERNAL_ELEMENT);
		}
		return internalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEXPackage.INSTANCE_HIERARCHY__INTERNAL_ELEMENT:
				return ((InternalEList<?>)getInternalElement()).basicRemove(otherEnd, msgs);
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
			case CAEXPackage.INSTANCE_HIERARCHY__INTERNAL_ELEMENT:
				return getInternalElement();
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
			case CAEXPackage.INSTANCE_HIERARCHY__INTERNAL_ELEMENT:
				getInternalElement().clear();
				getInternalElement().addAll((Collection<? extends InternalElement>)newValue);
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
			case CAEXPackage.INSTANCE_HIERARCHY__INTERNAL_ELEMENT:
				getInternalElement().clear();
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
			case CAEXPackage.INSTANCE_HIERARCHY__INTERNAL_ELEMENT:
				return internalElement != null && !internalElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstanceHierarchyImpl
