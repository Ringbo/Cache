diff --git a/src/java/org/apache/nutch/fetcher/FetcherJob.java b/src/java/org/apache/nutch/fetcher/FetcherJob.java
index 934c630..9bc7710 100644
--- a/src/java/org/apache/nutch/fetcher/FetcherJob.java
+++ b/src/java/org/apache/nutch/fetcher/FetcherJob.java
@@ -257,7 +257,7 @@
     }
 
     crawlId = args[0];
-    if (!crawlId.equals("-all") || crawlId.startsWith("-")) {
+    if (!crawlId.equals("-all") && crawlId.startsWith("-")) {
       System.err.println(usage);
       return -1;
     }
