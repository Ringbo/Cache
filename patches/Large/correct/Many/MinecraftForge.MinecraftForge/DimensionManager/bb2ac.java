diff --git a/common/net/minecraftforge/common/DimensionManager.java b/common/net/minecraftforge/common/DimensionManager.java
index 63b417e..c458c2e 100644
--- a/common/net/minecraftforge/common/DimensionManager.java
+++ b/common/net/minecraftforge/common/DimensionManager.java
@@ -94,7 +94,7 @@
             tmp.add(entry.getValue());
         }
 
-        MinecraftServer.getServer().theWorldServer = tmp.toArray(new WorldServer[0]);
+        MinecraftServer.getServer().worldServers = tmp.toArray(new WorldServer[0]);
         MinecraftServer.getServer().worldTickTimes.put(id, new long[100]);
     }
 
