Feature: Create new task
  Scenario: The user can add new task
    Given Tap add new Task
    Given Enter the task name
    Given Enter the task description
    When Tap save
    Then Task added successfully