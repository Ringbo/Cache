diff --git a/src/main/java/com/ning/http/client/providers/NettyAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/NettyAsyncHttpProvider.java
index c061ca1..e83ac10 100644
--- a/src/main/java/com/ning/http/client/providers/NettyAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/NettyAsyncHttpProvider.java
@@ -106,7 +106,7 @@
 
     private final AsyncHttpClientConfig config;
 
-    private final ConcurrentHashMap<Url, Channel> connectionsPool = new ConcurrentHashMap<Url, Channel>();
+    private final ConcurrentHashMap<String, Channel> connectionsPool = new ConcurrentHashMap<String, Channel>();
 
     private volatile int maxConnectionsPerHost;
     private final HashedWheelTimer timer = new HashedWheelTimer();
@@ -162,7 +162,7 @@
     }
 
     private Channel lookupInCache(Url url) {
-        Channel channel = connectionsPool.get(url);
+        Channel channel = connectionsPool.get(url.getBaseUrl());
         if (channel != null) {
             /**
              * The Channel will eventually be closed by Netty and will becomes invalid.
@@ -172,7 +172,7 @@
             if (channel.isOpen()) {
                 channel.setReadable(true);
             } else {
-                connectionsPool.remove(url);
+                connectionsPool.remove(url.getBaseUrl());
             }
         }
         return channel;
@@ -461,7 +461,7 @@
 
     public void close() {
         isClose.set(true);
-        Iterator<Entry<Url, Channel>> i = connectionsPool.entrySet().iterator();
+        Iterator<Entry<String, Channel>> i = connectionsPool.entrySet().iterator();
         while (i.hasNext()) {
             i.next().getValue().close();
         }
@@ -640,7 +640,7 @@
 
     private void markAsDoneAndCacheConnection(final NettyResponseFuture<?> future, final Channel channel) throws MalformedURLException {
         if (future.getKeepAlive() && maxConnectionsPerHost++ < config.getMaxConnectionPerHost()) {
-            connectionsPool.put(future.getUrl(), channel);
+            connectionsPool.put(future.getUrl().getBaseUrl(), channel);
         } else {
             connectionsPool.remove(future.getUrl());
         }
