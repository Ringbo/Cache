diff --git a/fml/src/main/java/cpw/mods/fml/common/discovery/DirectoryDiscoverer.java b/fml/src/main/java/cpw/mods/fml/common/discovery/DirectoryDiscoverer.java
index 199ec600..9aa7218 100644
--- a/fml/src/main/java/cpw/mods/fml/common/discovery/DirectoryDiscoverer.java
+++ b/fml/src/main/java/cpw/mods/fml/common/discovery/DirectoryDiscoverer.java
@@ -38,7 +38,7 @@
         @Override
         public boolean accept(File file)
         {
-            return (file.isFile() && classFile.matcher(file.getName()).find()) || file.isDirectory();
+            return (file.isFile() && classFile.matcher(file.getName()).matches()) || file.isDirectory();
         }
     }
 
