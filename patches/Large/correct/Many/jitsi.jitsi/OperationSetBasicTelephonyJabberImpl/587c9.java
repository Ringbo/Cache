diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetBasicTelephonyJabberImpl.java b/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetBasicTelephonyJabberImpl.java
index 0fea747..c1f7d28 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetBasicTelephonyJabberImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/OperationSetBasicTelephonyJabberImpl.java
@@ -318,7 +318,7 @@
         // If there's no fullCalleeURI specified we'll discover the most
         // connected one with highest priority.
         if (fullCalleeURI == null)
-            fullCalleeURI = (isPrivateMessagingContact? 
+            fullCalleeURI = (!isPrivateMessagingContact? 
                 discoverFullJid(calleeAddress, alwaysCallGtalk) : 
                     calleeAddress);
 
