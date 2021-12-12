diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetBasicTelephonyJabberImpl.java b/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetBasicTelephonyJabberImpl.java
index 6d45f71..ac6bfa2 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetBasicTelephonyJabberImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetBasicTelephonyJabberImpl.java
@@ -266,7 +266,7 @@
         if(di != null)
         {
             if (logger.isInfoEnabled())
-                logger.info(fullCalleeURI + ": jingle supported ");
+                logger.info(calleeAddress + ": jingle supported ");
         }
         else
         {
@@ -274,7 +274,7 @@
                 logger.info(calleeAddress + ": jingle not supported ?");
             throw new OperationFailedException(
                     "Failed to create OutgoingJingleSession.\n"
-                        + fullCalleeURI + " does not support jingle",
+                        + calleeAddress + " does not support jingle",
                     OperationFailedException.INTERNAL_ERROR);
         }
 
