diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/DBObjectNameCaseTransformer.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/DBObjectNameCaseTransformer.java
index 248e9ed..22fc222 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/DBObjectNameCaseTransformer.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/DBObjectNameCaseTransformer.java
@@ -54,7 +54,7 @@
         }
         final SQLDialect dialect = ((SQLDataSource)dataSource).getSQLDialect();
         if (DBUtils.isQuotedIdentifier(dataSource, value)) {
-            if (dialect.supportsQuotedMixedCase()) {
+            if (dialect.supportsQuotedMixedCase() || dialect.supportsUnquotedMixedCase()) {
                 return value;
             }
         }
