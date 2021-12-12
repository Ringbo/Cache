diff --git a/client-adapter/hbase/src/main/java/com/alibaba/otter/canal/client/adapter/hbase/HbaseAdapter.java b/client-adapter/hbase/src/main/java/com/alibaba/otter/canal/client/adapter/hbase/HbaseAdapter.java
index c307aec..66af5f5 100644
--- a/client-adapter/hbase/src/main/java/com/alibaba/otter/canal/client/adapter/hbase/HbaseAdapter.java
+++ b/client-adapter/hbase/src/main/java/com/alibaba/otter/canal/client/adapter/hbase/HbaseAdapter.java
@@ -96,7 +96,7 @@
             hbaseSyncService = new HbaseSyncService(hbaseTemplate);
 
             configMonitor = new HbaseConfigMonitor();
-            configMonitor.init(this);
+            configMonitor.init(this, envProperties);
         } catch (Exception e) {
             throw new RuntimeException(e);
         }
