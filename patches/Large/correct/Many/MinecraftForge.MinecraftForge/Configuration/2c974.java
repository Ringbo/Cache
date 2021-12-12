diff --git a/common/net/minecraftforge/common/Configuration.java b/common/net/minecraftforge/common/Configuration.java
index fb593e7..70a651d 100644
--- a/common/net/minecraftforge/common/Configuration.java
+++ b/common/net/minecraftforge/common/Configuration.java
@@ -194,7 +194,7 @@
                 FMLLog.warning("Config \"%s\" Category: \"%s\" Key: \"%s\" Default: %d", fileName, category, key, defaultID);
             }
 
-            if (Item.itemsList[defaultShift] == null && !configMarkers[defaultShift] && defaultShift > Block.blocksList.length)
+            if (Item.itemsList[defaultShift] == null && !configMarkers[defaultShift] && defaultShift >= Block.blocksList.length)
             {
                 prop.value = Integer.toString(defaultID);
                 configMarkers[defaultShift] = true;
