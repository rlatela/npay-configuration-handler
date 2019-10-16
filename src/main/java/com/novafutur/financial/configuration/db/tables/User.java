/*
 * This file is generated by jOOQ.
 */
package com.novafutur.financial.configuration.db.tables;


import com.novafutur.financial.configuration.db.Indexes;
import com.novafutur.financial.configuration.db.Keys;
import com.novafutur.financial.configuration.db.NfConfiguration;
import com.novafutur.financial.configuration.db.tables.records.UserRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = -290555110;

    /**
     * The reference instance of <code>nf_configuration.user</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>nf_configuration.user.id_user</code>.
     */
    public final TableField<UserRecord, Integer> ID_USER = createField(DSL.name("id_user"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>nf_configuration.user.name</code>.
     */
    public final TableField<UserRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>nf_configuration.user.surname</code>.
     */
    public final TableField<UserRecord, String> SURNAME = createField(DSL.name("surname"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>nf_configuration.user.title</code>.
     */
    public final TableField<UserRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>nf_configuration.user.date_birth</code>.
     */
    public final TableField<UserRecord, LocalDateTime> DATE_BIRTH = createField(DSL.name("date_birth"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>nf_configuration.user.date_create</code>.
     */
    public final TableField<UserRecord, LocalDateTime> DATE_CREATE = createField(DSL.name("date_create"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>nf_configuration.user.date_update</code>.
     */
    public final TableField<UserRecord, LocalDateTime> DATE_UPDATE = createField(DSL.name("date_update"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>nf_configuration.user.date_delete</code>.
     */
    public final TableField<UserRecord, LocalDateTime> DATE_DELETE = createField(DSL.name("date_delete"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>nf_configuration.user.gov_id</code>.
     */
    public final TableField<UserRecord, String> GOV_ID = createField(DSL.name("gov_id"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>nf_configuration.user.username</code>.
     */
    public final TableField<UserRecord, String> USERNAME = createField(DSL.name("username"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>nf_configuration.user.password</code>.
     */
    public final TableField<UserRecord, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>nf_configuration.user.email</code>.
     */
    public final TableField<UserRecord, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>nf_configuration.user.gender</code>.
     */
    public final TableField<UserRecord, String> GENDER = createField(DSL.name("gender"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>nf_configuration.user.status</code>.
     */
    public final TableField<UserRecord, String> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>nf_configuration.user</code> table reference
     */
    public User() {
        this(DSL.name("user"), null);
    }

    /**
     * Create an aliased <code>nf_configuration.user</code> table reference
     */
    public User(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>nf_configuration.user</code> table reference
     */
    public User(Name alias) {
        this(alias, USER);
    }

    private User(Name alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(Name alias, Table<UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> User(Table<O> child, ForeignKey<O, UserRecord> key) {
        super(child, key, USER);
    }

    @Override
    public Schema getSchema() {
        return NfConfiguration.NF_CONFIGURATION;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_PRIMARY);
    }

    @Override
    public Identity<UserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER;
    }

    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRecord>>asList(Keys.KEY_USER_PRIMARY);
    }

    @Override
    public User as(String alias) {
        return new User(DSL.name(alias), this);
    }

    @Override
    public User as(Name alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(Name name) {
        return new User(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, String, String, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, String, String, String, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
