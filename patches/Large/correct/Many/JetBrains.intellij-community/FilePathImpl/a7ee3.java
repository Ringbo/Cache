diff --git a/source/com/intellij/openapi/vcs/FilePathImpl.java b/source/com/intellij/openapi/vcs/FilePathImpl.java
index 06c65d1..4ae4cfa 100644
--- a/source/com/intellij/openapi/vcs/FilePathImpl.java
+++ b/source/com/intellij/openapi/vcs/FilePathImpl.java
@@ -65,7 +65,7 @@
       return myVirtualFile.getPath();
     }
     else {
-      return myFile.getParent();
+      return myFile.getPath();
     }
   }
 
