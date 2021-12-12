diff --git a/src/net/java/sip/communicator/impl/protocol/yahoo/OperationSetPersistentPresenceYahooImpl.java b/src/net/java/sip/communicator/impl/protocol/yahoo/OperationSetPersistentPresenceYahooImpl.java
index b6d0ac2..812bb36 100644
--- a/src/net/java/sip/communicator/impl/protocol/yahoo/OperationSetPersistentPresenceYahooImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/yahoo/OperationSetPersistentPresenceYahooImpl.java
@@ -386,7 +386,7 @@
 
         try
         {
-            if(statusMessage != null)
+            if(statusMessage != null && statusMessage.length() != 0)
             {
                 boolean isAvailable = false;
 
