diff --git a/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CacheRemoveBackupOperation.java b/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CacheRemoveBackupOperation.java
index aa9d675..c0db5dc 100644
--- a/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CacheRemoveBackupOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/cache/impl/operation/CacheRemoveBackupOperation.java
@@ -38,7 +38,7 @@
     public void run()
             throws Exception {
         if (cache != null) {
-            response = cache.remove(key, null);
+            response = cache.removeRecord(key);
         } else {
             response = Boolean.FALSE;
         }
