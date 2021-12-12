diff --git a/activeio/activeio-core/src/main/java/org/apache/activeio/adapter/SyncToAsyncChannelServer.java b/activeio/activeio-core/src/main/java/org/apache/activeio/adapter/SyncToAsyncChannelServer.java
index 92308a0..2c3ec3b 100644
--- a/activeio/activeio-core/src/main/java/org/apache/activeio/adapter/SyncToAsyncChannelServer.java
+++ b/activeio/activeio-core/src/main/java/org/apache/activeio/adapter/SyncToAsyncChannelServer.java
@@ -62,7 +62,7 @@
         }
 
         // Can we just just undo the adaptor
-        if( channel.getClass() == SyncToAsyncChannel.class ) {
+        if( channel.getClass() == AsyncToSyncChannelServer.class ) {
             return ((AsyncToSyncChannelServer)channel).getAsyncChannelServer();
         }
         
