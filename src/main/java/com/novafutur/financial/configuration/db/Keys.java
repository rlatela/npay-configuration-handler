/*
 * This file is generated by jOOQ.
 */
package com.novafutur.financial.configuration.db;


import com.novafutur.financial.configuration.db.tables.LoanPlan;
import com.novafutur.financial.configuration.db.tables.User;
import com.novafutur.financial.configuration.db.tables.records.LoanPlanRecord;
import com.novafutur.financial.configuration.db.tables.records.UserRecord;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>nf_configuration</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<LoanPlanRecord, Integer> IDENTITY_LOAN_PLAN = Identities0.IDENTITY_LOAN_PLAN;
    public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<LoanPlanRecord> KEY_LOAN_PLAN_PRIMARY = UniqueKeys0.KEY_LOAN_PLAN_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<LoanPlanRecord, Integer> IDENTITY_LOAN_PLAN = Internal.createIdentity(LoanPlan.LOAN_PLAN, LoanPlan.LOAN_PLAN.ID_LOAN_PLAN);
        public static Identity<UserRecord, Integer> IDENTITY_USER = Internal.createIdentity(User.USER, User.USER.ID_USER);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<LoanPlanRecord> KEY_LOAN_PLAN_PRIMARY = Internal.createUniqueKey(LoanPlan.LOAN_PLAN, "KEY_loan_plan_PRIMARY", LoanPlan.LOAN_PLAN.ID_LOAN_PLAN);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID_USER);
    }
}
