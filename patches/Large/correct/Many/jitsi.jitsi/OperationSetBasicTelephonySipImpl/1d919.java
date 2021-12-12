diff --git a/src/net/java/sip/communicator/impl/protocol/sip/OperationSetBasicTelephonySipImpl.java b/src/net/java/sip/communicator/impl/protocol/sip/OperationSetBasicTelephonySipImpl.java
index c655180..94cd189 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/OperationSetBasicTelephonySipImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/OperationSetBasicTelephonySipImpl.java
@@ -527,7 +527,8 @@
                                            , sourceProvider);
         }
         //errors
-        else if ( response.getStatusCode() / 100 == 4 )
+        else if ( response.getStatusCode() / 100 == 4 ||
+            response.getStatusCode() / 100 == 5)
         {
             CallParticipantSipImpl callParticipant = activeCallsRepository
                 .findCallParticipant(clientTransaction.getDialog());
