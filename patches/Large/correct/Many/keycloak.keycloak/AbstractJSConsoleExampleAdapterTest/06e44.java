diff --git a/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/example/AbstractJSConsoleExampleAdapterTest.java b/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/example/AbstractJSConsoleExampleAdapterTest.java
index 5b7888c..6eeca5d 100644
--- a/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/example/AbstractJSConsoleExampleAdapterTest.java
+++ b/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/example/AbstractJSConsoleExampleAdapterTest.java
@@ -214,7 +214,7 @@
 
         List<WebElement> resultList = loginEventsPage.table().rows();
 
-        assertEquals(2, resultList.size());
+        assertEquals(1, resultList.size());
 
         resultList.get(0).findElement(By.xpath(".//td[text()='REVOKE_GRANT']"));
         resultList.get(0).findElement(By.xpath(".//td[text()='Client']/../td[text()='account']"));
@@ -226,7 +226,7 @@
         loginEventsPage.table().update();
         resultList = loginEventsPage.table().rows();
 
-        assertEquals(7, resultList.size());
+        assertEquals(1, resultList.size());
 
         resultList.get(0).findElement(By.xpath(".//td[text()='LOGIN']"));
         resultList.get(0).findElement(By.xpath(".//td[text()='Client']/../td[text()='js-console']"));
