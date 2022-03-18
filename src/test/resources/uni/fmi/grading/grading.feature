Feature: Въвеждане на оценка

  Scenario: Въвеждане на оценка с правилни данни
    Given Потребителят се логва в системата
    And е учител
    When Избере предмет
    And избере ученик
    And избере оценка
    And натисне бутона за въвеждане на оценката
    Then Вижда съобщение за успешно нанесена оценка.
          
  Scenario: Въвеждане на оценка с грешни параметри
    Given Потребителят се логва в системата
    And е учител
    When Избере предмет
    And избере ученик
    And избере невалидна оценка
    And натисне бутона за въвеждане на оценката
    Then Вижда съобщение за невалидна оценка.
    
  Scenario: Въвеждане на оценка с грешна роля
    Given Потребителят се логва в системата
    And не е учител
    When Избере предмет
    And избере ученик
    And избере оценка
    And натисне бутона за въвеждане на оценката
    Then Вижда съобщение за недостатъчни права.
    
  Scenario: Въвеждане на оценка на чужд предмет
    Given Потребителят се логва в системата
    And е учител
    When Избере чужд предмет
    And избере ученик
    And избере оценка
    And натисне бутона за въвеждане на оценката
    Then Вижда съобщение за недостатъчни права.
    
  Scenario: Въвеждане на оценка на липсващ предмет
    Given Потребителят се логва в системата
    And е учител
    When Не избере предмет
    And избере ученик
    And избере оценка
    And натисне бутона за въвеждане на оценката
    Then Вижда съобщение за липсващ предмет.