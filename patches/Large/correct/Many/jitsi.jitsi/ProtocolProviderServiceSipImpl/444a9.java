diff --git a/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java b/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
index 901bb79..bb368f0 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
@@ -319,7 +319,8 @@
         throws OperationFailedException
     {
         if(getRegistrationState().equals(RegistrationState.UNREGISTERED)
-            || getRegistrationState().equals(RegistrationState.UNREGISTERING))
+            || getRegistrationState().equals(RegistrationState.UNREGISTERING)
+                || getRegistrationState().equals(RegistrationState.CONNECTION_FAILED))
         {
             return;
         }
