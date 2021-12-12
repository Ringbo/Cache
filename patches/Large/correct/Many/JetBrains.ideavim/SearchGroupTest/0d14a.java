diff --git a/test/org/jetbrains/plugins/ideavim/group/SearchGroupTest.java b/test/org/jetbrains/plugins/ideavim/group/SearchGroupTest.java
index 3b967a6..e6b0d38 100644
--- a/test/org/jetbrains/plugins/ideavim/group/SearchGroupTest.java
+++ b/test/org/jetbrains/plugins/ideavim/group/SearchGroupTest.java
@@ -71,7 +71,7 @@
     final EditorDataContext dataContext = new EditorDataContext(editor);
     final Project project = myFixture.getProject();
     final SearchGroup searchGroup = CommandGroups.getInstance().getSearch();
-    final Ref<Integer> ref = Ref.create();
+    final Ref<Integer> ref = Ref.create(-1);
     RunnableHelper.runReadCommand(project, new Runnable() {
       @Override
       public void run() {
