diff --git a/cas-server-core-services/src/main/java/org/jasig/cas/services/RegexRegisteredService.java b/cas-server-core-services/src/main/java/org/jasig/cas/services/RegexRegisteredService.java
index 21216ab..447b184 100644
--- a/cas-server-core-services/src/main/java/org/jasig/cas/services/RegexRegisteredService.java
+++ b/cas-server-core-services/src/main/java/org/jasig/cas/services/RegexRegisteredService.java
@@ -49,7 +49,7 @@
      * @param pattern the pattern, may not be null.
      * @return the pattern
      */
-    private Pattern createPattern(final String pattern) {
+    private static Pattern createPattern(final String pattern) {
         if (pattern == null) {
             throw new IllegalArgumentException("Pattern cannot be null.");
         }
