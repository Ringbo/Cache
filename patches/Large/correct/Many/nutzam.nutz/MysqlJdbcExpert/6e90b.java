diff --git a/src/org/nutz/dao/impl/jdbc/mysql/MysqlJdbcExpert.java b/src/org/nutz/dao/impl/jdbc/mysql/MysqlJdbcExpert.java
index 590b9ac..fb3165a 100644
--- a/src/org/nutz/dao/impl/jdbc/mysql/MysqlJdbcExpert.java
+++ b/src/org/nutz/dao/impl/jdbc/mysql/MysqlJdbcExpert.java
@@ -136,7 +136,7 @@
             sb.append('\n');
             sb.append("PRIMARY KEY (");
             for (MappingField pk : pks) {
-                sb.append(pk.getColumnName()).append(',');
+                sb.append(pk.getColumnNameInSql()).append(',');
             }
             sb.setCharAt(sb.length() - 1, ')');
             sb.append("\n ");
