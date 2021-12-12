diff --git a/forge/forge_common/net/minecraft/src/forge/MessageManager.java b/forge/forge_common/net/minecraft/src/forge/MessageManager.java
index f18b286..3880172 100644
--- a/forge/forge_common/net/minecraft/src/forge/MessageManager.java
+++ b/forge/forge_common/net/minecraft/src/forge/MessageManager.java
@@ -416,7 +416,7 @@
             }
         }
 
-        if (connections.contains(manager))
+        if (connections.containsKey(manager))
         {
             ConnectionInstance con = getConnection(manager);
             IPacketHandler[] handlers = con.getChannelHandlers(channel);
