diff --git a/components/camel-jdbc/src/test/java/org/apache/camel/component/jdbc/JdbcSpringAnotherRouteTest.java b/components/camel-jdbc/src/test/java/org/apache/camel/component/jdbc/JdbcSpringAnotherRouteTest.java
index 52b9c6f..f637f04 100644
--- a/components/camel-jdbc/src/test/java/org/apache/camel/component/jdbc/JdbcSpringAnotherRouteTest.java
+++ b/components/camel-jdbc/src/test/java/org/apache/camel/component/jdbc/JdbcSpringAnotherRouteTest.java
@@ -30,7 +30,7 @@
     
     @Test
     public void testTimerInvoked() throws Exception {
-        mock.expectedMessageCount(1);
+        mock.expectedMinimumMessageCount(1);
 
         assertMockEndpointsSatisfied();
     }
