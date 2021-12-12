diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocMethodCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocMethodCheck.java
index 5b7f386..c332e21 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocMethodCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocMethodCheck.java
@@ -797,7 +797,7 @@
      * @param paramName name of parameter
      * @return true if parameter found and removed
      */
-    private boolean removeMatchingParam(List<DetailAST> params, String paramName) {
+    private static boolean removeMatchingParam(List<DetailAST> params, String paramName) {
         boolean found = false;
         final Iterator<DetailAST> paramIt = params.iterator();
         while (paramIt.hasNext()) {
