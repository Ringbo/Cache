diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLCompletionProcessor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLCompletionProcessor.java
index 014e9e2..70dcbd7 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLCompletionProcessor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/syntax/SQLCompletionProcessor.java
@@ -720,7 +720,7 @@
                     break;
                 default:
                     DBPIdentifierCase convertCase = dataSource instanceof SQLDataSource ?
-                        ((SQLDataSource) dataSource).getSQLDialect().storesQuotedCase() : DBPIdentifierCase.MIXED;
+                        ((SQLDataSource) dataSource).getSQLDialect().storesUnquotedCase() : DBPIdentifierCase.MIXED;
                     replaceString = convertCase.transform(replaceString);
                     break;
             }
