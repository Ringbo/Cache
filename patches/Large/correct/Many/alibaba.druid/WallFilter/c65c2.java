diff --git a/src/main/java/com/alibaba/druid/wall/WallFilter.java b/src/main/java/com/alibaba/druid/wall/WallFilter.java
index 154ede8..8c947ed 100644
--- a/src/main/java/com/alibaba/druid/wall/WallFilter.java
+++ b/src/main/java/com/alibaba/druid/wall/WallFilter.java
@@ -59,7 +59,7 @@
     public final static String ATTR_SQL_STAT  = "wall.sqlStat";
 
     @Override
-    public void init(DataSourceProxy dataSource) {
+    public synchronized void init(DataSourceProxy dataSource) {
         if (this.dbType == null || this.dbType.trim().length() == 0) {
             if (dataSource != null && dataSource.getDbType() != null) {
                 this.dbType = dataSource.getDbType();
