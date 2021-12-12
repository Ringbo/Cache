diff --git a/src/net/java/sip/communicator/impl/protocol/icq/ProtocolProviderServiceIcqImpl.java b/src/net/java/sip/communicator/impl/protocol/icq/ProtocolProviderServiceIcqImpl.java
index ac4525f..9262b0f 100644
--- a/src/net/java/sip/communicator/impl/protocol/icq/ProtocolProviderServiceIcqImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/icq/ProtocolProviderServiceIcqImpl.java
@@ -264,7 +264,7 @@
             // it seems icq servers doesn't accept password with
             // length more then 8. But allow such registrations
             // we must trim such passwords to 8 characters
-            if(password.length() > 8)
+            if(USING_ICQ && password.length() > 8)
                 password = password.substring(0, 8);
             
             //init the necessary objects
