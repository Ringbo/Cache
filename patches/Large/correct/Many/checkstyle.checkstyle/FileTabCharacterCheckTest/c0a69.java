diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/whitespace/FileTabCharacterCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/whitespace/FileTabCharacterCheckTest.java
index f3b00a9..b8e607b 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/whitespace/FileTabCharacterCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/whitespace/FileTabCharacterCheckTest.java
@@ -96,7 +96,7 @@
      * Creates a configuration that is functionally close to that in the docs.
      * @param verbose verbose mode
      */
-    private DefaultConfiguration createConfig(boolean verbose) {
+    private static DefaultConfiguration createConfig(boolean verbose) {
         final DefaultConfiguration checkConfig =
             createCheckConfig(FileTabCharacterCheck.class);
         checkConfig.addAttribute("eachLine", Boolean.toString(verbose));
