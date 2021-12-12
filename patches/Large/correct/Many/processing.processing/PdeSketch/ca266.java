diff --git a/app/PdeSketch.java b/app/PdeSketch.java
index 27aa70e..5111af0 100644
--- a/app/PdeSketch.java
+++ b/app/PdeSketch.java
@@ -985,7 +985,8 @@
     }
 
     // if 'data' folder is large, set to external runtime
-    if (PdeBase.calcFolderSize(dataFolder) > 768 * 1024) {  // if > 768k
+    if (dataFolder.exists() &&
+        PdeBase.calcFolderSize(dataFolder) > 768 * 1024) {  // if > 768k
       externalRuntime = true;
     }
 
