diff --git a/graylog2-server/src/main/java/org/graylog2/rest/resources/streams/alerts/StreamAlertReceiverResource.java b/graylog2-server/src/main/java/org/graylog2/rest/resources/streams/alerts/StreamAlertReceiverResource.java
index 2960e7a..fd877f7 100644
--- a/graylog2-server/src/main/java/org/graylog2/rest/resources/streams/alerts/StreamAlertReceiverResource.java
+++ b/graylog2-server/src/main/java/org/graylog2/rest/resources/streams/alerts/StreamAlertReceiverResource.java
@@ -106,7 +106,7 @@
         final Stream stream = streamService.load(streamid);
 
         // TODO What's the actual URI of the created resource?
-        final URI streamAlertUri = UriBuilder.fromResource(StreamAlertResource.class).build();
+        final URI streamAlertUri = UriBuilder.fromResource(StreamAlertResource.class).build(streamid);
 
         // Maybe the list already contains this receiver?
         if (stream.getAlertReceivers().containsKey(type) || stream.getAlertReceivers().get(type) != null) {
