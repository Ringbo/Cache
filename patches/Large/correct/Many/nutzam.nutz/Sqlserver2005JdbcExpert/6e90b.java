diff --git a/src/org/nutz/dao/impl/jdbc/sqlserver2005/Sqlserver2005JdbcExpert.java b/src/org/nutz/dao/impl/jdbc/sqlserver2005/Sqlserver2005JdbcExpert.java
index 06f41ab..49b9cb0 100644
--- a/src/org/nutz/dao/impl/jdbc/sqlserver2005/Sqlserver2005JdbcExpert.java
+++ b/src/org/nutz/dao/impl/jdbc/sqlserver2005/Sqlserver2005JdbcExpert.java
@@ -68,7 +68,7 @@
             sb.append('\n');
             sb.append("PRIMARY KEY (");
             for (MappingField pk : pks) {
-                sb.append(pk.getColumnName()).append(',');
+                sb.append(pk.getColumnNameInSql()).append(',');
             }
             sb.setCharAt(sb.length() - 1, ')');
             sb.append("\n ");
