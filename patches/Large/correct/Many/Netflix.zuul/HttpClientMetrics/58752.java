diff --git a/zuul-netty/src/main/java/com/netflix/zuul/rxnetty/HttpClientMetrics.java b/zuul-netty/src/main/java/com/netflix/zuul/rxnetty/HttpClientMetrics.java
index 1a01a08..fea4da0 100644
--- a/zuul-netty/src/main/java/com/netflix/zuul/rxnetty/HttpClientMetrics.java
+++ b/zuul-netty/src/main/java/com/netflix/zuul/rxnetty/HttpClientMetrics.java
@@ -15,13 +15,13 @@
 
     public HttpClientMetrics(String monitorId) {
         super(monitorId);
-        hostsInPool = newGauge("requestBacklog", monitorId, new AtomicInteger());
+        hostsInPool = newGauge("hostsInPool", monitorId, new AtomicInteger());
         quarantinedHosts = newCounter("quarantinedHosts", monitorId);
         removedHosts = newCounter("removedHosts", monitorId);
     }
 
     public void onNewHost() {
-        hostsInPool.decrementAndGet();
+        hostsInPool.incrementAndGet();
     }
 
     public void onHostQuarantine() {
