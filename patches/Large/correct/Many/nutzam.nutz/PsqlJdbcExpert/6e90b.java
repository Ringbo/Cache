diff --git a/src/org/nutz/dao/impl/jdbc/psql/PsqlJdbcExpert.java b/src/org/nutz/dao/impl/jdbc/psql/PsqlJdbcExpert.java
index 779971e..1d84929 100644
--- a/src/org/nutz/dao/impl/jdbc/psql/PsqlJdbcExpert.java
+++ b/src/org/nutz/dao/impl/jdbc/psql/PsqlJdbcExpert.java
@@ -87,7 +87,7 @@
             sb.append(String.format("CONSTRAINT %s_pkey PRIMARY KEY (",
                                     en.getTableName().replace('.', '_').replace('"', '_')));
             for (MappingField pk : pks) {
-                sb.append(pk.getColumnName()).append(',');
+                sb.append(pk.getColumnNameInSql()).append(',');
             }
             sb.setCharAt(sb.length() - 1, ')');
             sb.append("\n ");
