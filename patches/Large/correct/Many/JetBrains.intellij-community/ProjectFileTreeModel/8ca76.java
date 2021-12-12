diff --git a/platform/platform-impl/src/com/intellij/ui/tree/ProjectFileTreeModel.java b/platform/platform-impl/src/com/intellij/ui/tree/ProjectFileTreeModel.java
index dc1be2b..e7423ad 100644
--- a/platform/platform-impl/src/com/intellij/ui/tree/ProjectFileTreeModel.java
+++ b/platform/platform-impl/src/com/intellij/ui/tree/ProjectFileTreeModel.java
@@ -333,7 +333,7 @@
     }
 
     final void invalidateChildren(Predicate<FileNode> validator) {
-      if (valid) {
+      if (valid || !file.isDirectory()) {
         if (validator == null || !validator.test(this)) {
           validator = null; // all children will be invalid
           valid = false;
