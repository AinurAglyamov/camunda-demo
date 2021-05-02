package ru.aynur.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class PrepareForBattle implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        int warriorsRome = (int) delegateExecution.getVariable("warriorsRome");
        int warriorsCarthage = (int) (Math.random() * 100) + 100;

        delegateExecution.setVariable("warriorsRome", warriorsRome);
        delegateExecution.setVariable("warriorsCarthage", warriorsCarthage);

        delegateExecution.setVariable("romeWon", warriorsRome > warriorsCarthage);

    }
}
