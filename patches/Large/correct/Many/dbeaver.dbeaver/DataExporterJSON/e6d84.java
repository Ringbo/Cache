diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/tools/transfer/stream/impl/DataExporterJSON.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/tools/transfer/stream/impl/DataExporterJSON.java
index 6c555fd..e19249d 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/tools/transfer/stream/impl/DataExporterJSON.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/tools/transfer/stream/impl/DataExporterJSON.java
@@ -103,7 +103,7 @@
         out.write("\t{\n");
         for (int i = 0; i < row.length; i++) {
             DBDAttributeBinding column = columns.get(i);
-            String columnName = column.getName();
+            String columnName = column.getLabel();
             out.write("\t\t\"" + escapeJsonString(columnName) + "\" : ");
             Object cellValue = row[i];
             if (DBUtils.isNullValue(cellValue)) {
