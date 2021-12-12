diff --git a/hazelcast/src/main/java/com/hazelcast/core/ICountDownLatch.java b/hazelcast/src/main/java/com/hazelcast/core/ICountDownLatch.java
index 2aed349..b2b9430 100644
--- a/hazelcast/src/main/java/com/hazelcast/core/ICountDownLatch.java
+++ b/hazelcast/src/main/java/com/hazelcast/core/ICountDownLatch.java
@@ -118,6 +118,6 @@
      *         count is not zero
      * @throws IllegalArgumentException if {@code count} is negative
      */
-    boolean trySetCount(int count) throws IllegalArgumentException;
+    boolean trySetCount(int count);
 
 }
