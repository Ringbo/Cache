diff --git a/activeio/activeio-core/src/main/java/org/apache/activeio/adapter/AsyncToSyncChannelServer.java b/activeio/activeio-core/src/main/java/org/apache/activeio/adapter/AsyncToSyncChannelServer.java
index 26511a8..94cd125 100644
--- a/activeio/activeio-core/src/main/java/org/apache/activeio/adapter/AsyncToSyncChannelServer.java
+++ b/activeio/activeio-core/src/main/java/org/apache/activeio/adapter/AsyncToSyncChannelServer.java
@@ -58,7 +58,7 @@
         }
 
         // Can we just just undo the adaptor
-        if( channel.getClass() == SyncToAsyncChannel.class ) {
+        if( channel.getClass() == SyncToAsyncChannelServer.class ) {
             return ((SyncToAsyncChannelServer)channel).getSynchChannelServer();
         }
         
