diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLCompletionProposal.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLCompletionProposal.java
index f91bbcb..775779f 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLCompletionProposal.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLCompletionProposal.java
@@ -162,7 +162,7 @@
         if (endOffset != -1) {
             endOffset += wordDetector.getStartOffset();
         } else {
-            endOffset = wordDetector.getEndOffset();
+            endOffset = wordDetector.getCursorOffset();//wordDetector.getEndOffset();
         }
         replacementOffset = startOffset;
         replacementLength = endOffset - startOffset;
