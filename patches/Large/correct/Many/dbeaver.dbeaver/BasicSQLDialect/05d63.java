diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/sql/BasicSQLDialect.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/sql/BasicSQLDialect.java
index ef5a691..428e010 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/sql/BasicSQLDialect.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/sql/BasicSQLDialect.java
@@ -489,9 +489,9 @@
                     return "(" + maxLength + ")";
                 }
             }
-        } else if (dataKind == DBPDataKind.CONTENT && !typeName.contains("LOB")) {
+        } else if ((dataKind == DBPDataKind.CONTENT || dataKind == DBPDataKind.BINARY) && !typeName.contains("LOB")) {
             final long maxLength = column.getMaxLength();
-            if (maxLength > 0) {
+            if (maxLength > 0 && maxLength < Integer.MAX_VALUE) {
                 return "(" + maxLength + ')';
             }
         } else if (dataKind == DBPDataKind.NUMERIC) {
