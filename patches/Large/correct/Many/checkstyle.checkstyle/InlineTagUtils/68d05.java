diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/utils/InlineTagUtils.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/utils/InlineTagUtils.java
index b8eeb85..5b3b11c 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/utils/InlineTagUtils.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/utils/InlineTagUtils.java
@@ -104,7 +104,7 @@
      * @return The lines, joined together with newlines, as a single string.
      */
     private static String convertLinesToString(String... lines) {
-        final StringBuilder builder = new StringBuilder();
+        final StringBuilder builder = new StringBuilder(1024);
         for (String line : lines) {
             builder.append(line);
             builder.append(LINE_FEED);
