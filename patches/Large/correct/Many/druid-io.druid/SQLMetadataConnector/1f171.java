diff --git a/server/src/main/java/io/druid/db/SQLMetadataConnector.java b/server/src/main/java/io/druid/db/SQLMetadataConnector.java
index bfcff59..23e25e2 100644
--- a/server/src/main/java/io/druid/db/SQLMetadataConnector.java
+++ b/server/src/main/java/io/druid/db/SQLMetadataConnector.java
@@ -77,7 +77,7 @@
 
   protected abstract boolean tableExists(Handle handle, final String tableName);
 
-  public void createTable(final IDBI dbi, final String tableName, final List<String> sql)
+  public void createTable(final IDBI dbi, final String tableName, final Iterable<String> sql)
   {
     try {
       dbi.withHandle(
