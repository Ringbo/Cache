diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLCompletionProcessor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLCompletionProcessor.java
index 02aec28..2bcfbb7 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLCompletionProcessor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLCompletionProcessor.java
@@ -115,7 +115,7 @@
                 }
             }
         }
-        if (queryType != null) {
+        if (queryType != null && !CommonUtils.isEmpty(wordPart)) {
             if (editor.getDataSource() != null) {
                 try {
                     final QueryType qt = queryType;
