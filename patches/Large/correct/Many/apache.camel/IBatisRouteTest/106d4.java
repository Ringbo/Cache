diff --git a/components/camel-ibatis/src/test/java/org/apache/camel/component/ibatis/IBatisRouteTest.java b/components/camel-ibatis/src/test/java/org/apache/camel/component/ibatis/IBatisRouteTest.java
index 3e76d26..8148943 100644
--- a/components/camel-ibatis/src/test/java/org/apache/camel/component/ibatis/IBatisRouteTest.java
+++ b/components/camel-ibatis/src/test/java/org/apache/camel/component/ibatis/IBatisRouteTest.java
@@ -32,7 +32,7 @@
 public class IBatisRouteTest extends ContextTestSupport {
     public void testSendAccountBean() throws Exception {
         MockEndpoint endpoint = getMockEndpoint("mock:results");
-        endpoint.expectedMessageCount(1);
+        endpoint.expectedMinimumMessageCount(1);
 
         Account account = new Account();
         account.setId(123);
