diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/PathValidator.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/PathValidator.java
index a525e94..a7ee16e 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/PathValidator.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/PathValidator.java
@@ -27,7 +27,7 @@
    * @param filepattern The file pattern to verify.
    * @return The post-validation filepattern.
    */
-  public String validateInputFilePatternSupported(String filepattern);
+  String validateInputFilePatternSupported(String filepattern);
 
   /**
    * Validate that an output file prefix is conforming.
@@ -35,7 +35,7 @@
    * @param filePrefix the file prefix to verify.
    * @return The post-validation filePrefix.
    */
-  public String validateOutputFilePrefixSupported(String filePrefix);
+  String validateOutputFilePrefixSupported(String filePrefix);
 
   /**
    * Validate that a path is a valid path and that the path
@@ -44,5 +44,5 @@
    * @param path The path to verify.
    * @return The post-validation path.
    */
-  public String verifyPath(String path);
+  String verifyPath(String path);
 }
