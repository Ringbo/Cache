diff --git a/Dart/src/com/jetbrains/lang/dart/ide/formatter/DartSpacingProcessor.java b/Dart/src/com/jetbrains/lang/dart/ide/formatter/DartSpacingProcessor.java
index 54fd0f2..ab52c3e 100644
--- a/Dart/src/com/jetbrains/lang/dart/ide/formatter/DartSpacingProcessor.java
+++ b/Dart/src/com/jetbrains/lang/dart/ide/formatter/DartSpacingProcessor.java
@@ -351,14 +351,14 @@
     if (elementType == VALUE_EXPRESSION && type2 == CASCADE_REFERENCE_EXPRESSION) {
       if (type1 == CASCADE_REFERENCE_EXPRESSION) {
         if (cascadesAreSameMethod(((AbstractBlock)child1).getNode(), ((AbstractBlock)child2).getNode())) {
-          return Spacing.createSpacing(0, 1, 0, mySettings.KEEP_LINE_BREAKS, mySettings.KEEP_BLANK_LINES_IN_CODE);
+          return Spacing.createSpacing(0, 0, 0, mySettings.KEEP_LINE_BREAKS, mySettings.KEEP_BLANK_LINES_IN_CODE);
         }
       }
       else if (type1 == REFERENCE_EXPRESSION) {
         CompositeElement elem = (CompositeElement)myNode;
         ASTNode[] childs = elem.getChildren(CASCADE_REFERENCE_EXPRESSION_SET);
         if (childs.length == 1 || allCascadesAreSameMethod(childs)) {
-          return Spacing.createSpacing(0, 1, 0, mySettings.KEEP_LINE_BREAKS, mySettings.KEEP_BLANK_LINES_IN_CODE);
+          return Spacing.createSpacing(0, 0, 0, mySettings.KEEP_LINE_BREAKS, mySettings.KEEP_BLANK_LINES_IN_CODE);
         }
       }
       return addLineBreak();
@@ -370,9 +370,10 @@
       // Adjacent strings on the same line should not be split.
       while ((sib = sib.getTreeNext()) != null) {
         // Comments are handled elsewhere.
+        // TODO Create a test for this loop after adjacent-string wrapping is implemented.
         if (sib.getElementType() == WHITE_SPACE) {
           String ws = sib.getText();
-          if (ws.contains("\n") || ws.contains("\r")) {
+          if (ws.contains("\n")) {
             preserveNewline++;
             break;
           }
