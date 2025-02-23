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
