diff --git a/plugins/org.jkiss.dbeaver.ext.exasol/src/org/jkiss/dbeaver/ext/exasol/model/ExasolTableColumn.java b/plugins/org.jkiss.dbeaver.ext.exasol/src/org/jkiss/dbeaver/ext/exasol/model/ExasolTableColumn.java
index ffece8f..6fb37ee 100644
--- a/plugins/org.jkiss.dbeaver.ext.exasol/src/org/jkiss/dbeaver/ext/exasol/model/ExasolTableColumn.java
+++ b/plugins/org.jkiss.dbeaver.ext.exasol/src/org/jkiss/dbeaver/ext/exasol/model/ExasolTableColumn.java
@@ -64,7 +64,7 @@
         this.formatType = JDBCUtils.safeGetString(dbResult, "COLUMN_TYPE");
         setName(JDBCUtils.safeGetString(dbResult, "COLUMN_NAME"));
         setOrdinalPosition(JDBCUtils.safeGetInt(dbResult, "ORDINAL_POSITION"));
-        setRequired(JDBCUtils.safeGetBoolean(dbResult, "COLUMN_IS_NULLABLE"));
+        setRequired(! JDBCUtils.safeGetBoolean(dbResult, "COLUMN_IS_NULLABLE"));
         setDefaultValue(JDBCUtils.safeGetString(dbResult, "COLUMN_DEF"));
         setMaxLength(JDBCUtils.safeGetInt(dbResult, "COLUMN_SIZE"));
         setScale(JDBCUtils.safeGetInt(dbResult, "DECIMAL_DIGITS"));
