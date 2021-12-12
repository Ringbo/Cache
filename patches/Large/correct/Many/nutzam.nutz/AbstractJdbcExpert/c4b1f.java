diff --git a/src/org/nutz/dao/impl/jdbc/AbstractJdbcExpert.java b/src/org/nutz/dao/impl/jdbc/AbstractJdbcExpert.java
index 4ed51b9..bffa8c6 100644
--- a/src/org/nutz/dao/impl/jdbc/AbstractJdbcExpert.java
+++ b/src/org/nutz/dao/impl/jdbc/AbstractJdbcExpert.java
@@ -338,7 +338,7 @@
                                                                                       : commentColumn);
                     columnCommentSQL.vars()
                                     .set("table", en.getTableName())
-                                    .set("column", mf.getColumnName())
+                                    .set("column", mf.getColumnNameInSql())
                                     .set("columnComment", mf.getColumnComment());
                     sqls.add(columnCommentSQL);
                 }
