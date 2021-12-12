diff --git a/activemq-broker/src/main/java/org/apache/activemq/broker/LockableServiceSupport.java b/activemq-broker/src/main/java/org/apache/activemq/broker/LockableServiceSupport.java
index f47b773..2475201 100644
--- a/activemq-broker/src/main/java/org/apache/activemq/broker/LockableServiceSupport.java
+++ b/activemq-broker/src/main/java/org/apache/activemq/broker/LockableServiceSupport.java
@@ -131,7 +131,7 @@
 
     protected void stopBroker() {
         // we can no longer keep the lock so lets fail
-        LOG.info(brokerService.getBrokerName() + ", no longer able to keep the exclusive lock so giving up being a master");
+        LOG.error(brokerService.getBrokerName() + ", no longer able to keep the exclusive lock so giving up being a master");
         try {
             if( brokerService.isRestartAllowed() ) {
                 brokerService.requestRestart();
