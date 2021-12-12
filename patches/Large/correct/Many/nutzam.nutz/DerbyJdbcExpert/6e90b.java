diff --git a/src/org/nutz/dao/impl/jdbc/derby/DerbyJdbcExpert.java b/src/org/nutz/dao/impl/jdbc/derby/DerbyJdbcExpert.java
index 36c350c..68aebb8 100644
--- a/src/org/nutz/dao/impl/jdbc/derby/DerbyJdbcExpert.java
+++ b/src/org/nutz/dao/impl/jdbc/derby/DerbyJdbcExpert.java
@@ -127,7 +127,7 @@
             sb.append('\n');
             sb.append("PRIMARY KEY (");
             for (MappingField pk : pks) {
-                sb.append(pk.getColumnName()).append(',');
+                sb.append(pk.getColumnNameInSql()).append(',');
             }
             sb.setCharAt(sb.length() - 1, ')');
             sb.append("\n ");
