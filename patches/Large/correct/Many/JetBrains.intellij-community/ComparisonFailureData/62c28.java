diff --git a/java/java-runtime/src/com/intellij/rt/execution/junit/ComparisonFailureData.java b/java/java-runtime/src/com/intellij/rt/execution/junit/ComparisonFailureData.java
index 2d0bbc2..44bb729 100644
--- a/java/java-runtime/src/com/intellij/rt/execution/junit/ComparisonFailureData.java
+++ b/java/java-runtime/src/com/intellij/rt/execution/junit/ComparisonFailureData.java
@@ -157,7 +157,7 @@
       try {
         //noinspection SSBasedInspection
         File tempFile = File.createTempFile(expectedOrActualPrefix, "");
-        OutputStream stream = new FileOutputStream(tempFile, false);
+        OutputStream stream = new FileOutputStream(tempFile);
         try {
           stream.write(text.getBytes("UTF-8"), 0, text.length());
         }
