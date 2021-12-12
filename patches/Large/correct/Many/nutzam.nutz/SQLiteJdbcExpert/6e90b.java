diff --git a/src/org/nutz/dao/impl/jdbc/sqlite/SQLiteJdbcExpert.java b/src/org/nutz/dao/impl/jdbc/sqlite/SQLiteJdbcExpert.java
index 6fd5a9a..d499da9 100644
--- a/src/org/nutz/dao/impl/jdbc/sqlite/SQLiteJdbcExpert.java
+++ b/src/org/nutz/dao/impl/jdbc/sqlite/SQLiteJdbcExpert.java
@@ -72,7 +72,7 @@
             sb.append('\n');
             sb.append("constraint pk_").append(en.getTableName()).append(" PRIMARY KEY (");
             for (MappingField pk : pks) {
-                sb.append(pk.getColumnName()).append(',');
+                sb.append(pk.getColumnNameInSql()).append(',');
             }
             sb.setCharAt(sb.length() - 1, ')');
             sb.append("\n ");
