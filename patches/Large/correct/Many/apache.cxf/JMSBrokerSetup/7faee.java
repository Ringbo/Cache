diff --git a/rt/transports/jms/src/test/java/org/apache/cxf/transport/jms/JMSBrokerSetup.java b/rt/transports/jms/src/test/java/org/apache/cxf/transport/jms/JMSBrokerSetup.java
index 230fbc5..9dfa46c 100644
--- a/rt/transports/jms/src/test/java/org/apache/cxf/transport/jms/JMSBrokerSetup.java
+++ b/rt/transports/jms/src/test/java/org/apache/cxf/transport/jms/JMSBrokerSetup.java
@@ -55,7 +55,7 @@
         Exception exception;
         
         
-        public JMSEmbeddedBroker(String url) {
+        JMSEmbeddedBroker(String url) {
             brokerUrl = url;
         }
         
