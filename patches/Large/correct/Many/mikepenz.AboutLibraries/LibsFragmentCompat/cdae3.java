diff --git a/library/src/main/java/com/mikepenz/aboutlibraries/LibsFragmentCompat.java b/library/src/main/java/com/mikepenz/aboutlibraries/LibsFragmentCompat.java
index 2478cc6..540ff07 100644
--- a/library/src/main/java/com/mikepenz/aboutlibraries/LibsFragmentCompat.java
+++ b/library/src/main/java/com/mikepenz/aboutlibraries/LibsFragmentCompat.java
@@ -100,7 +100,7 @@
         }
     }
 
-    private void executeLibTask(LibraryTask libraryTask) {
+    private void executeLibTask(AsyncTask libraryTask) {
         if(libraryTask != null) libraryTask.execute();
     }
 
