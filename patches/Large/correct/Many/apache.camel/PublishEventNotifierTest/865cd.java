diff --git a/camel-core/src/test/java/org/apache/camel/management/PublishEventNotifierTest.java b/camel-core/src/test/java/org/apache/camel/management/PublishEventNotifierTest.java
index 9b3e642..467f039 100644
--- a/camel-core/src/test/java/org/apache/camel/management/PublishEventNotifierTest.java
+++ b/camel-core/src/test/java/org/apache/camel/management/PublishEventNotifierTest.java
@@ -41,7 +41,7 @@
 
     public void testExchangeDone() throws Exception {
         getMockEndpoint("mock:result").expectedMessageCount(1);
-        getMockEndpoint("mock:event").expectedMessageCount(5);
+        getMockEndpoint("mock:event").expectedMessageCount(6);
 
         template.sendBody("direct:start", "Hello World");
 
@@ -49,7 +49,7 @@
     }
 
     public void testExchangeFailed() throws Exception {
-        getMockEndpoint("mock:event").expectedMessageCount(5);
+        getMockEndpoint("mock:event").expectedMessageCount(6);
 
         try {
             template.sendBody("direct:fail", "Hello World");
