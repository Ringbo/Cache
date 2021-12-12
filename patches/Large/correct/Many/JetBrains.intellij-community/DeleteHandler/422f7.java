diff --git a/platform/lang-impl/src/com/intellij/ide/util/DeleteHandler.java b/platform/lang-impl/src/com/intellij/ide/util/DeleteHandler.java
index 8b6209c..75a99c6 100644
--- a/platform/lang-impl/src/com/intellij/ide/util/DeleteHandler.java
+++ b/platform/lang-impl/src/com/intellij/ide/util/DeleteHandler.java
@@ -125,7 +125,7 @@
     final boolean dumb = DumbService.getInstance(project).isDumb();
     if (safeDeleteApplicable && !dumb) {
       final Ref<Boolean> exit = Ref.create(false);
-      SafeDeleteDialog dialog = new SafeDeleteDialog(project, elements, new SafeDeleteDialog.Callback() {
+      final SafeDeleteDialog dialog = new SafeDeleteDialog(project, elements, new SafeDeleteDialog.Callback() {
         @Override
         public void run(SafeDeleteDialog dialog) {
           if (!CommonRefactoringUtil.checkReadOnlyStatusRecursively(project, Arrays.asList(elements), true)) return;
