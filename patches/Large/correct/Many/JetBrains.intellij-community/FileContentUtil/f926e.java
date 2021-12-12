diff --git a/platform/lang-api/src/com/intellij/util/FileContentUtil.java b/platform/lang-api/src/com/intellij/util/FileContentUtil.java
index b9de94a..bbe9bf4 100644
--- a/platform/lang-api/src/com/intellij/util/FileContentUtil.java
+++ b/platform/lang-api/src/com/intellij/util/FileContentUtil.java
@@ -67,7 +67,7 @@
         }
       }
     }
-    FileContentUtilCore.reparseFiles(files);
+    FileContentUtilCore.reparseFiles(fileSet);
   }
 
   public static void reparseOpenedFiles() {
