diff --git a/node/etl/src/main/java/com/alibaba/otter/node/etl/load/loader/db/DbLoadAction.java b/node/etl/src/main/java/com/alibaba/otter/node/etl/load/loader/db/DbLoadAction.java
index ad68692..9f63403 100644
--- a/node/etl/src/main/java/com/alibaba/otter/node/etl/load/loader/db/DbLoadAction.java
+++ b/node/etl/src/main/java/com/alibaba/otter/node/etl/load/loader/db/DbLoadAction.java
@@ -357,7 +357,7 @@
                 Boolean result = dbDialect.getJdbcTemplate().execute(new StatementCallback<Boolean>() {
 
                     public Boolean doInStatement(Statement stmt) throws SQLException, DataAccessException {
-                        Boolean result = false;
+                        Boolean result = true;
                         if (dbDialect instanceof MysqlDialect && StringUtils.isNotEmpty(data.getDdlSchemaName())) {
                             // 如果mysql，执行ddl时，切换到在源库执行的schema上
                             // result &= stmt.execute("use " +
