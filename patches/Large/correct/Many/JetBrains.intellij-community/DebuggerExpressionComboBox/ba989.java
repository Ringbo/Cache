diff --git a/java/debugger/impl/src/com/intellij/debugger/ui/DebuggerExpressionComboBox.java b/java/debugger/impl/src/com/intellij/debugger/ui/DebuggerExpressionComboBox.java
index 339d844..b916e5b 100644
--- a/java/debugger/impl/src/com/intellij/debugger/ui/DebuggerExpressionComboBox.java
+++ b/java/debugger/impl/src/com/intellij/debugger/ui/DebuggerExpressionComboBox.java
@@ -121,7 +121,7 @@
       LinkedList<TextWithImports> recents = DebuggerRecents.getInstance(getProject()).getRecents(getRecentsId());
       ArrayList<TextWithImports> singleLine = new ArrayList<TextWithImports>();
       for (TextWithImports evaluationText : recents) {
-        if (evaluationText.getText().indexOf('\n') == -1) {
+        if (evaluationText.getText().indexOf('\n') == -1 && singleLine.indexOf(evaluationText) == -1) {
           singleLine.add(evaluationText);
         }
       }
