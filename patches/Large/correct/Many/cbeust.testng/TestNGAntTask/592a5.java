diff --git a/src/main/java/org/testng/TestNGAntTask.java b/src/main/java/org/testng/TestNGAntTask.java
index 167d5c7..ab2c555 100755
--- a/src/main/java/org/testng/TestNGAntTask.java
+++ b/src/main/java/org/testng/TestNGAntTask.java
@@ -998,7 +998,7 @@
             if (fr.isDirectory()) {
               throw new BuildException("Directory based FileResources are not supported.");
             }
-            if (fr.isExists()) {
+            if (!fr.isExists()) {
               log("'" + fr.toLongString() + "' does not exist", Project.MSG_VERBOSE);
             }
             files.add(fr.getFile().getAbsolutePath());
