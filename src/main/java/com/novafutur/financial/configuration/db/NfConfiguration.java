/*
 * This file is generated by jOOQ.
 */
package com.novafutur.financial.configuration.db;


import com.novafutur.financial.configuration.db.tables.LoanPlan;
import com.novafutur.financial.configuration.db.tables.User;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
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
public class NfConfiguration extends SchemaImpl {

    private static final long serialVersionUID = 226640246;

    /**
     * The reference instance of <code>nf_configuration</code>
     */
    public static final NfConfiguration NF_CONFIGURATION = new NfConfiguration();

    /**
     * The table <code>nf_configuration.loan_plan</code>.
     */
    public final LoanPlan LOAN_PLAN = com.novafutur.financial.configuration.db.tables.LoanPlan.LOAN_PLAN;

    /**
     * The table <code>nf_configuration.user</code>.
     */
    public final User USER = com.novafutur.financial.configuration.db.tables.User.USER;

    /**
     * No further instances allowed
     */
    private NfConfiguration() {
        super("nf_configuration", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            LoanPlan.LOAN_PLAN,
            User.USER);
    }
}