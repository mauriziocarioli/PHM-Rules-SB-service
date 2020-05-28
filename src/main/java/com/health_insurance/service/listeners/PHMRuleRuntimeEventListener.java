package com.health_insurance.service.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.kie.api.event.rule.*;

public class PHMRuleRuntimeEventListener implements RuleRuntimeEventListener {
    private static final Logger LOG = LoggerFactory.getLogger(PHMTaskLifeCycleEventListener.class);
    /**
     */
    public PHMRuleRuntimeEventListener() {
        LOG.info(">>>>>>>>> PHMRuleRuntimeEventListene created.");
    }


    /**
     * @param event
     */
    public void objectInserted(ObjectInsertedEvent event) {
        LOG.info(
                "Rule <<" +
                        //event.getRule().getName()+
                        ">> has caused Object (" +
                        //event.getObject().toString()+
                        ") of class <<" +
                        //event.getObject().getClass().getName()+
                        ">> to be inserted."
        );
    }


    /**
     * @param event
     */
    public void objectUpdated(ObjectUpdatedEvent event) {
        LOG.info(
                "Rule <<" +
                        //event.getRule().getName()+
                        ">> has caused Object (" +
                        //event.getObject().toString()+
                        ") of class <<" +
                        //event.getObject().getClass().getName()+
                        ">> to be updated."
        );
    }


    /**
     * @param event
     */
    public void objectDeleted(ObjectDeletedEvent event) {
        LOG.info(
                "Rule <<" +
                        event.getRule().getName() +
                        ">> has caused Object (" +
                        //event.getOldObject().toString()+
                        ") of class <<" +
                        //event.getOldObject().getClass().getName()+
                        ">> to be deleted."
        );
    }
}
