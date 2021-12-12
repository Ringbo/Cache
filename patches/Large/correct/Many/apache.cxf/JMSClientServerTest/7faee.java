diff --git a/systests/transport-jms/src/test/java/org/apache/cxf/systest/jms/JMSClientServerTest.java b/systests/transport-jms/src/test/java/org/apache/cxf/systest/jms/JMSClientServerTest.java
index 973985b..376e8a2 100644
--- a/systests/transport-jms/src/test/java/org/apache/cxf/systest/jms/JMSClientServerTest.java
+++ b/systests/transport-jms/src/test/java/org/apache/cxf/systest/jms/JMSClientServerTest.java
@@ -186,7 +186,7 @@
         class TestAsyncHandler implements AsyncHandler<String> {
             String expected;
             
-            public TestAsyncHandler(String x) {
+            TestAsyncHandler(String x) {
                 expected = x;
             }
             
