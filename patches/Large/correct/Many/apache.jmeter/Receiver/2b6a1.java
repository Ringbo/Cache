diff --git a/src/protocol/jms/org/apache/jmeter/protocol/jms/sampler/Receiver.java b/src/protocol/jms/org/apache/jmeter/protocol/jms/sampler/Receiver.java
index e9bd82c..4d59238 100644
--- a/src/protocol/jms/org/apache/jmeter/protocol/jms/sampler/Receiver.java
+++ b/src/protocol/jms/org/apache/jmeter/protocol/jms/sampler/Receiver.java
@@ -77,7 +77,7 @@
                     if (reply.getJMSCorrelationID() == null) {
                         log.warn("Received message with correlation id null. Discarding message ...");
                     } else {
-                        MessageAdmin.getAdmin().putReply(reply.getJMSCorrelationID(), reply);
+                        MessageAdmin.getAdmin().putReply(reply.getJMSMessageID(), reply);
                     }
                 }
 
