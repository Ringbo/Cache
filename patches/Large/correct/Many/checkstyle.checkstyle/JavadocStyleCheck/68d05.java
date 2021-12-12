diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocStyleCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocStyleCheck.java
index 890a2d5..58a6697 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocStyleCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocStyleCheck.java
@@ -260,7 +260,7 @@
      * @return a comment text String.
      */
     private static String getCommentText(String... comments) {
-        final StringBuilder builder = new StringBuilder();
+        final StringBuilder builder = new StringBuilder(1024);
         for (final String line : comments) {
             final int textStart = findTextStart(line);
 
