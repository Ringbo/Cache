diff --git a/src/org/nutz/dao/impl/jdbc/db2/Db2JdbcExpert.java b/src/org/nutz/dao/impl/jdbc/db2/Db2JdbcExpert.java
index 6af9c35..9ed9cc6 100644
--- a/src/org/nutz/dao/impl/jdbc/db2/Db2JdbcExpert.java
+++ b/src/org/nutz/dao/impl/jdbc/db2/Db2JdbcExpert.java
@@ -65,7 +65,7 @@
             sb.append(makePksName(en));
             sb.append(" PRIMARY KEY (");
             for (MappingField mf : en.getPks()) {
-                sb.append(mf.getColumnName()).append(",");
+                sb.append(mf.getColumnNameInSql()).append(",");
             }
             sb.setCharAt(sb.length() - 1, ')');
             dao.execute(Sqls.create(sb.toString()));
