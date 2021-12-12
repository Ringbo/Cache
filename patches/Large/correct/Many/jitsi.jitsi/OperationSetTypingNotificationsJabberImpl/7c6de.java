diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetTypingNotificationsJabberImpl.java b/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetTypingNotificationsJabberImpl.java
index 086f99f..37ef9e0 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetTypingNotificationsJabberImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetTypingNotificationsJabberImpl.java
@@ -434,7 +434,7 @@
                 fireTypingNotificationsDeliveryFailedEvent(
                     sourceContact, evtCode);
             else  if(evtCode != STATE_UNKNOWN)
-                fireTypingNotificationsEvent(sourceContact, STATE_STOPPED);
+                fireTypingNotificationsEvent(sourceContact, evtCode);
             else
                 logger.warn("Unknown typing state!");
         }
