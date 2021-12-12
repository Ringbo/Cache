diff --git a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/dbsync/TableMetaCache.java b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/dbsync/TableMetaCache.java
index 10e0e26..cc1e579 100644
--- a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/dbsync/TableMetaCache.java
+++ b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/dbsync/TableMetaCache.java
@@ -53,7 +53,7 @@
                 public TableMeta load(String name) throws Exception {
                     try {
                         return getTableMetaByDB(name);
-                    } catch (CanalParseException e) {
+                    } catch (Throwable e) {
                         // 尝试做一次retry操作
                         try {
                             connection.reconnect();
