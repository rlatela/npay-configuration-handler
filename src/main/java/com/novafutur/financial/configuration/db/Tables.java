/*
 * This file is generated by jOOQ.
 */
package com.novafutur.financial.configuration.db;


import com.novafutur.financial.configuration.db.tables.LoanPlan;
import com.novafutur.financial.configuration.db.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in nf_configuration
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>nf_configuration.loan_plan</code>.
     */
    public static final LoanPlan LOAN_PLAN = LoanPlan.LOAN_PLAN;

    /**
     * The table <code>nf_configuration.user</code>.
     */
    public static final User USER = User.USER;
}
