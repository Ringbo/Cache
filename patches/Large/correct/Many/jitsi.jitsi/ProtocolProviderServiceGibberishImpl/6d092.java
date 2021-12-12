diff --git a/src/net/java/sip/communicator/impl/protocol/gibberish/ProtocolProviderServiceGibberishImpl.java b/src/net/java/sip/communicator/impl/protocol/gibberish/ProtocolProviderServiceGibberishImpl.java
index d300702..18152f6 100644
--- a/src/net/java/sip/communicator/impl/protocol/gibberish/ProtocolProviderServiceGibberishImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/gibberish/ProtocolProviderServiceGibberishImpl.java
@@ -96,7 +96,7 @@
             this.accountID = accountID;
 
             //initialize the presence operationset
-            OperationSetPersistentPresence persistentPresence =
+            OperationSetPersistentPresenceGibberishImpl persistentPresence =
                 new OperationSetPersistentPresenceGibberishImpl(this);
 
             supportedOperationSets.put(
@@ -123,7 +123,8 @@
 
             //initialize the typing notifications operation set
             OperationSetTypingNotifications typingNotifications =
-                new OperationSetTypingNotificationsGibberishImpl(this);
+                new OperationSetTypingNotificationsGibberishImpl(
+                        this, persistentPresence);
 
             supportedOperationSets.put(
                 OperationSetTypingNotifications.class.getName(),
