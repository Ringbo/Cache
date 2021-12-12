diff --git a/platform/platform-tests/testSrc/com/intellij/openapi/editor/EditorMultiCaretUndoRedoTest.java b/platform/platform-tests/testSrc/com/intellij/openapi/editor/EditorMultiCaretUndoRedoTest.java
index c8a0b28..a96f00e 100644
--- a/platform/platform-tests/testSrc/com/intellij/openapi/editor/EditorMultiCaretUndoRedoTest.java
+++ b/platform/platform-tests/testSrc/com/intellij/openapi/editor/EditorMultiCaretUndoRedoTest.java
@@ -91,7 +91,7 @@
   public void testBlockSelectionStateAfterUndo2() throws Exception {
     init("a");
     ((EditorEx)myEditor).setColumnMode(true);
-    mouse().clickAt(0, 0).dragTo(0, 2).release();
+    mouse().pressAt(0, 0).dragTo(0, 2).release();
     type('b');
     undo();
     verifyCaretsAndSelections(0, 2, 0, 2);
@@ -100,7 +100,7 @@
   public void testPrimaryCaretPositionAfterUndo() throws Exception {
     init("line1\n" +
          "line2");
-    mouse().alt().clickAt(1, 1).dragTo(0, 0).release();
+    mouse().alt().pressAt(1, 1).dragTo(0, 0).release();
     type(' ');
     undo();
     assertEquals(new LogicalPosition(0, 0), myEditor.getCaretModel().getPrimaryCaret().getLogicalPosition());
