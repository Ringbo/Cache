diff --git a/fml/common/cpw/mods/fml/common/registry/GameData.java b/fml/common/cpw/mods/fml/common/registry/GameData.java
index 3d51b86..7222216 100644
--- a/fml/common/cpw/mods/fml/common/registry/GameData.java
+++ b/fml/common/cpw/mods/fml/common/registry/GameData.java
@@ -285,7 +285,7 @@
     }
     static Item findItem(String modId, String name)
     {
-        if (modObjectTable == null)
+        if (modObjectTable == null || !modObjectTable.contains(modId, name))
         {
             return null;
         }
@@ -301,7 +301,7 @@
         }
 
         Integer blockId = modObjectTable.get(modId, name);
-        if (blockId >= Block.field_71973_m.length)
+        if (blockId == null || blockId >= Block.field_71973_m.length)
         {
             return null;
         }
