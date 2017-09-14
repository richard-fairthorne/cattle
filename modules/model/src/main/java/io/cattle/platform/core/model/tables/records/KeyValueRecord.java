/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.KeyValue;
import io.cattle.platform.core.model.tables.KeyValueTable;
import io.cattle.platform.db.jooq.utils.TableRecordJaxb;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
@Table(name = "key_value", schema = "cattle")
public class KeyValueRecord extends TableRecordImpl<KeyValueRecord> implements TableRecordJaxb, Record3<String, byte[], Long>, KeyValue {

    private static final long serialVersionUID = -1541679965;

    /**
     * Setter for <code>cattle.key_value.name</code>.
     */
    @Override
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.key_value.name</code>.
     */
    @Column(name = "name", unique = true, length = 255)
    @Override
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>cattle.key_value.value</code>.
     */
    @Override
    public void setValue(byte... value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.key_value.value</code>.
     */
    @Column(name = "value", length = 16777215)
    @Override
    public byte[] getValue() {
        return (byte[]) get(1);
    }

    /**
     * Setter for <code>cattle.key_value.revision</code>.
     */
    @Override
    public void setRevision(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.key_value.revision</code>.
     */
    @Column(name = "revision", precision = 19)
    @Override
    public Long getRevision() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, byte[], Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, byte[], Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return KeyValueTable.KEY_VALUE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field2() {
        return KeyValueTable.KEY_VALUE.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return KeyValueTable.KEY_VALUE.REVISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value2() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getRevision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyValueRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyValueRecord value2(byte... value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyValueRecord value3(Long value) {
        setRevision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyValueRecord values(String value1, byte[] value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(KeyValue from) {
        setName(from.getName());
        setValue(from.getValue());
        setRevision(from.getRevision());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends KeyValue> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KeyValueRecord
     */
    public KeyValueRecord() {
        super(KeyValueTable.KEY_VALUE);
    }

    /**
     * Create a detached, initialised KeyValueRecord
     */
    public KeyValueRecord(String name, byte[] value, Long revision) {
        super(KeyValueTable.KEY_VALUE);

        set(0, name);
        set(1, value);
        set(2, revision);
    }
}
