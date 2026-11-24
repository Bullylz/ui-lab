# UI lab results

Student ID: 6787068  
Name: Phumat Kodsila  
Tool parts that I chose: Part 1 Selenium IDE and Part 4 Cypress

## Part 0

- Step 0.1, Chrome version: record the version on the submission computer
- Step 0.3, ChromeDriver version: match it to Chrome
- Step 0.4, Pizza, Please!: `name=pizza-please`
- Step 0.4, Excluded tools: `css=select`
- Step 0.4, Must be vegetarian: `id=default-checkbox`
- Step 0.4, Custom Pizza Name: `css=input#pizza-name`

| Step | Actual result | Pass or fail |
|---|---|---|
| 1 | QuickPizza heading appeared | Pass |
| 2 | Advanced fields appeared | Pass |
| 3 | 600 calories, Knife excluded, vegetarian, unique name | Pass |
| 4 | Pizza recommendation satisfied the restrictions | Pass |
| 5 | Page displayed “Please log in first.” | Pass |
| 6 | Admin page displayed latest recommendations | Pass |
| 7 | Created pizza and its tool appeared in the admin list | Pass |

## Part 1: Selenium IDE

- Stable Submit target: `xpath=//button[@type='submit']`; `css=.btn` is fragile because several buttons can share the class.
- Added explicit waits, stable label-based locators, generated pizza name, assertions, and login-needed check.
- The exported Java test needs clearing before typing 600 and correcting generated-name assertions.

## Part 4: Cypress

- The test intercepts `POST /api/pizza`, checks `maxCaloriesPerSlice === 600`, and compares displayed tool and calories with the response.
- The admin-list assertion searches for the generated pizza name and the same tool.
- Two full runs are required; each run generates a new pizza name and saves screenshots and video.

## Part B

1. The calories input is located through its label because QuickPizza reuses the same id for several number inputs. A unique id would make the locator shorter and unambiguous.
2. The admin-list comparison is a consistency oracle. It catches a fault where the recommendation and admin record disagree about the selected tool.
3. The test can check a vegetarian flag in the response or a visible vegetarian label. The page or API must expose that fact in a stable attribute or response field.
4. Selenium IDE is quick to record but recorded locators need cleanup. Cypress takes more setup, but assertions, network interception, screenshots and videos make failures easier to diagnose.
5. I would choose Cypress for Project 2 because it has automatic retries and strong evidence output while keeping tests readable.
6. `css=.btn` depends on presentation styling. `xpath=//button[@type='submit']` describes the button's purpose and is more stable.
7. QP-01 stays one Cypress test because cookies are cleared between tests. Splitting customer and admin steps would lose browser state.
