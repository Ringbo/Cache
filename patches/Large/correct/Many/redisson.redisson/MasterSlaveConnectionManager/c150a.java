diff --git a/src/main/java/org/redisson/connection/MasterSlaveConnectionManager.java b/src/main/java/org/redisson/connection/MasterSlaveConnectionManager.java
index 319c7a3..814781e 100644
--- a/src/main/java/org/redisson/connection/MasterSlaveConnectionManager.java
+++ b/src/main/java/org/redisson/connection/MasterSlaveConnectionManager.java
@@ -339,7 +339,7 @@
         return locks[Math.abs(channelName.hashCode() % locks.length)];
     }
     
-    private void subscribe(final Codec codec, final String channelName, final RedisPubSubListener listener, final Promise<PubSubConnectionEntry> promise, PubSubType type, Semaphore lock) {
+    private void subscribe(final Codec codec, final String channelName, final RedisPubSubListener listener, final Promise<PubSubConnectionEntry> promise, PubSubType type, final Semaphore lock) {
         
             final PubSubConnectionEntry сonnEntry = name2PubSubConnection.get(channelName);
             if (сonnEntry != null) {
@@ -355,7 +355,7 @@
             }
 
             freePubSubLock.acquireUninterruptibly();
-            PubSubConnectionEntry freeEntry = freePubSubConnections.peek();
+            final PubSubConnectionEntry freeEntry = freePubSubConnections.peek();
             if (freeEntry == null) {
                 connect(codec, channelName, listener, promise, type, lock);
                 return;
@@ -407,7 +407,7 @@
     
     private void subscribe(final Codec codec, final String channelName, final RedisPubSubListener listener, final Promise<PubSubConnectionEntry> promise, PubSubType type) {
         
-        Semaphore lock = locks[Math.abs(channelName.hashCode() % locks.length)];
+        final Semaphore lock = locks[Math.abs(channelName.hashCode() % locks.length)];
         lock.acquireUninterruptibly();
             final PubSubConnectionEntry сonnEntry = name2PubSubConnection.get(channelName);
             if (сonnEntry != null) {
@@ -423,7 +423,7 @@
             }
 
             freePubSubLock.acquireUninterruptibly();
-            PubSubConnectionEntry freeEntry = freePubSubConnections.peek();
+            final PubSubConnectionEntry freeEntry = freePubSubConnections.peek();
             if (freeEntry == null) {
                 connect(codec, channelName, listener, promise, type, lock);
                 return;
@@ -531,7 +531,7 @@
         });
     }
 
-    public Codec unsubscribe(final String channelName, Semaphore lock) {
+    public Codec unsubscribe(final String channelName, final Semaphore lock) {
         final PubSubConnectionEntry entry = name2PubSubConnection.remove(channelName);
         if (entry == null) {
             lock.release();
@@ -575,7 +575,7 @@
         return entryCodec;
     }
     
-    public Codec punsubscribe(final String channelName, Semaphore lock) {
+    public Codec punsubscribe(final String channelName, final Semaphore lock) {
         final PubSubConnectionEntry entry = name2PubSubConnection.remove(channelName);
         if (entry == null) {
             lock.release();
