diff --git a/src/net/java/sip/communicator/impl/protocol/icq/ProtocolProviderServiceIcqImpl.java b/src/net/java/sip/communicator/impl/protocol/icq/ProtocolProviderServiceIcqImpl.java
index 3dc8b44..426855a 100644
--- a/src/net/java/sip/communicator/impl/protocol/icq/ProtocolProviderServiceIcqImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/icq/ProtocolProviderServiceIcqImpl.java
@@ -216,7 +216,7 @@
             // it seems icq servers doesn't accept password with
             // length more then 8. But allow such registrations
             // we must trim such passwords to 8 characters
-            if(password.length() > 0)
+            if(password.length() > 8)
                 password = password.substring(0, 8);
 
             //init the necessary objects
