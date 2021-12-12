diff --git a/Dart/src/com/jetbrains/lang/dart/ide/formatter/DartSpacingProcessor.java b/Dart/src/com/jetbrains/lang/dart/ide/formatter/DartSpacingProcessor.java
index 96e0370..61f13c8 100644
--- a/Dart/src/com/jetbrains/lang/dart/ide/formatter/DartSpacingProcessor.java
+++ b/Dart/src/com/jetbrains/lang/dart/ide/formatter/DartSpacingProcessor.java
@@ -291,7 +291,8 @@
     if (elementType == STATEMENTS && (parentType == SWITCH_CASE || parentType == DEFAULT_CASE)) {
       return Spacing.createSpacing(0, 0, 1, false, mySettings.KEEP_BLANK_LINES_IN_CODE);
     }
-    if (!COMMENTS.contains(type2) && BLOCKS.contains(parentType) && !(node1.getTreeNext() instanceof PsiErrorElement)) {
+    if (!COMMENTS.contains(type2) && BLOCKS.contains(parentType)
+        && !(node1.getTreeNext() instanceof PsiErrorElement) && !(node1.getLastChildNode() instanceof PsiErrorElement)) {
       return addLineBreak();
     }
 
