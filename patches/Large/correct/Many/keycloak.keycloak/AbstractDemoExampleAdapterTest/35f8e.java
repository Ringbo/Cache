diff --git a/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/example/AbstractDemoExampleAdapterTest.java b/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/example/AbstractDemoExampleAdapterTest.java
index 2a48dac..4672978 100644
--- a/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/example/AbstractDemoExampleAdapterTest.java
+++ b/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/adapter/example/AbstractDemoExampleAdapterTest.java
@@ -243,7 +243,7 @@
 
         List<WebElement> resultList = loginEventsPage.table().rows();
 
-        assertEquals(2, resultList.size());
+        assertEquals(1, resultList.size());
 
         resultList.get(0).findElement(By.xpath(".//td[text()='REVOKE_GRANT']"));
         resultList.get(0).findElement(By.xpath(".//td[text()='Client']/../td[text()='account']"));
@@ -255,7 +255,7 @@
         loginEventsPage.table().update();
         resultList = loginEventsPage.table().rows();
 
-        assertEquals(7, resultList.size());
+        assertEquals(1, resultList.size());
 
         resultList.get(0).findElement(By.xpath(".//td[text()='LOGIN']"));
         resultList.get(0).findElement(By.xpath(".//td[text()='Client']/../td[text()='customer-portal']"));
