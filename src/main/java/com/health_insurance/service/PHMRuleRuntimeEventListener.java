package com.health_insurance.service;

import org.kie.api.event.rule.*;

public class PHMRuleRuntimeEventListener implements RuleRuntimeEventListener {
    /**
     * @param event
     * @return
     */
    public PHMRuleRuntimeEventListener() {
        System.out.println(">>>>>>>>> PHMRuleRuntimeEventListene created.");
    }


    /**
     * @param event
     */
    public void objectInserted(ObjectInsertedEvent event) {
        System.out.println(
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
        System.out.println(
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
        System.out.println(
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
