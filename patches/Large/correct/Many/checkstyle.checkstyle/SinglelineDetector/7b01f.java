diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/SinglelineDetector.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/SinglelineDetector.java
index b586d38..0af4be5 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/SinglelineDetector.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/SinglelineDetector.java
@@ -36,7 +36,7 @@
      * Creates an instance.
      * @param options the options to use.
      */
-    public SinglelineDetector(DetectorOptions options) {
+    SinglelineDetector(DetectorOptions options) {
         this.options = options;
     }
 
