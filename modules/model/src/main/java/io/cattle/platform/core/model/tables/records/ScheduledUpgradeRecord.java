/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.ScheduledUpgrade;
import io.cattle.platform.core.model.tables.ScheduledUpgradeTable;
import io.cattle.platform.db.jooq.utils.TableRecordJaxb;

import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "scheduled_upgrade", schema = "cattle")
public class ScheduledUpgradeRecord extends UpdatableRecordImpl<ScheduledUpgradeRecord> implements TableRecordJaxb, Record14<Long, Long, String, String, String, Date, Date, Date, Date, Map<String,Object>, Long, Date, Date, Long>, ScheduledUpgrade {

    private static final long serialVersionUID = -1014761413;

    /**
     * Setter for <code>cattle.scheduled_upgrade.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.scheduled_upgrade.account_id</code>.
     */
    @Override
    public void setAccountId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    @Override
    public Long getAccountId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>cattle.scheduled_upgrade.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cattle.scheduled_upgrade.uuid</code>.
     */
    @Override
    public void setUuid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    @Override
    public String getUuid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.scheduled_upgrade.state</code>.
     */
    @Override
    public void setState(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    @Override
    public String getState() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.scheduled_upgrade.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>cattle.scheduled_upgrade.removed</code>.
     */
    @Override
    public void setRemoved(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.removed</code>.
     */
    @Column(name = "removed")
    @Override
    public Date getRemoved() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>cattle.scheduled_upgrade.remove_time</code>.
     */
    @Override
    public void setRemoveTime(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.remove_time</code>.
     */
    @Column(name = "remove_time")
    @Override
    public Date getRemoveTime() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>cattle.scheduled_upgrade.run_after</code>.
     */
    @Override
    public void setRunAfter(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.run_after</code>.
     */
    @Column(name = "run_after")
    @Override
    public Date getRunAfter() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>cattle.scheduled_upgrade.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.data</code>.
     */
    @Column(name = "data", length = 16777215)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(9);
    }

    /**
     * Setter for <code>cattle.scheduled_upgrade.environment_id</code>.
     */
    @Override
    public void setStackId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.environment_id</code>.
     */
    @Column(name = "environment_id", precision = 19)
    @Override
    public Long getStackId() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>cattle.scheduled_upgrade.started</code>.
     */
    @Override
    public void setStarted(Date value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.started</code>.
     */
    @Column(name = "started")
    @Override
    public Date getStarted() {
        return (Date) get(11);
    }

    /**
     * Setter for <code>cattle.scheduled_upgrade.finished</code>.
     */
    @Override
    public void setFinished(Date value) {
        set(12, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.finished</code>.
     */
    @Column(name = "finished")
    @Override
    public Date getFinished() {
        return (Date) get(12);
    }

    /**
     * Setter for <code>cattle.scheduled_upgrade.priority</code>.
     */
    @Override
    public void setPriority(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>cattle.scheduled_upgrade.priority</code>.
     */
    @Column(name = "priority", nullable = false, precision = 19)
    @Override
    public Long getPriority() {
        return (Long) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, Long, String, String, String, Date, Date, Date, Date, Map<String,Object>, Long, Date, Date, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, Long, String, String, String, Date, Date, Date, Date, Map<String,Object>, Long, Date, Date, Long> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.REMOVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.RUN_AFTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field10() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.STACK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field12() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.STARTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field13() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.FINISHED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return ScheduledUpgradeTable.SCHEDULED_UPGRADE.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getRemoveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getRunAfter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String,Object> value10() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getStackId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value12() {
        return getStarted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value13() {
        return getFinished();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value2(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value3(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value4(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value5(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value6(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value7(Date value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value8(Date value) {
        setRemoveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value9(Date value) {
        setRunAfter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value10(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value11(Long value) {
        setStackId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value12(Date value) {
        setStarted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value13(Date value) {
        setFinished(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord value14(Long value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduledUpgradeRecord values(Long value1, Long value2, String value3, String value4, String value5, Date value6, Date value7, Date value8, Date value9, Map<String,Object> value10, Long value11, Date value12, Date value13, Long value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ScheduledUpgrade from) {
        setId(from.getId());
        setAccountId(from.getAccountId());
        setKind(from.getKind());
        setUuid(from.getUuid());
        setState(from.getState());
        setCreated(from.getCreated());
        setRemoved(from.getRemoved());
        setRemoveTime(from.getRemoveTime());
        setRunAfter(from.getRunAfter());
        setData(from.getData());
        setStackId(from.getStackId());
        setStarted(from.getStarted());
        setFinished(from.getFinished());
        setPriority(from.getPriority());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ScheduledUpgrade> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScheduledUpgradeRecord
     */
    public ScheduledUpgradeRecord() {
        super(ScheduledUpgradeTable.SCHEDULED_UPGRADE);
    }

    /**
     * Create a detached, initialised ScheduledUpgradeRecord
     */
    public ScheduledUpgradeRecord(Long id, Long accountId, String kind, String uuid, String state, Date created, Date removed, Date removeTime, Date runAfter, Map<String,Object> data, Long environmentId, Date started, Date finished, Long priority) {
        super(ScheduledUpgradeTable.SCHEDULED_UPGRADE);

        set(0, id);
        set(1, accountId);
        set(2, kind);
        set(3, uuid);
        set(4, state);
        set(5, created);
        set(6, removed);
        set(7, removeTime);
        set(8, runAfter);
        set(9, data);
        set(10, environmentId);
        set(11, started);
        set(12, finished);
        set(13, priority);
    }
}