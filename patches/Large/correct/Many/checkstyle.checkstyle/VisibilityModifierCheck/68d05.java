diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/VisibilityModifierCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/VisibilityModifierCheck.java
index aab4941..57941b0 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/VisibilityModifierCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/VisibilityModifierCheck.java
@@ -777,7 +777,7 @@
      * @return canonical type's name
      */
     private static String getCanonicalName(DetailAST type) {
-        final StringBuilder canonicalNameBuilder = new StringBuilder();
+        final StringBuilder canonicalNameBuilder = new StringBuilder(256);
         DetailAST toVisit = type.getFirstChild();
         while (toVisit != null) {
             toVisit = getNextSubTreeNode(toVisit, type);
