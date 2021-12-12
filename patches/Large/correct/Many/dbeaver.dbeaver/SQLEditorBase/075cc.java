diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
index 9e74804..acf2e45 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
@@ -726,7 +726,7 @@
                     } catch (BadLocationException e) {
                         log.debug(e);
                     }
-                } else if (useBlankLines && token.isWhitespace() && tokenLength >= 2) {
+                } else if (useBlankLines && token.isWhitespace() && tokenLength >= 1) {
                     // Check for blank line delimiter
                     if (lastTokenLineFeeds + countLineFeeds(document, tokenOffset, tokenLength) >= 2) {
                         isDelimiter = true;
