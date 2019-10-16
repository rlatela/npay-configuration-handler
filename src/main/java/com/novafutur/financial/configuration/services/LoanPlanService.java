package com.novafutur.financial.configuration.services;


import com.novafutur.financial.configuration.db.Tables;
import com.novafutur.financial.configuration.db.tables.pojos.LoanPlan;
import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanPlanService {

    @Autowired
    DSLContext jooq;

    public LoanPlan getLoanPlan(int id){

        SelectQuery qry = jooq.selectQuery(Tables.LOAN_PLAN);
        qry.addSelect(Tables.LOAN_PLAN.fields());
        qry.addConditions(Tables.LOAN_PLAN.ID_LOAN_PLAN.eq(id));
        return qry.fetchOne().into(LoanPlan.class);

    }
}
