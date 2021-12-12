diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/FilePathImpl.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/FilePathImpl.java
index 454562e..1b8d8e9 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/FilePathImpl.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/FilePathImpl.java
@@ -137,7 +137,7 @@
     if (pos < 0 || pos == path.indexOf(File.separatorChar)) {
       return null;
     }
-    return new FilePathImpl(new File(path.substring(0, pos)), false);
+    return new FilePathImpl(new File(path.substring(0, pos)), true);
   }
 
   public VirtualFile getVirtualFile() {
