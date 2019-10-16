/*
 * This file is generated by jOOQ.
 */
package com.novafutur.financial.configuration.db.tables;


import com.novafutur.financial.configuration.db.Indexes;
import com.novafutur.financial.configuration.db.Keys;
import com.novafutur.financial.configuration.db.NfConfiguration;
import com.novafutur.financial.configuration.db.tables.records.LoanPlanRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
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
public class LoanPlan extends TableImpl<LoanPlanRecord> {

    private static final long serialVersionUID = -532174722;

    /**
     * The reference instance of <code>nf_configuration.loan_plan</code>
     */
    public static final LoanPlan LOAN_PLAN = new LoanPlan();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LoanPlanRecord> getRecordType() {
        return LoanPlanRecord.class;
    }

    /**
     * The column <code>nf_configuration.loan_plan.id_loan_plan</code>.
     */
    public final TableField<LoanPlanRecord, Integer> ID_LOAN_PLAN = createField(DSL.name("id_loan_plan"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>nf_configuration.loan_plan.id_user</code>.
     */
    public final TableField<LoanPlanRecord, Integer> ID_USER = createField(DSL.name("id_user"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>nf_configuration.loan_plan.name</code>.
     */
    public final TableField<LoanPlanRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>nf_configuration.loan_plan.date_create</code>.
     */
    public final TableField<LoanPlanRecord, LocalDateTime> DATE_CREATE = createField(DSL.name("date_create"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>nf_configuration.loan_plan.date_update</code>.
     */
    public final TableField<LoanPlanRecord, LocalDateTime> DATE_UPDATE = createField(DSL.name("date_update"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>nf_configuration.loan_plan.date_delete</code>.
     */
    public final TableField<LoanPlanRecord, LocalDateTime> DATE_DELETE = createField(DSL.name("date_delete"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>nf_configuration.loan_plan.parts</code>.
     */
    public final TableField<LoanPlanRecord, Integer> PARTS = createField(DSL.name("parts"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>nf_configuration.loan_plan.interests</code>.
     */
    public final TableField<LoanPlanRecord, BigDecimal> INTERESTS = createField(DSL.name("interests"), org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "");

    /**
     * The column <code>nf_configuration.loan_plan.part_amount</code>.
     */
    public final TableField<LoanPlanRecord, Long> PART_AMOUNT = createField(DSL.name("part_amount"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>nf_configuration.loan_plan.status</code>.
     */
    public final TableField<LoanPlanRecord, Integer> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>nf_configuration.loan_plan</code> table reference
     */
    public LoanPlan() {
        this(DSL.name("loan_plan"), null);
    }

    /**
     * Create an aliased <code>nf_configuration.loan_plan</code> table reference
     */
    public LoanPlan(String alias) {
        this(DSL.name(alias), LOAN_PLAN);
    }

    /**
     * Create an aliased <code>nf_configuration.loan_plan</code> table reference
     */
    public LoanPlan(Name alias) {
        this(alias, LOAN_PLAN);
    }

    private LoanPlan(Name alias, Table<LoanPlanRecord> aliased) {
        this(alias, aliased, null);
    }

    private LoanPlan(Name alias, Table<LoanPlanRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LoanPlan(Table<O> child, ForeignKey<O, LoanPlanRecord> key) {
        super(child, key, LOAN_PLAN);
    }

    @Override
    public Schema getSchema() {
        return NfConfiguration.NF_CONFIGURATION;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LOAN_PLAN_PRIMARY);
    }

    @Override
    public Identity<LoanPlanRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LOAN_PLAN;
    }

    @Override
    public UniqueKey<LoanPlanRecord> getPrimaryKey() {
        return Keys.KEY_LOAN_PLAN_PRIMARY;
    }

    @Override
    public List<UniqueKey<LoanPlanRecord>> getKeys() {
        return Arrays.<UniqueKey<LoanPlanRecord>>asList(Keys.KEY_LOAN_PLAN_PRIMARY);
    }

    @Override
    public LoanPlan as(String alias) {
        return new LoanPlan(DSL.name(alias), this);
    }

    @Override
    public LoanPlan as(Name alias) {
        return new LoanPlan(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LoanPlan rename(String name) {
        return new LoanPlan(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LoanPlan rename(Name name) {
        return new LoanPlan(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, Integer, String, LocalDateTime, LocalDateTime, LocalDateTime, Integer, BigDecimal, Long, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}