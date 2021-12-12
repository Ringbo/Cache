diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
index f5687ff..ea5d68d 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
@@ -831,7 +831,9 @@
                     queryText = SQLUtils.fixLineFeeds(queryText);
 
                     if (isDelimiter && (keepDelimiters || (hasBlocks ? dialect.isDelimiterAfterBlock() : dialect.isDelimiterAfterQuery()))) {
-                        if (delimiterText != null) {
+                        if (delimiterText != null && delimiterText.equals(SQLConstants.DEFAULT_STATEMENT_DELIMITER)) {
+                            // Add delimiter in the end of query. Do this only for semicolon delimiters
+                            // Quite dirty workaround needed for SQL server
                             queryText += delimiterText;
                         }
                     }
