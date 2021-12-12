diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/TestMetaTableLocator.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/TestMetaTableLocator.java
index d2448b3..dccd7ca 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/TestMetaTableLocator.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/TestMetaTableLocator.java
@@ -326,7 +326,7 @@
 
     void doWaiting() throws InterruptedException {
       try {
-        while (new MetaTableLocator().waitMetaRegionLocation(watcher, 100) == null);
+        while (new MetaTableLocator().waitMetaRegionLocation(watcher, 10000) == null);
       } catch (NotAllMetaRegionsOnlineException e) {
         //Ignore
       }
