diff --git a/src/org/nutz/dao/util/Daos.java b/src/org/nutz/dao/util/Daos.java
index 1a21fe0..19449fc 100644
--- a/src/org/nutz/dao/util/Daos.java
+++ b/src/org/nutz/dao/util/Daos.java
@@ -392,7 +392,7 @@
                 mf = en.getField(head.name());
             String colName = head.name();
             if (mf != null)
-                colName = mf.getColumnName();
+                colName = mf.getColumnNameInSql();
             sql.append(colName).append("=");
             if (head.special()) {
                 if (head.value() != null && head.value() instanceof String) {
@@ -469,7 +469,7 @@
             if (en != null) {
                 mf = en.getField(colName);
                 if (mf != null)
-                    colName = mf.getColumnName();
+                    colName = mf.getColumnNameInSql();
             }
             sql.append(colName);
 
@@ -899,7 +899,7 @@
             for (EntityField field : index.getFields()) {
                 if (field instanceof MappingField) {
                     MappingField mf = (MappingField) field;
-                    sb.append(mf.getColumnName()).append(',');
+                    sb.append(mf.getColumnNameInSql()).append(',');
                 } else {
                     throw Lang.makeThrow(DaoException.class,
                                          "%s %s is NOT a mapping field, can't use as index field!!",
