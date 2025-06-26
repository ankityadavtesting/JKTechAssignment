# Project Testing Strategy

# Overview
This project involves testing RESTful APIs for a book management system. The testing strategy focuses on ensuring the reliability, maintainability, and scalability of the tests while adhering to best practices.



# Testing Strategy

# 1. Approach to Writing Test Flows
- **Modular Design**: Test flows are designed to be modular, with reusable components such as payload generation (`Payload.java`) and token management (`TokernProvider.java`).
- **Separation of Concerns**: Test data (e.g., `.json` files) is stored separately in the `src/test/resources/payloads` directory to ensure clean separation between code and data.
- **Parameterized Tests**: Tests are parameterized wherever possible to cover multiple scenarios without duplicating code.
- **Negative and Positive Scenarios**: Each endpoint is tested for both valid and invalid inputs to ensure comprehensive coverage.



# 2. Ensuring Reliability and Maintainability
- **Dynamic Data Generation**: The `Payload` class uses the `Faker` library to generate dynamic test data, reducing dependency on static data and ensuring tests remain reliable over time.
- **Centralized Configuration**: The `IConfig` interface centralizes endpoint paths and file locations, making it easy to update configurations without modifying multiple files.
- **Token Management**: The `TokernProvider` class handles token generation dynamically, ensuring authentication tests are reliable and up-to-date.
- **Logging and Debugging**: REST-assured logging is enabled for all requests and responses, making it easier to debug issues during test execution.
- **TestNG Listeners**: Custom listeners are used to enhance reporting and track test execution.



# 3. **Challenges Faced and Solutions**
- **Challenge: Managing Dynamic Test Data**
  - **Solution**: Used the `Faker` library to generate realistic and random data for payloads, ensuring tests are not dependent on static data.

- **Challenge: Token Expiry**
  - **Solution**: Implemented a dynamic token provider (`TokernProvider.java`) to fetch fresh tokens for each test run.

- **Challenge: Maintaining Test Data**
  - **Solution**: Stored test payloads in `.json` files within the `src/test/resources/payloads` directory, ensuring easy updates and separation from code.

- **Challenge: Debugging Failures**
  - **Solution**: Enabled detailed logging for all API requests and responses, making it easier to identify issues.



# Directory Structure

Used ChainTest for reporting.
For detailed HTML reports, navigate to `E:\JKTechAssignment\JKTechAssignment\target\chaintest\Index.html` and open it in a browser.



# Future Improvements
- Add more edge case tests for API endpoints.
- Implement integration tests for end-to-end scenarios.
- Enhance reporting with custom TestNG listeners.