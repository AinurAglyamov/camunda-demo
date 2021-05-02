package ru.aynur.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class PrepareForBattle implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        int enemyWarriors = (int) (Math.random() * 100) + 100;
        String battleStatus = "undefined";

        delegateExecution.setVariable("enemyWarriors", enemyWarriors);
        delegateExecution.setVariable("battleStatus", battleStatus);
    }
}
