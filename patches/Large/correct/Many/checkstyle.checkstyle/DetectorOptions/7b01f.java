diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/DetectorOptions.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/DetectorOptions.java
index 4077d9f..57592df 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/DetectorOptions.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/DetectorOptions.java
@@ -56,7 +56,7 @@
      * @param compileFlags the flags to create the regular expression with.
      * @param reporter used to report violations.
      */
-    public DetectorOptions(int compileFlags,
+    DetectorOptions(int compileFlags,
             AbstractViolationReporter reporter) {
         this.compileFlags = compileFlags;
         this.reporter = reporter;
