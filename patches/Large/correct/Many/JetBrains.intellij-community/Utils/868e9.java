diff --git a/updater/src/com/intellij/updater/Utils.java b/updater/src/com/intellij/updater/Utils.java
index a71121e..03ca264 100644
--- a/updater/src/com/intellij/updater/Utils.java
+++ b/updater/src/com/intellij/updater/Utils.java
@@ -20,7 +20,7 @@
       myTempDir = File.createTempFile("idea.updater.", ".tmp");
       delete(myTempDir);
       myTempDir.mkdirs();
-      Runner.logger.info("created temp file: " + myTempDir.getCanonicalPath());
+      Runner.logger.info("created temp file: " + myTempDir.getPath());
     }
 
     return File.createTempFile("temp.", ".tmp", myTempDir);
@@ -29,16 +29,16 @@
   public static File createTempDir() throws IOException {
     File result = createTempFile();
     delete(result);
-    Runner.logger.info("deleted tmp dir: " + result.getCanonicalPath());
+    Runner.logger.info("deleted tmp dir: " + result.getPath());
     result.mkdirs();
-    Runner.logger.info("created tmp dir: " + result.getCanonicalPath());
+    Runner.logger.info("created tmp dir: " + result.getPath());
     return result;
   }
 
   public static void cleanup() throws IOException {
     if (myTempDir == null) return;
     delete(myTempDir);
-    Runner.logger.info("deleted file " + myTempDir.getCanonicalPath());
+    Runner.logger.info("deleted file " + myTempDir.getPath());
     myTempDir = null;
   }
 
@@ -48,7 +48,7 @@
       if (files != null) {
         for (File each : files) {
           delete(each);
-          Runner.logger.info("deleted file " + each.getCanonicalPath());
+          Runner.logger.info("deleted file " + each.getPath());
         }
       }
     }
@@ -72,7 +72,7 @@
   }
 
   public static void copy(File from, File to) throws IOException {
-    Runner.logger.info("from " + from.getCanonicalPath() + " to " + to.getCanonicalPath());
+    Runner.logger.info("from " + from.getPath() + " to " + to.getPath());
     if (from.isDirectory()) {
       File[] files = from.listFiles();
       if (files == null) throw new IOException("Cannot get directory's content: " + from);
