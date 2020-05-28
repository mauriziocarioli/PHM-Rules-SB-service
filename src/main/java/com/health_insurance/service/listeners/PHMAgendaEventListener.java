package com.health_insurance.service.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.kie.api.event.rule.*;

public class PHMAgendaEventListener implements AgendaEventListener {
    private static final Logger LOG = LoggerFactory.getLogger(PHMTaskLifeCycleEventListener.class);
    /**
     */
    public PHMAgendaEventListener() {
        LOG.info("PHMAgendaEventListener is registered.");
    }

    //****************/
    //* Match Events */
    //****************/

    /**
     * @param event
     */
    public void matchCreated(MatchCreatedEvent event) {
        LOG.info(
                "Match with Rule <<" +
                        event.getMatch().getRule().getName() +
                        ">> was created."
        );
    }

    /**
     * @param event
     */
    public void matchCancelled(MatchCancelledEvent event) {
        LOG.info(
                "Match with Rule <<" +
                        event.getMatch().getRule().getName() +
                        ">> was cancelled."
        );
    }

    /**
     * @param event
     */
    public void beforeMatchFired(BeforeMatchFiredEvent event) {
        LOG.info(
                "Match with Rule <<" +
                        event.getMatch().getRule().getName() +
                        ">> is about to fire."
        );
    }

    /**
     * @param event
     */
    public void afterMatchFired(AfterMatchFiredEvent event) {
        LOG.info("Match with Rule <<" +
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
        LOG.info(
                "Agenda Group <<" +
                        event.getAgendaGroup().getName() +
                        ">> has been popped."
        );
    }

    /**
     * @param event
     */
    public void agendaGroupPushed(AgendaGroupPushedEvent event) {
        LOG.info("Agenda Group <<" +
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
        LOG.info(
                "Rule Flow Group <<" +
                        event.getRuleFlowGroup().getName() +
                        ">> is about to be activated."
        );
    }

    /**
     * @param event
     */
    public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        LOG.info(
                "Rule Flow Group <<" +
                        event.getRuleFlowGroup().getName() +
                        ">> has been activated."
        );
    }

    /**
     * @param event
     */
    public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        LOG.info(
                "Rule Flow Group <<" +
                        event.getRuleFlowGroup().getName() +
                        ">> is about to be deactivated."
        );
    }

    /**
     * @param event
     */
    public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        LOG.info(
                "Rule Flow Group <<" +
                        event.getRuleFlowGroup().getName() +
                        ">> has been deactivated."
        );
    }
}