diff --git a/source/com/intellij/psi/formatter/java/JavaSpacePropertyProcessor.java b/source/com/intellij/psi/formatter/java/JavaSpacePropertyProcessor.java
index 950a039..63f64ec 100644
--- a/source/com/intellij/psi/formatter/java/JavaSpacePropertyProcessor.java
+++ b/source/com/intellij/psi/formatter/java/JavaSpacePropertyProcessor.java
@@ -335,7 +335,7 @@
     else if (myRole1 == ChildRole.LPARENTH || myRole2 == ChildRole.RPARENTH) {
       createSpaceInCode(mySettings.SPACE_WITHIN_WHILE_PARENTHESES);
     }
-    else if (myRole2 == ChildRole.LOOP_BODY) {
+    else if (myRole2 == ChildRole.LOOP_BODY || myChild2.getElementType() == ElementType.CODE_BLOCK) {
       if (myChild2.getElementType() == ElementType.BLOCK_STATEMENT) {
         myResult = getSpaceBeforeLBrace(mySettings.SPACE_BEFORE_WHILE_LBRACE, mySettings.BRACE_STYLE,
                                         new TextRange(myParent.getTextRange().getStartOffset(),
@@ -363,7 +363,7 @@
         createSpacingBeforeElementInsideControlStatement();
       }
     }
-    else if (myRole1 == ChildRole.LOOP_BODY) {
+    else if (myRole1 == ChildRole.LOOP_BODY || myChild2.getElementType() == ElementType.CODE_BLOCK) {
       processOnNewLineCondition(mySettings.WHILE_ON_NEW_LINE);
     }
   }
@@ -538,7 +538,7 @@
         }
       }
       else {
-        if (myChild2.getElementType() == ElementType.BLOCK_STATEMENT) {
+        if (myChild2.getElementType() == ElementType.BLOCK_STATEMENT || myChild2.getElementType() == ElementType.CODE_BLOCK) {
           myResult = getSpaceBeforeLBrace(mySettings.SPACE_BEFORE_ELSE_LBRACE, mySettings.BRACE_STYLE,
                                           null,
                                           mySettings.KEEP_SIMPLE_BLOCKS_IN_ONE_LINE);
@@ -548,7 +548,7 @@
         }
       }
     }
-    else if (myChild2.getElementType() == ElementType.BLOCK_STATEMENT) {
+    else if (myChild2.getElementType() == ElementType.BLOCK_STATEMENT || myChild2.getElementType() == ElementType.CODE_BLOCK) {
       boolean space = myRole2 == ChildRole.ELSE_BRANCH ? mySettings.SPACE_BEFORE_ELSE_LBRACE : mySettings.SPACE_BEFORE_IF_LBRACE;
       myResult = getSpaceBeforeLBrace(space, mySettings.BRACE_STYLE, new TextRange(myParent.getTextRange().getStartOffset(),
                                                                                    myChild1.getTextRange().getEndOffset()),
@@ -869,7 +869,7 @@
     else if (myRole1 == ChildRole.FOR_SEMICOLON) {
       createSpaceInCode(mySettings.SPACE_AFTER_SEMICOLON);
     }
-    else if (myRole2 == ChildRole.LOOP_BODY) {
+    else if (myRole2 == ChildRole.LOOP_BODY || myChild2.getElementType() == ElementType.CODE_BLOCK) {
       if (myChild2.getElementType() == ElementType.BLOCK_STATEMENT) {
         myResult = getSpaceBeforeLBrace(mySettings.SPACE_BEFORE_FOR_LBRACE, mySettings.BRACE_STYLE,
                                         new TextRange(myParent.getTextRange().getStartOffset(),
