diff --git a/json/src/com/intellij/json/psi/JsonStringLiteralManipulator.java b/json/src/com/intellij/json/psi/JsonStringLiteralManipulator.java
index 2613bcd..855655f 100644
--- a/json/src/com/intellij/json/psi/JsonStringLiteralManipulator.java
+++ b/json/src/com/intellij/json/psi/JsonStringLiteralManipulator.java
@@ -26,7 +26,7 @@
   public TextRange getRangeInElement(@NotNull JsonStringLiteral element) {
     final String content = element.getText();
     final int startOffset = content.startsWith("'") || content.startsWith("\"") ? 1 : 0;
-    final int endOffset = content.length() > 0 && (content.endsWith("'") || content.endsWith("\"")) ? -1 : 0;
+    final int endOffset = content.length() > 1 && (content.endsWith("'") || content.endsWith("\"")) ? -1 : 0;
     return new TextRange(startOffset, content.length() + endOffset);
   }
 }
