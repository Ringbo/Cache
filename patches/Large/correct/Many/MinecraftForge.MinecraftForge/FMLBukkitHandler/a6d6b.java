diff --git a/fml/bukkit/cpw/mods/fml/server/FMLBukkitHandler.java b/fml/bukkit/cpw/mods/fml/server/FMLBukkitHandler.java
index 4660707..0dbc537 100644
--- a/fml/bukkit/cpw/mods/fml/server/FMLBukkitHandler.java
+++ b/fml/bukkit/cpw/mods/fml/server/FMLBukkitHandler.java
@@ -184,11 +184,11 @@
     /**
      * Load the supplied mod class into a mod container
      */
-    public ModContainer loadBaseModMod(Class<?> clazz, String canonicalPath)
+    public ModContainer loadBaseModMod(Class<?> clazz, File canonicalFile)
     {
         @SuppressWarnings("unchecked")
         Class <? extends BaseMod > bmClazz = (Class <? extends BaseMod >) clazz;
-        return new ModLoaderModContainer(bmClazz, canonicalPath);
+        return new ModLoaderModContainer(bmClazz, canonicalFile);
     }
 
     /**
