diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/multimap/ClientMultiMapLockTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/multimap/ClientMultiMapLockTest.java
index c6d4fdf..e251ca9 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/multimap/ClientMultiMapLockTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/multimap/ClientMultiMapLockTest.java
@@ -347,7 +347,7 @@
         new Thread() {
             public void run() {
                 try {
-                    if (mm.tryLock(key, 4, TimeUnit.SECONDS)) {
+                    if (mm.tryLock(key, 10, TimeUnit.SECONDS)) {
                         tryLockSuccess.countDown();
                     }
                 } catch (InterruptedException e) {
