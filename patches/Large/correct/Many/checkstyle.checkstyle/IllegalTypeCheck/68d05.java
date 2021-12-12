diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/IllegalTypeCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/IllegalTypeCheck.java
index fd0dd1e..a630b44 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/IllegalTypeCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/IllegalTypeCheck.java
@@ -361,7 +361,7 @@
      * @return Imported canonical type's name.
      */
     private static String getImportedTypeCanonicalName(DetailAST importAst) {
-        final StringBuilder canonicalNameBuilder = new StringBuilder();
+        final StringBuilder canonicalNameBuilder = new StringBuilder(256);
         DetailAST toVisit = importAst;
         while (toVisit != null) {
             toVisit = getNextSubTreeNode(toVisit, importAst);
