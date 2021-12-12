diff --git a/activemq-core/src/main/java/org/activemq/transport/stomp/Send.java b/activemq-core/src/main/java/org/activemq/transport/stomp/Send.java
index dc67cef..f7c4f69 100644
--- a/activemq-core/src/main/java/org/activemq/transport/stomp/Send.java
+++ b/activemq-core/src/main/java/org/activemq/transport/stomp/Send.java
@@ -96,9 +96,9 @@
         if (expiration != null) {
             msg.setJMSExpiration(asLong(expiration));
         }
-        Object priority = headers.remove(Stomp.Headers.Send.PRORITY);
+        Object priority = headers.remove(Stomp.Headers.Send.PRIORITY);
         if (priority != null) {
-            msg.setJMSExpiration(asInt(priority));
+            msg.setJMSPriority(asInt(priority));
         }
 
         msg.setJMSReplyTo(DestinationNamer.convert((String) headers.remove(Stomp.Headers.Send.REPLY_TO)));
