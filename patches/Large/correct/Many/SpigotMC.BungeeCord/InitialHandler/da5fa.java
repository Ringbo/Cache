diff --git a/proxy/src/main/java/net/md_5/bungee/connection/InitialHandler.java b/proxy/src/main/java/net/md_5/bungee/connection/InitialHandler.java
index 042a873..67234e8 100644
--- a/proxy/src/main/java/net/md_5/bungee/connection/InitialHandler.java
+++ b/proxy/src/main/java/net/md_5/bungee/connection/InitialHandler.java
@@ -167,7 +167,7 @@
         {
             pingBack.done( new ServerPing(
                     new ServerPing.Protocol( bungee.getGameVersion(), bungee.getProtocolVersion() ),
-                    new ServerPing.Players( bungee.getOnlineCount(), listener.getMaxPlayers() ),
+                    new ServerPing.Players( listener.getMaxPlayers(), bungee.getOnlineCount() ),
                     motd ),
                     null );
         }
