diff --git a/activemq-ra/src/main/java/org/apache/activemq/ra/ActiveMQEndpointWorker.java b/activemq-ra/src/main/java/org/apache/activemq/ra/ActiveMQEndpointWorker.java
index 4160332..69a7b04 100755
--- a/activemq-ra/src/main/java/org/apache/activemq/ra/ActiveMQEndpointWorker.java
+++ b/activemq-ra/src/main/java/org/apache/activemq/ra/ActiveMQEndpointWorker.java
@@ -94,7 +94,7 @@
                 //
             }
 
-            public synchronized void run() {
+            public void run() {
                 currentReconnectDelay = INITIAL_RECONNECT_DELAY;
                 MessageActivationSpec activationSpec = endpointActivationKey.getActivationSpec();
                 if ( LOG.isInfoEnabled() ) {
