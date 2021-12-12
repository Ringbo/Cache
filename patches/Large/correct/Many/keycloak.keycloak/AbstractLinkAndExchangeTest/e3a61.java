diff --git a/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/servlet/AbstractLinkAndExchangeTest.java b/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/servlet/AbstractLinkAndExchangeTest.java
index bbc5cdb..312517c 100644
--- a/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/servlet/AbstractLinkAndExchangeTest.java
+++ b/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/servlet/AbstractLinkAndExchangeTest.java
@@ -570,7 +570,7 @@
 
         // Login to account mgmt first
         profilePage.open(CHILD_IDP);
-        WaitUtils.waitForPageToLoad(driver);
+        WaitUtils.waitForPageToLoad();
 
         Assert.assertTrue(loginPage.isCurrent(CHILD_IDP));
         loginPage.login("child", "password");
@@ -615,7 +615,7 @@
 
         // Login to account mgmt first
         profilePage.open(CHILD_IDP);
-        WaitUtils.waitForPageToLoad(driver);
+        WaitUtils.waitForPageToLoad();
 
         Assert.assertTrue(loginPage.isCurrent(CHILD_IDP));
         loginPage.login("child", "password");
@@ -649,7 +649,7 @@
 
     private void navigateTo(String uri) {
         driver.navigate().to(uri);
-        WaitUtils.waitForPageToLoad(driver);
+        WaitUtils.waitForPageToLoad();
     }
 
     
