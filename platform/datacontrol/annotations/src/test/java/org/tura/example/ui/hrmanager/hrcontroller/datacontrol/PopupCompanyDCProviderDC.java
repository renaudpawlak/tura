package org.tura.example.ui.hrmanager.hrcontroller.datacontrol;

import org.elsoft.platform.hr.objects.CompanyDAO;

import org.tura.platform.commons.jpa.TuraJPAEntityService;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.DataControlFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.annotations.ArtificialFields;
import org.tura.platform.datacontrol.annotations.Base;
import org.tura.platform.datacontrol.annotations.Create;
import org.tura.platform.datacontrol.annotations.DefaultOrderBys;
import org.tura.platform.datacontrol.annotations.DefaultSearchCriteria;
import org.tura.platform.datacontrol.annotations.DefaultSearchCriterias;
import org.tura.platform.datacontrol.annotations.Delete;
import org.tura.platform.datacontrol.annotations.Insert;
import org.tura.platform.datacontrol.annotations.Key;
import org.tura.platform.datacontrol.annotations.Keys;
import org.tura.platform.datacontrol.annotations.Parameter;
import org.tura.platform.datacontrol.annotations.Parameters;
import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.PreDelete;
import org.tura.platform.datacontrol.annotations.PreInsert;
import org.tura.platform.datacontrol.annotations.PreQuery;
import org.tura.platform.datacontrol.annotations.PreUpdate;
import org.tura.platform.datacontrol.annotations.Query;
import org.tura.platform.datacontrol.annotations.Search;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.annotations.Update;
import org.tura.platform.datacontrol.command.CreateCommand;
import org.tura.platform.datacontrol.command.DeleteCommand;
import org.tura.platform.datacontrol.command.InsertCommand;
import org.tura.platform.datacontrol.command.PostCreateTrigger;
import org.tura.platform.datacontrol.command.PostQueryTrigger;
import org.tura.platform.datacontrol.command.PreDeleteTrigger;
import org.tura.platform.datacontrol.command.PreInsertTrigger;
import org.tura.platform.datacontrol.command.PreQueryTrigger;
import org.tura.platform.datacontrol.command.PreUpdateTrigger;
import org.tura.platform.datacontrol.command.SearchCommand;
import org.tura.platform.datacontrol.command.UpdateCommand;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;
import org.tura.platform.datacontrol.shift.ShiftControl;
import org.tura.platform.persistence.TuraObject;

import java.io.Serializable;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import javax.inject.Inject;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.SelectQuery;

public class PopupCompanyDCProviderDC extends DataControl<CompanyDAO>
    implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private transient Logger logger;
    @Inject
    private TuraJPAEntityService provider_0;
    private IDataControl saveTreeContex;

    public PopupCompanyDCProviderDC() throws Exception {
        super();

    }

    @PostConstruct
    public void init() {
        try {
            setBaseClass(CompanyDAO.class);

            this.createCommand.setProvider(provider_0);
            this.createCommand.setDatacontrol(this);

            this.insertCommand.setProvider(provider_0);
            this.insertCommand.setDatacontrol(this);

            this.updateCommand.setProvider(provider_0);
            this.updateCommand.setDatacontrol(this);

            this.deleteCommand.setProvider(provider_0);
            this.deleteCommand.setDatacontrol(this);

            this.searchCommand.setProvider(provider_0);
            this.searchCommand.setDatacontrol(this);
            DataControlFactory.buildConnection(this);
        } catch (Exception e) {
            logger.fine(e.getMessage());
        }
    }

    @Inject
    public void setKeys(
        @Keys(fields =  {
        @Key(field = "objId")

    }
    )
    List<String> keys) {
        this.keys = keys;
    }

    @Inject
    public void setArtificialProperties(
        @ArtificialFields(fields =  {
    }
    )
    List<ArtificialProperty> properties) {
        this.artificialProperties = properties;
    }

    @Override
    @Inject
    public void setElResolver(ELResolver elResolver) {
        this.elResolver = elResolver;
    }

    @Inject
    public void setCommandStack(
        @Selector("hrmanager.hrcontroller")
    CommandStack commandStack) {
        this.commandStack = commandStack;
    }

    @Override
    @Inject
    public void setCreateCommand(
        @Create(objectAction = "create", parameters = @Parameters(value =  {
        @Parameter(name = "objectClass", value = "org.elsoft.platform.hr.objects.CompanyDAO", type = String.class)

    }
    )
    )
    CreateCommand createCommand) {
        this.createCommand = createCommand;
    }

    @Override
    @Inject
    public void setInsertCommand(
        @Insert(objectAction = "insert", parameters = @Parameters(value =  {
        @Parameter(name = "obj", expression = "#{beanFactoryHrManagerHRController.popupCompanyDCProvider.currentObject}", type = TuraObject.class)

    }
    )
    )
    InsertCommand insertCommand) {
        this.insertCommand = insertCommand;
    }

    @Override
    @Inject
    public void setUpdateCommand(
        @Update(objectAction = "update", parameters = @Parameters(value =  {
        @Parameter(name = "obj", expression = "#{beanFactoryHrManagerHRController.popupCompanyDCProvider.currentObject}", type = TuraObject.class)

    }
    )
    )
    UpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
    }

    @Override
    @Inject
    public void setDeleteCommand(
        @Delete(objectAction = "remove", parameters = @Parameters(value =  {
        @Parameter(name = "obj", expression = "#{beanFactoryHrManagerHRController.popupCompanyDCProvider.currentObject}", type = TuraObject.class)

    }
    )
    )
    DeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
    }

    @Override
    @Inject
    public void setSearchCommand(
        @Search(objectAction = "find", parameters = @Parameters(value =  {
        @Parameter(name = "search", expression = "#{beanFactoryHrManagerHRController.popupCompanyDCProvider.query}", type = SelectQuery.class)
        , @Parameter(name = "startIndex", expression = "#{beanFactoryHrManagerHRController.popupCompanyDCProvider.startIndex}", type = Integer.class)
        , @Parameter(name = "endIndex", expression = "#{beanFactoryHrManagerHRController.popupCompanyDCProvider.endIndex}", type = Integer.class)
        , @Parameter(name = "className", value = "org.elsoft.platform.hr.objects.CompanyDAO", type = String.class)

    }
    )
    )
    SearchCommand searchCommand) {
        this.searchCommand = searchCommand;
    }

    @Override
    @Inject
    public void setPreQueryTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreQuery("popupCompanyDCProvider")
    PreQueryTrigger preQueryTrigger) {
        this.preQueryTrigger = preQueryTrigger;
    }

    @Override
    @Inject
    public void setPostQueryTrigger(
        @Selector("hrmanager.hrcontroller")
    @PostQuery("popupCompanyDCProvider")
    PostQueryTrigger postQueryTrigger) {
        this.postQueryTrigger = postQueryTrigger;
    }

    @Override
    @Inject
    public void setPostCreateTrigger(
        @Selector("hrmanager.hrcontroller")
    @PostCreate("popupCompanyDCProvider")
    PostCreateTrigger postCreateTrigger) {
        this.postCreateTrigger = postCreateTrigger;
    }

    @Override
    @Inject
    public void setPreDeleteTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreDelete("popupCompanyDCProvider")
    PreDeleteTrigger preDeleteTrigger) {
        this.preDeleteTrigger = preDeleteTrigger;
    }

    @Override
    @Inject
    public void setPreInsertTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreInsert("popupCompanyDCProvider")
    PreInsertTrigger preInsertTrigger) {
        this.preInsertTrigger = preInsertTrigger;
    }

    @Override
    @Inject
    public void setPreUpdateTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreUpdate("popupCompanyDCProvider")
    PreUpdateTrigger preUpdateTrigger) {
        this.preUpdateTrigger = preUpdateTrigger;
    }

    @Override
    public void createChild(String relName)
        throws org.tura.platform.datacontrol.commons.TuraException {
    }

    @Override
    @Inject
    public void setDefaultQuery(
        @Query(base = @Base(clazz = CompanyDAO.class)
    , search = @DefaultSearchCriterias(criterias =  {
        @DefaultSearchCriteria(field = "objId", comparator = Operator.EQ, expression = "#{beanFactoryHrManagerHRController.cmpId}", type = Long.class)

    }
    )
    , orders = @DefaultOrderBys(orders =  {
    }
    )
    )
    SelectQuery selectQuery) {
        this.defaultQuery = selectQuery;
    }

    private void saveState() {
        if (this.getTreeContext() != null) {
            saveTreeContex = this.getTreeContext().getCurrentControl();
            this.getTreeContext().setCurrentControl(this);
        }
    }

    private void restoreState() {
        if (saveTreeContex != null) {
            this.getTreeContext().setCurrentControl(saveTreeContex);
        }
    }

    private Object restoreState(Object obj) {
        if (saveTreeContex != null) {
            this.getTreeContext().setCurrentControl(saveTreeContex);
        }
        return obj;
    }

    @Override
    public void forceRefresh() throws TuraException {
        saveState();
        super.forceRefresh();
        restoreState();
    }

    @Override
    public void handleChangeMusterCurrentRecordNotification(
        Object newCurrentObject) throws TuraException {
        saveState();
        super.handleChangeMusterCurrentRecordNotification(newCurrentObject);
        restoreState();
    }

    @Override
    public void notifyLiteners(Event event) throws TuraException {
        saveState();
        super.notifyLiteners(event);
        restoreState();
    }

    @Override
    public CompanyDAO getCurrentObject() throws TuraException {
        saveState();
        return (CompanyDAO) restoreState(super.getCurrentObject());
    }

    @Override
    public boolean hasNext() throws TuraException {
        saveState();
        return (boolean) restoreState(super.hasNext());
    }

    @Override
    public void nextObject() throws TuraException {
        saveState();
        super.nextObject();
        restoreState();
    }

    @Override
    public boolean hasPrev() {
        saveState();
        return (boolean) restoreState(super.hasPrev());
    }

    @Override
    public void prevObject() throws TuraException {
        saveState();
        super.prevObject();
        restoreState();
    }

    @Override
    public void removeObject() throws Exception {
        saveState();
        super.removeObject();
        restoreState();
    }

    @Override
    public String getObjectKey(Object object) throws TuraException {
        saveState();
        return (String) restoreState(super.getObjectKey(object));
    }

    @Override
    public void removeAll() throws Exception {
        saveState();
        super.removeAll();
        restoreState();
    }

    @Override
    public CompanyDAO createObject() throws TuraException {
        saveState();
        return (CompanyDAO) restoreState(super.createObject());
    }

    @Override
    public Integer getCurrentPosition() {
        saveState();
        return (Integer) restoreState(super.getCurrentPosition());
    }

    @Override
    public boolean setCurrentPosition(Object crtPosition) throws TuraException {
        saveState();
        return (boolean) restoreState(super.setCurrentPosition(crtPosition));
    }

    @Override
    public SelectQuery getQuery() {
        saveState();
        return (SelectQuery) restoreState(super.getQuery());
    }

    @Override
    public void cleanShifter()
        throws org.tura.platform.datacontrol.commons.TuraException {
        saveState();
        super.cleanShifter();
        restoreState();
    }

    @Override
    public ShiftControl getShifter() throws TuraException {
        saveState();
        return (ShiftControl) restoreState(super.getShifter());
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<CompanyDAO> getScroller() {
        saveState();
        return (List<CompanyDAO>) restoreState(super.getScroller());
    }
}
