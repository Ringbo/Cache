diff --git a/sharding-core/src/main/java/io/shardingsphere/core/property/dialect/SQLServerDataSourcePropertyParser.java b/sharding-core/src/main/java/io/shardingsphere/core/property/dialect/SQLServerDataSourcePropertyParser.java
index 2aa1720..1b51ef6 100644
--- a/sharding-core/src/main/java/io/shardingsphere/core/property/dialect/SQLServerDataSourcePropertyParser.java
+++ b/sharding-core/src/main/java/io/shardingsphere/core/property/dialect/SQLServerDataSourcePropertyParser.java
@@ -31,7 +31,7 @@
  */
 public final class SQLServerDataSourcePropertyParser extends DataSourcePropertyParser {
     
-    private static final Integer DEFAULT_PORT = 5432;
+    private static final Integer DEFAULT_PORT = 1433;
     
     @Override
     protected DataSourceProperty parseJDBCUrl(final String url) {
@@ -42,6 +42,6 @@
             throw new ShardingException("The URL of JDBC is not supported.");
         }
         return new DataSourceProperty(uri.getHost(), -1 == uri.getPort() ? DEFAULT_PORT : uri.getPort(),
-                uri.getPath().substring(1), DatabaseType.PostgreSQL);
+                uri.getPath().substring(1), DatabaseType.SQLServer);
     }
 }
