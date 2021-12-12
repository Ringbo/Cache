diff --git a/src/main/java/org/apache/hadoop/hbase/regionserver/MemStoreFlusher.java b/src/main/java/org/apache/hadoop/hbase/regionserver/MemStoreFlusher.java
index 6596872..8f4fde9 100644
--- a/src/main/java/org/apache/hadoop/hbase/regionserver/MemStoreFlusher.java
+++ b/src/main/java/org/apache/hadoop/hbase/regionserver/MemStoreFlusher.java
@@ -239,7 +239,7 @@
       } catch (ConcurrentModificationException ex) {
         continue;
       } catch (Exception ex) {
-        LOG.error("Cache flusher failed for entry " + fqe);
+        LOG.error("Cache flusher failed for entry " + fqe, ex);
         if (!server.checkFileSystem()) {
           break;
         }
