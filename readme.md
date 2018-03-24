1. ./gradlew  - run tests
2. allure serve build/allure-results/ - get a report


gradle test --tests org.gradle.SomeTest.someSpecificFeature
gradle test --tests *SomeTest.someSpecificFeature
gradle test --tests *SomeSpecificTest
gradle test --tests all.in.specific.package*
gradle test --tests *IntegTest
gradle test --tests *IntegTest*ui*
gradle someTestTask --tests *UiTest someOtherTestTask --tests *WebTest*ui


allure generate -o build/reports/allure -- build/allure-results
allure report open -o build/reportgs/allure/