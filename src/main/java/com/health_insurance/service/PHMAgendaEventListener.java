package com.health_insurance.service;

import org.kie.api.event.rule.*;

public class PHMAgendaEventListener implements AgendaEventListener {
    /**
     * @param event
     * @return
     */
    public PHMAgendaEventListener() {
        System.out.println(">>>>>>>>> PHMAgendaEventListener created.");
    }

    //****************/
    //* Match Events */
    //****************/

    /**
     * @param event
     */
    public void matchCreated(MatchCreatedEvent event) {
        System.out.println(
                "Match with Rule <<" +
                        event.getMatch().getRule().getName() +
                        ">> was created."
        );
    }

    /**
     * @param event
     */
    public void matchCancelled(MatchCancelledEvent event) {
        System.out.println(
                "Match with Rule <<" +
                        event.getMatch().getRule().getName() +
                        ">> was cancelled."
        );
    }

    /**
     * @param event
     */
    public void beforeMatchFired(BeforeMatchFiredEvent event) {
        System.out.println(
                "Match with Rule <<" +
                        event.getMatch().getRule().getName() +
                        ">> is about to fire."
        );
    }

    /**
     * @param event
     */
    public void afterMatchFired(AfterMatchFiredEvent event) {
        System.out.println("Match with Rule <<" +
                event.getMatch().getRule().getName() +
                ">> has fired."
        );
    }

    //***********************/
    //* Agenda Group Events */
    //***********************/

    /**
     * @param event
     */
    public void agendaGroupPopped(AgendaGroupPoppedEvent event) {
        System.out.println(
                "Agenda Group <<" +
                        event.getAgendaGroup().getName() +
                        ">> has been popped."
        );
    }

    /**
     * @param event
     */
    public void agendaGroupPushed(AgendaGroupPushedEvent event) {
        System.out.println("Agenda Group <<" +
                event.getAgendaGroup().getName() +
                ">> has been pushed."
        );
    }

    //**************************/
    //* Rule Flow Group Events */
    //**************************/

    /**
     * @param event
     */
    public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        System.out.println(
                "Rule Flow Group <<" +
                        event.getRuleFlowGroup().getName() +
                        ">> is about to be activated."
        );
    }

    /**
     * @param event
     */
    public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        System.out.println(
                "Rule Flow Group <<" +
                        event.getRuleFlowGroup().getName() +
                        ">> has been activated."
        );
    }

    /**
     * @param event
     */
    public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        System.out.println(
                "Rule Flow Group <<" +
                        event.getRuleFlowGroup().getName() +
                        ">> is about to be deactivated."
        );
    }

    /**
     * @param event
     */
    public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        System.out.println(
                "Rule Flow Group <<" +
                        event.getRuleFlowGroup().getName() +
                        ">> has been deactivated."
        );
    }
}