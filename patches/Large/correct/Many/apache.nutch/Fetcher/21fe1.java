diff --git a/src/java/org/apache/nutch/fetcher/Fetcher.java b/src/java/org/apache/nutch/fetcher/Fetcher.java
index 412c803..7ddd72e 100644
--- a/src/java/org/apache/nutch/fetcher/Fetcher.java
+++ b/src/java/org/apache/nutch/fetcher/Fetcher.java
@@ -338,7 +338,7 @@
       if (it != null) addFetchItem(it);
     }
     
-    public void addFetchItem(FetchItem it) {
+    public synchronized void addFetchItem(FetchItem it) {
       FetchItemQueue fiq = getFetchItemQueue(it.queueID);
       fiq.addFetchItem(it);
       totalSize.incrementAndGet();
