diff --git a/platform/platform-impl/src/com/intellij/ui/tree/StructureTreeModel.java b/platform/platform-impl/src/com/intellij/ui/tree/StructureTreeModel.java
index de611c7..94c7ab0 100644
--- a/platform/platform-impl/src/com/intellij/ui/tree/StructureTreeModel.java
+++ b/platform/platform-impl/src/com/intellij/ui/tree/StructureTreeModel.java
@@ -404,7 +404,7 @@
    * @deprecated do not use
    */
   @Deprecated
-  public final Object getRootImmediately() {
+  public final Node getRootImmediately() {
     if (!root.isValid()) {
       root.set(getValidRoot());
     }
