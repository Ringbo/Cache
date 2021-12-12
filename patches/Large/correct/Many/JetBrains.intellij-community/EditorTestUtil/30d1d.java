diff --git a/platform/testFramework/src/com/intellij/testFramework/EditorTestUtil.java b/platform/testFramework/src/com/intellij/testFramework/EditorTestUtil.java
index 41057aa..bbd5734 100644
--- a/platform/testFramework/src/com/intellij/testFramework/EditorTestUtil.java
+++ b/platform/testFramework/src/com/intellij/testFramework/EditorTestUtil.java
@@ -97,7 +97,7 @@
   public static void performPaste(Editor editor) {
     EditorActionManager actionManager = EditorActionManager.getInstance();
     EditorActionHandler actionHandler = actionManager.getActionHandler(IdeActions.ACTION_EDITOR_PASTE);
-    actionHandler.execute(editor, DataManager.getInstance().getDataContext());
+    actionHandler.execute(editor, null, DataManager.getInstance().getDataContext());
   }
 
   public static List<IElementType> getAllTokens(EditorHighlighter highlighter) {
