diff --git a/platform/platform-impl/src/com/intellij/openapi/diff/impl/incrementalMerge/ui/OpenPartialDiffAction.java b/platform/platform-impl/src/com/intellij/openapi/diff/impl/incrementalMerge/ui/OpenPartialDiffAction.java
index c8c2bcd..3193b09 100644
--- a/platform/platform-impl/src/com/intellij/openapi/diff/impl/incrementalMerge/ui/OpenPartialDiffAction.java
+++ b/platform/platform-impl/src/com/intellij/openapi/diff/impl/incrementalMerge/ui/OpenPartialDiffAction.java
@@ -76,7 +76,7 @@
   }
 
   private String composeName() {
-    if (myLeftIndex == 1 && myRightIndex == 0) {
+    if (myLeftIndex == 0 && myRightIndex == 1) {
       return DiffBundle.message("merge.partial.diff.action.name.0.1");
     }
     if (myLeftIndex == 1 && myRightIndex == 2) {
