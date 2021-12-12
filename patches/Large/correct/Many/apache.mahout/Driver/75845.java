diff --git a/utils/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java b/utils/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java
index 7684ddd..dfce2d4 100644
--- a/utils/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java
+++ b/utils/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java
@@ -141,7 +141,7 @@
       if (cmdLine.hasOption(inputOpt)) { // Lucene case
         File file = new File(cmdLine.getValue(inputOpt).toString());
         if (!file.isDirectory()) {
-          throw new IllegalArgumentException("Lucene directory: " + file.getName() + 
+          throw new IllegalArgumentException("Lucene directory: " + file.getAbsolutePath() + 
               " does not exist or is not a directory");
         }
 
