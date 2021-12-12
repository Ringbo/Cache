diff --git a/source/com/intellij/application/options/CodeStyleIndentAndBracesPanel.java b/source/com/intellij/application/options/CodeStyleIndentAndBracesPanel.java
index fe390a5..35a552d 100644
--- a/source/com/intellij/application/options/CodeStyleIndentAndBracesPanel.java
+++ b/source/com/intellij/application/options/CodeStyleIndentAndBracesPanel.java
@@ -468,7 +468,7 @@
     settings.KEEP_FIRST_COLUMN_COMMENT = myKeepCommentAtFirstColumn.isSelected();
     settings.KEEP_CONTROL_STATEMENT_IN_ONE_LINE = myKeepControlStatementInOneLine.isSelected();
     settings.KEEP_SIMPLE_BLOCKS_IN_ONE_LINE = myKeepSimpleBlocksInOneLine.isSelected();
-    settings.KEEP_SIMPLE_METHODS_IN_ONE_LINE = myKeepSimpleBlocksInOneLine.isSelected();
+    settings.KEEP_SIMPLE_METHODS_IN_ONE_LINE = myKeepMethodsInOneLine.isSelected();
 
   }
 
