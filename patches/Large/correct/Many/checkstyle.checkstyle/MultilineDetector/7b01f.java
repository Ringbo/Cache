diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/MultilineDetector.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/MultilineDetector.java
index d9993cb..480cebe 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/MultilineDetector.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/MultilineDetector.java
@@ -67,7 +67,7 @@
      * Creates an instance.
      * @param options the options to use.
      */
-    public MultilineDetector(DetectorOptions options) {
+    MultilineDetector(DetectorOptions options) {
         this.options = options;
     }
 
