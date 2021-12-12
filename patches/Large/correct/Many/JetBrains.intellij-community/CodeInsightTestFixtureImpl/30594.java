diff --git a/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java b/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
index 654e7f1..ecd10fe 100644
--- a/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
+++ b/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
@@ -619,7 +619,7 @@
 
   @Override
   public Presentation testAction(AnAction action) {
-    DataContext context = DataManager.getInstance().getDataContext(getEditor().getComponent());
+    DataContext context = DataManager.getInstance().getDataContext();
     TestActionEvent e = new TestActionEvent(context, action);
     action.beforeActionPerformedUpdate(e);
     if (e.getPresentation().isVisible() && e.getPresentation().isVisible()) {
