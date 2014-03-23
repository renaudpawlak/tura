/**
 */
package domain.impl;

import domain.ArtificialField;
import domain.DataControl;
import domain.DomainPackage;
import domain.POSTCreateTrigger;
import domain.POSTQueryTrigger;
import domain.PREDeleteTrigger;
import domain.PREInsertTrigger;
import domain.PREQueryTrigger;
import domain.PREUpdateTrigger;
import domain.Trigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.DataControlImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.impl.DataControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.DataControlImpl#getPreQueryTrigger <em>Pre Query Trigger</em>}</li>
 *   <li>{@link domain.impl.DataControlImpl#getPostQueryTrigger <em>Post Query Trigger</em>}</li>
 *   <li>{@link domain.impl.DataControlImpl#getPreInsertTrigger <em>Pre Insert Trigger</em>}</li>
 *   <li>{@link domain.impl.DataControlImpl#getPreDeleteTrigger <em>Pre Delete Trigger</em>}</li>
 *   <li>{@link domain.impl.DataControlImpl#getPostCreateTrigger <em>Post Create Trigger</em>}</li>
 *   <li>{@link domain.impl.DataControlImpl#getPreUpdateTrigger <em>Pre Update Trigger</em>}</li>
 *   <li>{@link domain.impl.DataControlImpl#getArtificialFields <em>Artificial Fields</em>}</li>
 *   <li>{@link domain.impl.DataControlImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link domain.impl.DataControlImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link domain.impl.DataControlImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link domain.impl.DataControlImpl#getRemove <em>Remove</em>}</li>
 *   <li>{@link domain.impl.DataControlImpl#getSearch <em>Search</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataControlImpl extends TypePointerImpl implements DataControl
{
  /**
   * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUid()
   * @generated
   * @ordered
   */
  protected static final String UID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUid()
   * @generated
   * @ordered
   */
  protected String uid = UID_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPreQueryTrigger() <em>Pre Query Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreQueryTrigger()
   * @generated
   * @ordered
   */
  protected PREQueryTrigger preQueryTrigger;

  /**
   * The cached value of the '{@link #getPostQueryTrigger() <em>Post Query Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostQueryTrigger()
   * @generated
   * @ordered
   */
  protected POSTQueryTrigger postQueryTrigger;

  /**
   * The cached value of the '{@link #getPreInsertTrigger() <em>Pre Insert Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreInsertTrigger()
   * @generated
   * @ordered
   */
  protected PREInsertTrigger preInsertTrigger;

  /**
   * The cached value of the '{@link #getPreDeleteTrigger() <em>Pre Delete Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreDeleteTrigger()
   * @generated
   * @ordered
   */
  protected PREDeleteTrigger preDeleteTrigger;

  /**
   * The cached value of the '{@link #getPostCreateTrigger() <em>Post Create Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostCreateTrigger()
   * @generated
   * @ordered
   */
  protected POSTCreateTrigger postCreateTrigger;

  /**
   * The cached value of the '{@link #getPreUpdateTrigger() <em>Pre Update Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreUpdateTrigger()
   * @generated
   * @ordered
   */
  protected PREUpdateTrigger preUpdateTrigger;

  /**
   * The cached value of the '{@link #getArtificialFields() <em>Artificial Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtificialFields()
   * @generated
   * @ordered
   */
  protected EList<ArtificialField> artificialFields;

  /**
   * The cached value of the '{@link #getCreate() <em>Create</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreate()
   * @generated
   * @ordered
   */
  protected Trigger create;

  /**
   * The cached value of the '{@link #getInsert() <em>Insert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsert()
   * @generated
   * @ordered
   */
  protected Trigger insert;

  /**
   * The cached value of the '{@link #getUpdate() <em>Update</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdate()
   * @generated
   * @ordered
   */
  protected Trigger update;

  /**
   * The cached value of the '{@link #getRemove() <em>Remove</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemove()
   * @generated
   * @ordered
   */
  protected Trigger remove;

  /**
   * The cached value of the '{@link #getSearch() <em>Search</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearch()
   * @generated
   * @ordered
   */
  protected Trigger search;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataControlImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DomainPackage.Literals.DATA_CONTROL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUid()
  {
    return uid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUid(String newUid)
  {
    String oldUid = uid;
    uid = newUid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PREQueryTrigger getPreQueryTrigger()
  {
    return preQueryTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreQueryTrigger(PREQueryTrigger newPreQueryTrigger, NotificationChain msgs)
  {
    PREQueryTrigger oldPreQueryTrigger = preQueryTrigger;
    preQueryTrigger = newPreQueryTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__PRE_QUERY_TRIGGER, oldPreQueryTrigger, newPreQueryTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreQueryTrigger(PREQueryTrigger newPreQueryTrigger)
  {
    if (newPreQueryTrigger != preQueryTrigger)
    {
      NotificationChain msgs = null;
      if (preQueryTrigger != null)
        msgs = ((InternalEObject)preQueryTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__PRE_QUERY_TRIGGER, null, msgs);
      if (newPreQueryTrigger != null)
        msgs = ((InternalEObject)newPreQueryTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__PRE_QUERY_TRIGGER, null, msgs);
      msgs = basicSetPreQueryTrigger(newPreQueryTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__PRE_QUERY_TRIGGER, newPreQueryTrigger, newPreQueryTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POSTQueryTrigger getPostQueryTrigger()
  {
    return postQueryTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostQueryTrigger(POSTQueryTrigger newPostQueryTrigger, NotificationChain msgs)
  {
    POSTQueryTrigger oldPostQueryTrigger = postQueryTrigger;
    postQueryTrigger = newPostQueryTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__POST_QUERY_TRIGGER, oldPostQueryTrigger, newPostQueryTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostQueryTrigger(POSTQueryTrigger newPostQueryTrigger)
  {
    if (newPostQueryTrigger != postQueryTrigger)
    {
      NotificationChain msgs = null;
      if (postQueryTrigger != null)
        msgs = ((InternalEObject)postQueryTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__POST_QUERY_TRIGGER, null, msgs);
      if (newPostQueryTrigger != null)
        msgs = ((InternalEObject)newPostQueryTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__POST_QUERY_TRIGGER, null, msgs);
      msgs = basicSetPostQueryTrigger(newPostQueryTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__POST_QUERY_TRIGGER, newPostQueryTrigger, newPostQueryTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PREInsertTrigger getPreInsertTrigger()
  {
    return preInsertTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreInsertTrigger(PREInsertTrigger newPreInsertTrigger, NotificationChain msgs)
  {
    PREInsertTrigger oldPreInsertTrigger = preInsertTrigger;
    preInsertTrigger = newPreInsertTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__PRE_INSERT_TRIGGER, oldPreInsertTrigger, newPreInsertTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreInsertTrigger(PREInsertTrigger newPreInsertTrigger)
  {
    if (newPreInsertTrigger != preInsertTrigger)
    {
      NotificationChain msgs = null;
      if (preInsertTrigger != null)
        msgs = ((InternalEObject)preInsertTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__PRE_INSERT_TRIGGER, null, msgs);
      if (newPreInsertTrigger != null)
        msgs = ((InternalEObject)newPreInsertTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__PRE_INSERT_TRIGGER, null, msgs);
      msgs = basicSetPreInsertTrigger(newPreInsertTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__PRE_INSERT_TRIGGER, newPreInsertTrigger, newPreInsertTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PREDeleteTrigger getPreDeleteTrigger()
  {
    return preDeleteTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreDeleteTrigger(PREDeleteTrigger newPreDeleteTrigger, NotificationChain msgs)
  {
    PREDeleteTrigger oldPreDeleteTrigger = preDeleteTrigger;
    preDeleteTrigger = newPreDeleteTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__PRE_DELETE_TRIGGER, oldPreDeleteTrigger, newPreDeleteTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreDeleteTrigger(PREDeleteTrigger newPreDeleteTrigger)
  {
    if (newPreDeleteTrigger != preDeleteTrigger)
    {
      NotificationChain msgs = null;
      if (preDeleteTrigger != null)
        msgs = ((InternalEObject)preDeleteTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__PRE_DELETE_TRIGGER, null, msgs);
      if (newPreDeleteTrigger != null)
        msgs = ((InternalEObject)newPreDeleteTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__PRE_DELETE_TRIGGER, null, msgs);
      msgs = basicSetPreDeleteTrigger(newPreDeleteTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__PRE_DELETE_TRIGGER, newPreDeleteTrigger, newPreDeleteTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POSTCreateTrigger getPostCreateTrigger()
  {
    return postCreateTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostCreateTrigger(POSTCreateTrigger newPostCreateTrigger, NotificationChain msgs)
  {
    POSTCreateTrigger oldPostCreateTrigger = postCreateTrigger;
    postCreateTrigger = newPostCreateTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__POST_CREATE_TRIGGER, oldPostCreateTrigger, newPostCreateTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostCreateTrigger(POSTCreateTrigger newPostCreateTrigger)
  {
    if (newPostCreateTrigger != postCreateTrigger)
    {
      NotificationChain msgs = null;
      if (postCreateTrigger != null)
        msgs = ((InternalEObject)postCreateTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__POST_CREATE_TRIGGER, null, msgs);
      if (newPostCreateTrigger != null)
        msgs = ((InternalEObject)newPostCreateTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__POST_CREATE_TRIGGER, null, msgs);
      msgs = basicSetPostCreateTrigger(newPostCreateTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__POST_CREATE_TRIGGER, newPostCreateTrigger, newPostCreateTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PREUpdateTrigger getPreUpdateTrigger()
  {
    return preUpdateTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreUpdateTrigger(PREUpdateTrigger newPreUpdateTrigger, NotificationChain msgs)
  {
    PREUpdateTrigger oldPreUpdateTrigger = preUpdateTrigger;
    preUpdateTrigger = newPreUpdateTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER, oldPreUpdateTrigger, newPreUpdateTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreUpdateTrigger(PREUpdateTrigger newPreUpdateTrigger)
  {
    if (newPreUpdateTrigger != preUpdateTrigger)
    {
      NotificationChain msgs = null;
      if (preUpdateTrigger != null)
        msgs = ((InternalEObject)preUpdateTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER, null, msgs);
      if (newPreUpdateTrigger != null)
        msgs = ((InternalEObject)newPreUpdateTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER, null, msgs);
      msgs = basicSetPreUpdateTrigger(newPreUpdateTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER, newPreUpdateTrigger, newPreUpdateTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArtificialField> getArtificialFields()
  {
    if (artificialFields == null)
    {
      artificialFields = new EObjectContainmentEList<ArtificialField>(ArtificialField.class, this, DomainPackage.DATA_CONTROL__ARTIFICIAL_FIELDS);
    }
    return artificialFields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger getCreate()
  {
    return create;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreate(Trigger newCreate, NotificationChain msgs)
  {
    Trigger oldCreate = create;
    create = newCreate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__CREATE, oldCreate, newCreate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreate(Trigger newCreate)
  {
    if (newCreate != create)
    {
      NotificationChain msgs = null;
      if (create != null)
        msgs = ((InternalEObject)create).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__CREATE, null, msgs);
      if (newCreate != null)
        msgs = ((InternalEObject)newCreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__CREATE, null, msgs);
      msgs = basicSetCreate(newCreate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__CREATE, newCreate, newCreate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger getInsert()
  {
    return insert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInsert(Trigger newInsert, NotificationChain msgs)
  {
    Trigger oldInsert = insert;
    insert = newInsert;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__INSERT, oldInsert, newInsert);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInsert(Trigger newInsert)
  {
    if (newInsert != insert)
    {
      NotificationChain msgs = null;
      if (insert != null)
        msgs = ((InternalEObject)insert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__INSERT, null, msgs);
      if (newInsert != null)
        msgs = ((InternalEObject)newInsert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__INSERT, null, msgs);
      msgs = basicSetInsert(newInsert, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__INSERT, newInsert, newInsert));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger getUpdate()
  {
    return update;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpdate(Trigger newUpdate, NotificationChain msgs)
  {
    Trigger oldUpdate = update;
    update = newUpdate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__UPDATE, oldUpdate, newUpdate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdate(Trigger newUpdate)
  {
    if (newUpdate != update)
    {
      NotificationChain msgs = null;
      if (update != null)
        msgs = ((InternalEObject)update).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__UPDATE, null, msgs);
      if (newUpdate != null)
        msgs = ((InternalEObject)newUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__UPDATE, null, msgs);
      msgs = basicSetUpdate(newUpdate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__UPDATE, newUpdate, newUpdate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger getRemove()
  {
    return remove;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRemove(Trigger newRemove, NotificationChain msgs)
  {
    Trigger oldRemove = remove;
    remove = newRemove;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__REMOVE, oldRemove, newRemove);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemove(Trigger newRemove)
  {
    if (newRemove != remove)
    {
      NotificationChain msgs = null;
      if (remove != null)
        msgs = ((InternalEObject)remove).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__REMOVE, null, msgs);
      if (newRemove != null)
        msgs = ((InternalEObject)newRemove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__REMOVE, null, msgs);
      msgs = basicSetRemove(newRemove, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__REMOVE, newRemove, newRemove));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger getSearch()
  {
    return search;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearch(Trigger newSearch, NotificationChain msgs)
  {
    Trigger oldSearch = search;
    search = newSearch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__SEARCH, oldSearch, newSearch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearch(Trigger newSearch)
  {
    if (newSearch != search)
    {
      NotificationChain msgs = null;
      if (search != null)
        msgs = ((InternalEObject)search).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__SEARCH, null, msgs);
      if (newSearch != null)
        msgs = ((InternalEObject)newSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DATA_CONTROL__SEARCH, null, msgs);
      msgs = basicSetSearch(newSearch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATA_CONTROL__SEARCH, newSearch, newSearch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.DATA_CONTROL__PRE_QUERY_TRIGGER:
        return basicSetPreQueryTrigger(null, msgs);
      case DomainPackage.DATA_CONTROL__POST_QUERY_TRIGGER:
        return basicSetPostQueryTrigger(null, msgs);
      case DomainPackage.DATA_CONTROL__PRE_INSERT_TRIGGER:
        return basicSetPreInsertTrigger(null, msgs);
      case DomainPackage.DATA_CONTROL__PRE_DELETE_TRIGGER:
        return basicSetPreDeleteTrigger(null, msgs);
      case DomainPackage.DATA_CONTROL__POST_CREATE_TRIGGER:
        return basicSetPostCreateTrigger(null, msgs);
      case DomainPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER:
        return basicSetPreUpdateTrigger(null, msgs);
      case DomainPackage.DATA_CONTROL__ARTIFICIAL_FIELDS:
        return ((InternalEList<?>)getArtificialFields()).basicRemove(otherEnd, msgs);
      case DomainPackage.DATA_CONTROL__CREATE:
        return basicSetCreate(null, msgs);
      case DomainPackage.DATA_CONTROL__INSERT:
        return basicSetInsert(null, msgs);
      case DomainPackage.DATA_CONTROL__UPDATE:
        return basicSetUpdate(null, msgs);
      case DomainPackage.DATA_CONTROL__REMOVE:
        return basicSetRemove(null, msgs);
      case DomainPackage.DATA_CONTROL__SEARCH:
        return basicSetSearch(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainPackage.DATA_CONTROL__UID:
        return getUid();
      case DomainPackage.DATA_CONTROL__NAME:
        return getName();
      case DomainPackage.DATA_CONTROL__PRE_QUERY_TRIGGER:
        return getPreQueryTrigger();
      case DomainPackage.DATA_CONTROL__POST_QUERY_TRIGGER:
        return getPostQueryTrigger();
      case DomainPackage.DATA_CONTROL__PRE_INSERT_TRIGGER:
        return getPreInsertTrigger();
      case DomainPackage.DATA_CONTROL__PRE_DELETE_TRIGGER:
        return getPreDeleteTrigger();
      case DomainPackage.DATA_CONTROL__POST_CREATE_TRIGGER:
        return getPostCreateTrigger();
      case DomainPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER:
        return getPreUpdateTrigger();
      case DomainPackage.DATA_CONTROL__ARTIFICIAL_FIELDS:
        return getArtificialFields();
      case DomainPackage.DATA_CONTROL__CREATE:
        return getCreate();
      case DomainPackage.DATA_CONTROL__INSERT:
        return getInsert();
      case DomainPackage.DATA_CONTROL__UPDATE:
        return getUpdate();
      case DomainPackage.DATA_CONTROL__REMOVE:
        return getRemove();
      case DomainPackage.DATA_CONTROL__SEARCH:
        return getSearch();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainPackage.DATA_CONTROL__UID:
        setUid((String)newValue);
        return;
      case DomainPackage.DATA_CONTROL__NAME:
        setName((String)newValue);
        return;
      case DomainPackage.DATA_CONTROL__PRE_QUERY_TRIGGER:
        setPreQueryTrigger((PREQueryTrigger)newValue);
        return;
      case DomainPackage.DATA_CONTROL__POST_QUERY_TRIGGER:
        setPostQueryTrigger((POSTQueryTrigger)newValue);
        return;
      case DomainPackage.DATA_CONTROL__PRE_INSERT_TRIGGER:
        setPreInsertTrigger((PREInsertTrigger)newValue);
        return;
      case DomainPackage.DATA_CONTROL__PRE_DELETE_TRIGGER:
        setPreDeleteTrigger((PREDeleteTrigger)newValue);
        return;
      case DomainPackage.DATA_CONTROL__POST_CREATE_TRIGGER:
        setPostCreateTrigger((POSTCreateTrigger)newValue);
        return;
      case DomainPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER:
        setPreUpdateTrigger((PREUpdateTrigger)newValue);
        return;
      case DomainPackage.DATA_CONTROL__ARTIFICIAL_FIELDS:
        getArtificialFields().clear();
        getArtificialFields().addAll((Collection<? extends ArtificialField>)newValue);
        return;
      case DomainPackage.DATA_CONTROL__CREATE:
        setCreate((Trigger)newValue);
        return;
      case DomainPackage.DATA_CONTROL__INSERT:
        setInsert((Trigger)newValue);
        return;
      case DomainPackage.DATA_CONTROL__UPDATE:
        setUpdate((Trigger)newValue);
        return;
      case DomainPackage.DATA_CONTROL__REMOVE:
        setRemove((Trigger)newValue);
        return;
      case DomainPackage.DATA_CONTROL__SEARCH:
        setSearch((Trigger)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainPackage.DATA_CONTROL__UID:
        setUid(UID_EDEFAULT);
        return;
      case DomainPackage.DATA_CONTROL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainPackage.DATA_CONTROL__PRE_QUERY_TRIGGER:
        setPreQueryTrigger((PREQueryTrigger)null);
        return;
      case DomainPackage.DATA_CONTROL__POST_QUERY_TRIGGER:
        setPostQueryTrigger((POSTQueryTrigger)null);
        return;
      case DomainPackage.DATA_CONTROL__PRE_INSERT_TRIGGER:
        setPreInsertTrigger((PREInsertTrigger)null);
        return;
      case DomainPackage.DATA_CONTROL__PRE_DELETE_TRIGGER:
        setPreDeleteTrigger((PREDeleteTrigger)null);
        return;
      case DomainPackage.DATA_CONTROL__POST_CREATE_TRIGGER:
        setPostCreateTrigger((POSTCreateTrigger)null);
        return;
      case DomainPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER:
        setPreUpdateTrigger((PREUpdateTrigger)null);
        return;
      case DomainPackage.DATA_CONTROL__ARTIFICIAL_FIELDS:
        getArtificialFields().clear();
        return;
      case DomainPackage.DATA_CONTROL__CREATE:
        setCreate((Trigger)null);
        return;
      case DomainPackage.DATA_CONTROL__INSERT:
        setInsert((Trigger)null);
        return;
      case DomainPackage.DATA_CONTROL__UPDATE:
        setUpdate((Trigger)null);
        return;
      case DomainPackage.DATA_CONTROL__REMOVE:
        setRemove((Trigger)null);
        return;
      case DomainPackage.DATA_CONTROL__SEARCH:
        setSearch((Trigger)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainPackage.DATA_CONTROL__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case DomainPackage.DATA_CONTROL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainPackage.DATA_CONTROL__PRE_QUERY_TRIGGER:
        return preQueryTrigger != null;
      case DomainPackage.DATA_CONTROL__POST_QUERY_TRIGGER:
        return postQueryTrigger != null;
      case DomainPackage.DATA_CONTROL__PRE_INSERT_TRIGGER:
        return preInsertTrigger != null;
      case DomainPackage.DATA_CONTROL__PRE_DELETE_TRIGGER:
        return preDeleteTrigger != null;
      case DomainPackage.DATA_CONTROL__POST_CREATE_TRIGGER:
        return postCreateTrigger != null;
      case DomainPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER:
        return preUpdateTrigger != null;
      case DomainPackage.DATA_CONTROL__ARTIFICIAL_FIELDS:
        return artificialFields != null && !artificialFields.isEmpty();
      case DomainPackage.DATA_CONTROL__CREATE:
        return create != null;
      case DomainPackage.DATA_CONTROL__INSERT:
        return insert != null;
      case DomainPackage.DATA_CONTROL__UPDATE:
        return update != null;
      case DomainPackage.DATA_CONTROL__REMOVE:
        return remove != null;
      case DomainPackage.DATA_CONTROL__SEARCH:
        return search != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (uid: ");
    result.append(uid);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DataControlImpl
