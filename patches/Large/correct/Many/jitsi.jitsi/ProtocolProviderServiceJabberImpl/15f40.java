diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/ProtocolProviderServiceJabberImpl.java b/src/net/java/sip/communicator/impl/protocol/jabber/ProtocolProviderServiceJabberImpl.java
index cee6093..e27ebb0 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/ProtocolProviderServiceJabberImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/ProtocolProviderServiceJabberImpl.java
@@ -2236,7 +2236,7 @@
         public void connectionClosedOnError(Exception exception)
         {
             logger.error("connectionClosedOnError " +
-                         exception.getLocalizedMessage());
+                         exception.getLocalizedMessage(), exception);
 
             if(exception instanceof XMPPException)
             {
