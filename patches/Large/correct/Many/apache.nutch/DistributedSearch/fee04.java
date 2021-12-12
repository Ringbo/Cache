diff --git a/src/java/org/apache/nutch/searcher/DistributedSearch.java b/src/java/org/apache/nutch/searcher/DistributedSearch.java
index d7f737e..1853cc9 100644
--- a/src/java/org/apache/nutch/searcher/DistributedSearch.java
+++ b/src/java/org/apache/nutch/searcher/DistributedSearch.java
@@ -160,7 +160,7 @@
           continue;
         }
         for (int j = 0; j < segments.length; j++) {
-          LOG.info("Client: segment "+segments[j]+" at "+addr);
+          LOG.finest("Client: segment "+segments[j]+" at "+addr);
           segmentToAddress.put(segments[j], addr);
         }
         liveAddresses.add(addr);
