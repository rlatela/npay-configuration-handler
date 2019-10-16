package com.novafutur.financial.configuration.controller.rest;

import com.novafutur.financial.configuration.controller.BaseController;
import com.novafutur.financial.configuration.db.tables.pojos.LoanPlan;
import com.novafutur.financial.configuration.exception.ObjectNotFoundException;
import com.novafutur.financial.configuration.services.LoanPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class LoanPlanController extends BaseController {

    public final Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    LoanPlanService loanPlanService;


    @GetMapping(value = "/loanplan/{id}")
    public LoanPlan get(@PathVariable("id") int id) throws Exception, ObjectNotFoundException {

        LoanPlan ret = null;



        try {

            log.info("Retriving ");

            ret = loanPlanService.getLoanPlan(id);

            if (ret == null ) throw new ObjectNotFoundException(id, LoanPlan.class);

        }catch(Exception ex){
            log.severe("Error during loan plan id:" + id + " : " + ex);
            throw new ObjectNotFoundException(id, LoanPlan.class);
        }


        return ret;


    }

}
