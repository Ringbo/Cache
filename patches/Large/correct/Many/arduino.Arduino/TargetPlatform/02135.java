diff --git a/app/src/processing/app/debug/TargetPlatform.java b/app/src/processing/app/debug/TargetPlatform.java
index 3dfb29f..2666347 100644
--- a/app/src/processing/app/debug/TargetPlatform.java
+++ b/app/src/processing/app/debug/TargetPlatform.java
@@ -71,7 +71,7 @@
     if (!boardsFile.exists() || !boardsFile.canRead())
       throw new TargetPlatformException(
           format(_("Could not find boards.txt in {0}. Is it pre-1.5?"),
-                 boardsFile.getAbsolutePath()));
+                 folder.getAbsolutePath()));
 
     // Load boards
     try {
