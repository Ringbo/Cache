diff --git a/java/java-impl/src/com/intellij/refactoring/typeMigration/ui/MigrationRootNode.java b/java/java-impl/src/com/intellij/refactoring/typeMigration/ui/MigrationRootNode.java
index 4079d33..2ebb3d4 100644
--- a/java/java-impl/src/com/intellij/refactoring/typeMigration/ui/MigrationRootNode.java
+++ b/java/java-impl/src/com/intellij/refactoring/typeMigration/ui/MigrationRootNode.java
@@ -34,7 +34,7 @@
  * @author anna
  * Date: 16-Apr-2008
  */
-public class MigrationRootNode extends AbstractTreeNode<TypeMigrationLabeler> implements DuplicateNodeRenderer.DuplicatableNode  {
+public class MigrationRootNode extends AbstractTreeNode<PsiElement> implements DuplicateNodeRenderer.DuplicatableNode  {
   private final TypeMigrationLabeler myLabeler;
   private List<MigrationNode> myCachedChildren;
   private final PsiElement myRoot;
@@ -44,7 +44,7 @@
                               TypeMigrationLabeler labeler, 
                               final PsiElement root,
                               final boolean previewUsages) {
-    super(project, labeler);
+    super(project, root);
     myLabeler = labeler;
     myRoot = root;
     myPreviewUsages = previewUsages;
