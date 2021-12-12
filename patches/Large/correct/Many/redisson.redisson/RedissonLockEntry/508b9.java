diff --git a/src/main/java/org/redisson/RedissonLockEntry.java b/src/main/java/org/redisson/RedissonLockEntry.java
index 779276d..ca274e7 100644
--- a/src/main/java/org/redisson/RedissonLockEntry.java
+++ b/src/main/java/org/redisson/RedissonLockEntry.java
@@ -34,7 +34,7 @@
     
     public RedissonLockEntry(Promise<Boolean> promise) {
         super();
-        this.latch = new Semaphore(1);
+        this.latch = new Semaphore(0);
         this.promise = promise;
     }
     
