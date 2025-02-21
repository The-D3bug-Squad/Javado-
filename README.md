# Task Manager CLI Project
A Java command-line tool to manage tasks.

## How to Start
1. **Fork this repository** to your GitHub account.
2. **Clone your fork** locally:
   ```bash
   git clone https://github.com/your-username/javado-.git
    ```
## How to Test
### Add the main repo as a remote

```bash
git remote add upstream https://github.com/(mainrepourl)
```

### Fetch tests 

```bash
git fetch upstream tier[iteration number]-tests

git merge upstream/tier[iteration number]-tests --allow-unrelated-histories
```
##Run Tests:

```bash
mvn test
```


#instructions for other iterations

# Task Management System – Instructions (Tier 3 to 5)

## **Tier 3: OOP Basics**

**Objective**: Transition from using strings to using objects to represent tasks.

1. **Create a Task Class**
   - Create a `Task` class with the following properties:
      - `title`: The title of the task (String).
      - `description`: A description of the task (String).
      - `status`: A boolean representing whether the task is completed (`true`) or not (`false`).
   - Provide appropriate getters and setters for each property.

2. **Modify TaskManager to Use Task Objects**
   - Instead of storing tasks as strings, store them as `Task` objects in a list (use `List<Task>` instead of `List<String>`).
   - Update the `addTask` method to accept and add `Task` objects.
   - Update the `listTasks` method to display `Task` objects with their title, description, and status.

## **Tier 4: Intermediate**

**Objective**: Add more functionality for managing tasks and improve the user interface.

1. **Add a Menu Loop**
   - The program should run in a loop, allowing the user to continuously add, list, and delete tasks until they choose to exit. This is your main interface for interaction.

2. **Delete Tasks**
   - Implement a way for the user to delete a task from the list. You can identify tasks by title or use a task ID if preferred.
   - Ensure the program displays a message when a task is successfully deleted.

3. **Mark Tasks as Complete**
   - Allow the user to mark a task as complete. Update the `status` of the task to `true` when it is completed.
   - Display a message confirming that the task has been marked as complete.


## **Tier 5: Input Validation**

**Objective**: Handle errors and invalid inputs gracefully to improve the user experience and make the program more robust.

1. **Handle Invalid Menu Choices**
   - If the user enters an invalid menu option (e.g., a number outside the allowed range), the program should display an error message and prompt the user to try again.
   - Example: If the user enters an option like `6` when the available options are `1` to `5`, the program should notify the user that the input is invalid and allow them to choose again.

2. **Handle Task Deletion Errors**
   - If the user tries to delete a task that doesn’t exist in the list, the program should display an error message and should not crash.
   - The program should verify that the task is in the list before attempting deletion.
   - Example: If the user tries to delete a task by entering a name that doesn't exist in the list, the program should display a message such as `"Task not found! Please check the task title and try again."`

3. **Handle Empty Task List**
   - If the user tries to list tasks but the task list is empty, the program should display a message like `"No tasks to display!"` rather than just showing an empty list.

4. **Ensure Valid Input When Adding Tasks**
   - When adding a task, ensure that the user does not input an empty string or spaces only. The program should prompt the user to enter a valid task description.

5 **modify main accordingly** 


ps use the test as your guide love <3 k