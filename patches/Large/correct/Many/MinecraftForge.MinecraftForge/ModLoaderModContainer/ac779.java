diff --git a/fml/bukkit/cpw/mods/fml/server/ModLoaderModContainer.java b/fml/bukkit/cpw/mods/fml/server/ModLoaderModContainer.java
index 7dc4112..54f72e9 100644
--- a/fml/bukkit/cpw/mods/fml/server/ModLoaderModContainer.java
+++ b/fml/bukkit/cpw/mods/fml/server/ModLoaderModContainer.java
@@ -43,11 +43,11 @@
     private Class <? extends BaseMod > modClazz;
     private BaseMod mod;
     private boolean isTicking;
-    private String modSource ;
+    private File modSource ;
     private ArrayList<String> dependencies;
     private ArrayList<String> preDependencies;
     private ArrayList<String> postDependencies;
-    public ModLoaderModContainer(Class <? extends BaseMod > modClazz, String modSource)
+    public ModLoaderModContainer(Class <? extends BaseMod > modClazz, File modSource)
     {
         this.modClazz = modClazz;
         this.modSource = modSource;
@@ -334,7 +334,7 @@
     }
 
     @Override
-    public String getSource()
+    public File getSource()
     {
         return modSource;
     }
@@ -475,7 +475,7 @@
 
     public String toString()
     {
-        return modSource;
+        return modSource.getName();
     }
 
     @Override
