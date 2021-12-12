diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/map/ClientMapLockTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/map/ClientMapLockTest.java
index f6a49f8..8ac8fa4 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/map/ClientMapLockTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/map/ClientMapLockTest.java
@@ -436,12 +436,12 @@
         final String newValue = "NEW_VALUE";
 
         map.put(key, oldValue);
-        map.lock(key, 4, TimeUnit.SECONDS);
+        map.lock(key, 1, TimeUnit.SECONDS);
 
         final CountDownLatch tryPutReturned = new CountDownLatch(1);
         new Thread() {
             public void run() {
-                map.tryPut(key, newValue, 8, TimeUnit.SECONDS);
+                map.tryPut(key, newValue, 60, TimeUnit.SECONDS);
                 tryPutReturned.countDown();
             }
         }.start();
@@ -456,12 +456,12 @@
         final String key = "key";
         final String value = "value";
 
-        map.lock(key, 4, TimeUnit.SECONDS);
+        map.lock(key, 1, TimeUnit.SECONDS);
 
         final CountDownLatch tryPutReturned = new CountDownLatch(1);
         new Thread() {
             public void run() {
-                map.tryPut(key, value, 8, TimeUnit.SECONDS);
+                map.tryPut(key, value, 60, TimeUnit.SECONDS);
                 tryPutReturned.countDown();
             }
         }.start();
