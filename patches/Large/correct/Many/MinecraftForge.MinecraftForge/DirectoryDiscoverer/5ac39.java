diff --git a/fml/src/main/java/net/minecraftforge/fml/common/discovery/DirectoryDiscoverer.java b/fml/src/main/java/net/minecraftforge/fml/common/discovery/DirectoryDiscoverer.java
index 4608233..2ed403c 100644
--- a/fml/src/main/java/net/minecraftforge/fml/common/discovery/DirectoryDiscoverer.java
+++ b/fml/src/main/java/net/minecraftforge/fml/common/discovery/DirectoryDiscoverer.java
@@ -38,7 +38,7 @@
         @Override
         public boolean accept(File file)
         {
-            return (file.isFile() && classFile.matcher(file.getName()).find()) || file.isDirectory();
+            return (file.isFile() && classFile.matcher(file.getName()).matches()) || file.isDirectory();
         }
     }
 
