diff --git a/src/com/facebook/buck/cxx/UntrackedHeaderReporterWithShowIncludes.java b/src/com/facebook/buck/cxx/UntrackedHeaderReporterWithShowIncludes.java
index 7050e62..9d98382 100644
--- a/src/com/facebook/buck/cxx/UntrackedHeaderReporterWithShowIncludes.java
+++ b/src/com/facebook/buck/cxx/UntrackedHeaderReporterWithShowIncludes.java
@@ -39,7 +39,7 @@
  * created in {@Link CxxPreprocessAndCompileStep}.
  */
 class UntrackedHeaderReporterWithShowIncludes implements UntrackedHeaderReporter {
-  private static String CHAIN_SEPARATOR = ", which is included by:\n\t";
+  private static String CHAIN_SEPARATOR = ", which is included by: " + System.lineSeparator();
   private final Path inputPath;
   private final ProjectFilesystem filesystem;
   private final HeaderPathNormalizer headerPathNormalizer;
@@ -104,7 +104,7 @@
     List<Path> chain = computeIncludeChain(absolutePath);
     String errorMessage =
         String.format(
-            "%s: included an untracked header %s",
+            "%s: included an untracked header: %n%s",
             prettyPrintFileName(inputPath, false), prettyPrintChain(chain));
     return errorMessage;
   }
@@ -121,7 +121,7 @@
   private String prettyPrintChain(List<Path> chain) {
     return chain
         .stream()
-        .map((file) -> prettyPrintFileName(file, true))
+        .map((file) -> prettyPrintFileName(file, false))
         .collect(Collectors.joining(CHAIN_SEPARATOR));
   }
 
