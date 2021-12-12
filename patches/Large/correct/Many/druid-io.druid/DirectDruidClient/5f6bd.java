diff --git a/server/src/main/java/io/druid/client/DirectDruidClient.java b/server/src/main/java/io/druid/client/DirectDruidClient.java
index cd1705d..5399a01 100644
--- a/server/src/main/java/io/druid/client/DirectDruidClient.java
+++ b/server/src/main/java/io/druid/client/DirectDruidClient.java
@@ -337,7 +337,7 @@
         public ClientResponse<InputStream> done(ClientResponse<InputStream> clientResponse)
         {
           long stopTimeNs = System.nanoTime();
-          long nodeTimeNs = stopTimeNs - responseStartTimeNs;
+          long nodeTimeNs = stopTimeNs - requestStartTimeNs;
           final long nodeTimeMs = TimeUnit.NANOSECONDS.toMillis(nodeTimeNs);
           log.debug(
               "Completed queryId[%s] request to url[%s] with %,d bytes returned in %,d millis [%,f b/s].",
