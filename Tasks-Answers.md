# Home Challenge
## Task 1 

A list of ideas/bullet points you would test for. Focus on good coverage, rather than complete test cases. A prioritization of such test cases according to their possible business impact.

Platform: iOS

 - User should be able to run the app (Even in case of no internet)
 Priority: Very High - As the  app is client side so we should make sure that everytime app should run smoothly 
 Steps:
1. Install the app 
2. Run the app 
Expected Behavior: 
App should run and takes the user to the home screen 

 - User is able to enter the new income/expense for all categories 
 Priority: High - As the main focus of the app is to let user enter the expenses 
 Steps: 
 1. Run the app 
 2. Click on Add (+)
 3. Enter data and select category 
 4. Click on Save/Add
 Expected Behavior: 
 App should allow the user to add the expense against the selected category 
 
 - Make sure about the user's data is updating properly and in rightful manner 
 Priority: Very High - As the app shows the difference between the expenses and total balance of the user
 Steps: 
 1. Run the app 
 2. Add some expenses 
 3. Look for the available balance/calculated amount 
 3. Leave the app/ Kill the app background 
 4. Check the data after some days, as it shouldn't be changed if there is no interaction happened 
 Expected Behavior: 
 User data shouldn't be changed if there is no interaction happened between the user and the app 
 
 - User should be able to add different accounts 
 Priority: Medium 
 Steps: 
 1. Run the app 
 2. Go to left navigation bar or swipe to left 
 3. Click on account 
 4. Add different accounts 
 Expected Behavior: 
 User should be able to add different accounts in order to differentiate between them 
 
 - Make sure user data of different accounts shouldn't be merge 
 Priority: High - We should take care that user data is not merging in case of different accounts 
 1. Run the app
 2. Go to the accounts 
 3. Add different accounts 
 4. Add different categories with expenses 
 5. Now look for each account and confirm the expenses which were entered before 
 Expected Behavior: 
 App should not mix the data of different accounts
 
 - User data shouldn't be leaked or exposed to other people 
 Priority: Very High - As this concerns the user personal financial information so we should be careful and make sure there shouldn't be any security leak 
 Steps: 
 1. Run the app 
 2. Add some expenses 
 3. Delete the app 
 4. Look into device keychain - The data which was saved locally should be gone on deleting the app 
 Expected Behavior: 
 Every thing related to the user should only be access by them.
 
 - App should ask user to input some kind of authentication
 Priority: Very High - As the app contains sensitive data, so app should ask the user to generate pass code or enable the FaceID/finger print sensor before adding the expenses. 
 Expected Behavior: 
 App should give user information about the sensitive data and force them to enable the passcode/faceid
 
 -  Test backward compatability
 Priority: High - User shouldn't lost their old data after migrating to latest version
 Steps:
 1. Have an old account on old builds (if new version is released)
 2. Add to all expenses/categories in order to test properly 
 3. Remember the data or save the screen shots of each section 
 4. Update the old version to latest one 
 5. Look for the all old data 
 Expected Behavior: 
 User shouldn't lost any data which was saved in the old versions
 


## Task 2 
### A list of ideas/bullet points you would test for. Focus on good coverage, rather than complete test cases

 - Create accounts with all possible parameters   
 Priority: Very High 
 Steps:
 1. Run the app 
 2. Click on Next
 3. Select default currency (CHF/EUR/GBP/USD/Other)
 4. Click on Next
 5. Steup Account (Create default accounts/Import my accounts/Let me handle it)
 6. Click on Next 
 7. Select Feedback options (Automatically send crash reports/Disable crash reports)
 8. Click on Next 
 9. Click on Done 
 Expected Beahvior: 
 User should be able to create an account.
 
 - Add account after user is successfully entered into the app 
 Priority: Very High 
 Steps:
 1. Run the app 
 2. Create the account with provided parameters 
 3. Click on Add (+) button 
 4. Enter the Account Name 
 5. Choose currency and account color & type 
 6. Enter account description 
 7. Choose Parent account 
 8. Choose default transfer account 
 9. Click On Save 
 Expected Behavior: 
 User should be able to see the account in All tab 
 
 - Manage different sub-accounts after successfully entering into the app 
 Priority: High 
 Steps:
 1. Run the app 
 2. Create the account with provided parameters 
 3. Click on Add (+) button 
 4. Click on Assests
 5. Click on Current Assests 
 6. Click on (+) cash in wallet 
 7. Add data for New transaction 
 8. Click on Save 
 9. Look for enter value and compare
 Expected Behavior: 
 User should be able to add ammounts in subaccounts in order to track the expense 
 
 - Manage different books and compare the data for books are not merging
 Priority: High 
 Steps:
 1. Run the app 
 2. Create the account with provided parameters 
 3. Go to navigation menu button 
 4. Click on Book 
 5. Add on Manage books 
 6. Click on (+) to add new book 
 7. Make sure the new book is there 
 8. Add some Expenses in that book 
 9. Go to navigation bar 
 10. Select the last book on which you were before adding the new one 
 11. Make sure that the recently added Expenses shouldn't be there 
 Expected Behavior: 
 User's book data shouldn't be merged with one another
 
 ### Soultion: 
 
 I have used the automated testng using appium for android application as its feasible from the future perspective if we have to integerate the CI tool with our test scenarios. As the app is small and also every element has mostly unique Xpath/ID so there is no need to use or call some fucntions because everything will be handled by appium and android drivers which will minimize the time in order to run tests. I have tried to capture the main test scenarios in automations and if we have to implement more we can use the exisiting ones and by just updating the xpaths or ids we can easily achieve more automated tests. I have worked on cucumber as well using Junit, but for this scale of application its better to use the easy framework. 
 
 FYI: I didn't work much on automation so I tried my best to automate the possible test cases with my existing skills and also I told in the interview don't take me as a Senior QA automation engineer as I am already learning a lot about automation atm. So it could be possible that you won't like my approach but I want to give it my full try. 
 
 
 
 
