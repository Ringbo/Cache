diff --git a/activemq-broker/src/main/java/org/apache/activemq/broker/BrokerService.java b/activemq-broker/src/main/java/org/apache/activemq/broker/BrokerService.java
index 1cc1ce9..a018e44 100644
--- a/activemq-broker/src/main/java/org/apache/activemq/broker/BrokerService.java
+++ b/activemq-broker/src/main/java/org/apache/activemq/broker/BrokerService.java
@@ -471,7 +471,7 @@
     }
 
     public boolean isStarted() {
-        return started.get();
+        return started.get() && startedLatch.getCount() == 0;
     }
 
     /**
@@ -868,7 +868,7 @@
      */
     public boolean waitUntilStarted() {
         boolean waitSucceeded = false;
-        while (isStarted() && !stopped.get() && !waitSucceeded) {
+        while (!isStarted() && !stopped.get() && !waitSucceeded) {
             try {
                 if (startException != null) {
                     return waitSucceeded;
