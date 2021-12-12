diff --git a/modules/cpr/src/main/java/org/atmosphere/cache/AbstractBroadcasterCache.java b/modules/cpr/src/main/java/org/atmosphere/cache/AbstractBroadcasterCache.java
index 34f9989..b8ea5cc 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cache/AbstractBroadcasterCache.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cache/AbstractBroadcasterCache.java
@@ -57,7 +57,7 @@
             public void run() {
                 readWriteLock.writeLock().lock();
                 try {
-                    long now = System.currentTimeMillis();
+                    long now = System.nanoTime();
                     List<CacheMessage> expiredMessages = new ArrayList<CacheMessage>();
 
                     for (CacheMessage message : messages) {
