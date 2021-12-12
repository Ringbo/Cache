diff --git a/hazelcast/src/main/java/com/hazelcast/concurrent/lock/LockResourceImpl.java b/hazelcast/src/main/java/com/hazelcast/concurrent/lock/LockResourceImpl.java
index 98c2532..d56c5e1 100644
--- a/hazelcast/src/main/java/com/hazelcast/concurrent/lock/LockResourceImpl.java
+++ b/hazelcast/src/main/java/com/hazelcast/concurrent/lock/LockResourceImpl.java
@@ -281,7 +281,7 @@
 
     @Override
     public long getRemainingLeaseTime() {
-        if (expirationTime == Long.MAX_VALUE && expirationTime < 0) {
+        if (expirationTime == Long.MAX_VALUE || expirationTime < 0) {
             return Long.MAX_VALUE;
         }
         long now = Clock.currentTimeMillis();
