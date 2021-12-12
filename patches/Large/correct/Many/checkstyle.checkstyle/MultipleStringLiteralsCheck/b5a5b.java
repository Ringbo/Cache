diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/MultipleStringLiteralsCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/MultipleStringLiteralsCheck.java
index c72edc9..43ff2da 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/MultipleStringLiteralsCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/MultipleStringLiteralsCheck.java
@@ -91,7 +91,7 @@
      * @throws org.apache.commons.beanutils.ConversionException
      *         if unable to create Pattern object
      */
-    public void setIgnoreStringsRegexp(String ignoreStringsRegexp) {
+    public final void setIgnoreStringsRegexp(String ignoreStringsRegexp) {
         if (ignoreStringsRegexp != null
             && !ignoreStringsRegexp.isEmpty()) {
             pattern = Utils.createPattern(ignoreStringsRegexp);
