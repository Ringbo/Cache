diff --git a/systests/transport-jms/src/test/java/org/apache/cxf/systest/jms/shared/JMSSharedQueueTest.java b/systests/transport-jms/src/test/java/org/apache/cxf/systest/jms/shared/JMSSharedQueueTest.java
index b644d5a..97e4b1f 100644
--- a/systests/transport-jms/src/test/java/org/apache/cxf/systest/jms/shared/JMSSharedQueueTest.java
+++ b/systests/transport-jms/src/test/java/org/apache/cxf/systest/jms/shared/JMSSharedQueueTest.java
@@ -70,11 +70,11 @@
         private String prefix;
         private volatile Throwable ex;
 
-        public ClientRunnable(HelloWorldPortType port) {
+        ClientRunnable(HelloWorldPortType port) {
             this.port = port;
         }
 
-        public ClientRunnable(HelloWorldPortType port, String prefix) {
+        ClientRunnable(HelloWorldPortType port, String prefix) {
             this.port = port;
             this.prefix = prefix;
         }
