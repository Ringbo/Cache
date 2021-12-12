diff --git a/src/protocol/jms/org/apache/jmeter/protocol/jms/sampler/Receiver.java b/src/protocol/jms/org/apache/jmeter/protocol/jms/sampler/Receiver.java
index c34a011..f3615b7 100644
--- a/src/protocol/jms/org/apache/jmeter/protocol/jms/sampler/Receiver.java
+++ b/src/protocol/jms/org/apache/jmeter/protocol/jms/sampler/Receiver.java
@@ -81,7 +81,7 @@
                     if (reply.getJMSCorrelationID() == null) {
                         log.warn("Received message with correlation id null. Discarding message ...");
                     } else {
-                        MessageAdmin.getAdmin().putReply(reply.getJMSMessageID(), reply);
+                        MessageAdmin.getAdmin().putReply(reply.getJMSCorrelationID(), reply);
                     }
                 }
 
