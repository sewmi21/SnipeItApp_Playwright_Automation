#####  Snipe-IT Automation Framework (Playwright + Java) ####

This project demonstrates end-to-end test automation using Playwright with Java.
The automation is performed on the sample application:

https://demo.snipeitapp.com/

The framework follows industry best practices, focusing on maintainability, scalability, and reusability.

##### Tech Stack #####
Java (JDK 11+)
Playwright (Java)
TestNG
Maven
IntelliJ IDEA

#### Framework Design ###

This project is built using the Page Object Model (POM) design pattern.

Key Features:
Separation of concerns (Locators, Methods, Tests)
Reusable components
Clean and maintainable code structure
Scalable for larger test suites
📂 Project Structure
src/test/java/
 ├── base/        → Browser setup & teardown
 ├── locators/    → Element locators (XPath/CSS)
 ├── pages/       → Page methods (actions)
 └── tests/       → Test scenarios
 
#### Test Scenario Covered ####

The automation script performs the following steps:

-Login to the application
-Create a new Macbook Pro 13" asset
-Assign status: Ready to Deploy
-Assign asset to a user
-Search and verify the created asset
-Navigate to asset details page
-Validate asset information
-Validate History tab details


#### Setup Instructions ###
1. Clone the repository
git clone <your-repo-link>
cd <project-folder>
2. Install dependencies


Install: 
Java JDK 11+
Maven installed

Then execute:

mvn clean install

4. Run tests
mvn test

Running from IntelliJ:

Open project in IntelliJ IDEA
Ensure Maven dependencies are loaded
Right-click test class → Run

Test Framework Highlights:

Uses Playwright’s auto-waiting mechanism
Minimal use of hard waits
Clean locator strategy
Assertions using TestNG
Dynamic test data handling

Notes:-
This project is for demonstration purposes only
Uses public demo environment of Snipe-IT
Test data may vary between runs

👨‍💻 Author
M M S U Mahagedara
30th April 2026

📜 License

This project is intended for educational and demonstration purposes.
