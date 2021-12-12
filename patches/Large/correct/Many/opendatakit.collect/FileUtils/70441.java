diff --git a/src/org/odk/collect/android/utilities/FileUtils.java b/src/org/odk/collect/android/utilities/FileUtils.java
index 5e2f405..cfe7eb4 100644
--- a/src/org/odk/collect/android/utilities/FileUtils.java
+++ b/src/org/odk/collect/android/utilities/FileUtils.java
@@ -93,8 +93,8 @@
         }
         File[] dirs = dir.listFiles();
         for (int i = 0; i < dirs.length; i++) {
-        	// skip all the directories
-        	if (dirs[i].isDirectory())
+        	// skip all the directories and invisible files
+        	if (dirs[i].isDirectory() || dirs[i].getName().startsWith("."))
         		continue;
         	
             String formName = dirs[i].getName();
