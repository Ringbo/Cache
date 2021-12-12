diff --git a/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/continuations/JMSContinuation.java b/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/continuations/JMSContinuation.java
index 4790a53..d7dbcb1 100644
--- a/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/continuations/JMSContinuation.java
+++ b/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/continuations/JMSContinuation.java
@@ -169,7 +169,7 @@
                 if (limit < 0 || limit > 100) {
                     limit = 70;
                 }
-                limit = (limit * jmsConfig.getReconnectPercentOfMax()) / 100; 
+                limit = (limit * jmsConfig.getMaxSuspendedContinuations()) / 100; 
             
                 if (continuations.size() <= limit) {
                     jmsListener.start();
