diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/TranslationCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/TranslationCheck.java
index 8ebe906..9328705 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/TranslationCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/TranslationCheck.java
@@ -144,7 +144,7 @@
      *
      * @param basenameSeparator the basename separator
      */
-    public void setBasenameSeparator(String basenameSeparator) {
+    public final void setBasenameSeparator(String basenameSeparator) {
         this.basenameSeparator = basenameSeparator;
     }
 
