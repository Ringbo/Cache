diff --git a/subprojects/testing-base/src/main/java/org/gradle/api/tasks/testing/AbstractTestTask.java b/subprojects/testing-base/src/main/java/org/gradle/api/tasks/testing/AbstractTestTask.java
index c0970b3..d3b4f23 100644
--- a/subprojects/testing-base/src/main/java/org/gradle/api/tasks/testing/AbstractTestTask.java
+++ b/subprojects/testing-base/src/main/java/org/gradle/api/tasks/testing/AbstractTestTask.java
@@ -193,10 +193,10 @@
      *
      * @return the test result directory, containing the test results in binary format.
      */
-    @Internal
+    @OutputDirectory
     @Incubating
     public File getBinResultsDir() {
-        return binaryResultsDirectory.getAsFile().get();
+        return binaryResultsDirectory.getAsFile().getOrNull();
     }
 
     /**
@@ -214,7 +214,7 @@
      *
      * @since 4.4
      */
-    @OutputDirectory
+    @Internal
     @Incubating
     public DirectoryProperty getBinaryResultsDirectory() {
         return binaryResultsDirectory;
