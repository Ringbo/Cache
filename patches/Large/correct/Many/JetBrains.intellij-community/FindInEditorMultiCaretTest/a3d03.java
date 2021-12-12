diff --git a/java/java-tests/testSrc/com/intellij/find/FindInEditorMultiCaretTest.java b/java/java-tests/testSrc/com/intellij/find/FindInEditorMultiCaretTest.java
index 789b303..97b7ae7 100644
--- a/java/java-tests/testSrc/com/intellij/find/FindInEditorMultiCaretTest.java
+++ b/java/java-tests/testSrc/com/intellij/find/FindInEditorMultiCaretTest.java
@@ -150,7 +150,7 @@
 
   private void nextOccurrence() {
     final EditorSearchComponent editorSearchComponent = getEditorSearchComponent();
-    executeAction(new NextOccurrenceAction(editorSearchComponent, editorSearchComponent.getSearchTextComponent()));
+    executeAction(new NextOccurrenceAction(editorSearchComponent, editorSearchComponent.getSearchTextComponent(), true));
   }
 
   private void prevOccurrence() {
