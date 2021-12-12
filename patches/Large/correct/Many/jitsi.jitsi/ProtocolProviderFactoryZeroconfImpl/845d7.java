diff --git a/src/net/java/sip/communicator/impl/protocol/zeroconf/ProtocolProviderFactoryZeroconfImpl.java b/src/net/java/sip/communicator/impl/protocol/zeroconf/ProtocolProviderFactoryZeroconfImpl.java
index 4311963..e900129 100644
--- a/src/net/java/sip/communicator/impl/protocol/zeroconf/ProtocolProviderFactoryZeroconfImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/zeroconf/ProtocolProviderFactoryZeroconfImpl.java
@@ -190,7 +190,7 @@
         //unregister the protocol provider
         ServiceReference serRef = getProviderForAccount(accountID);
 
-        if(serRef != null)
+        if(serRef == null)
             return false;
 
         ProtocolProviderService protocolProvider
