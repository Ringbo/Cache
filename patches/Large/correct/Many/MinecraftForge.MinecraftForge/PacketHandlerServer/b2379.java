diff --git a/forge/forge_server/src/net/minecraft/src/forge/PacketHandlerServer.java b/forge/forge_server/src/net/minecraft/src/forge/PacketHandlerServer.java
index 3ba981e..9d15924 100644
--- a/forge/forge_server/src/net/minecraft/src/forge/PacketHandlerServer.java
+++ b/forge/forge_server/src/net/minecraft/src/forge/PacketHandlerServer.java
@@ -73,12 +73,12 @@
             {
                 continue;
             }
-            boolean found = true;
+            boolean found = false;
             for (String modName : pkt.Mods)
             {
                 if (modName.equals(mod.toString()))
                 {
-                    found = false;
+                    found = true;
                     break;
                 }
             }
