diff --git a/src/org/nutz/dao/impl/jdbc/hsqldb/HsqldbJdbcExpert.java b/src/org/nutz/dao/impl/jdbc/hsqldb/HsqldbJdbcExpert.java
index 43c2b2c..78cb3fe 100644
--- a/src/org/nutz/dao/impl/jdbc/hsqldb/HsqldbJdbcExpert.java
+++ b/src/org/nutz/dao/impl/jdbc/hsqldb/HsqldbJdbcExpert.java
@@ -60,7 +60,7 @@
             sb.append('\n');
             sb.append("PRIMARY KEY (");
             for (MappingField pk : pks) {
-                sb.append(pk.getColumnName()).append(',');
+                sb.append(pk.getColumnNameInSql()).append(',');
             }
             sb.setCharAt(sb.length() - 1, ')');
             sb.append("\n ");
