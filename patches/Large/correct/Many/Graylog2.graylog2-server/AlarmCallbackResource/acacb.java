diff --git a/graylog2-server/src/main/java/org/graylog2/rest/resources/alarmcallbacks/AlarmCallbackResource.java b/graylog2-server/src/main/java/org/graylog2/rest/resources/alarmcallbacks/AlarmCallbackResource.java
index 8bdb154..cfb7bf4 100644
--- a/graylog2-server/src/main/java/org/graylog2/rest/resources/alarmcallbacks/AlarmCallbackResource.java
+++ b/graylog2-server/src/main/java/org/graylog2/rest/resources/alarmcallbacks/AlarmCallbackResource.java
@@ -141,7 +141,7 @@
         final Map<String, String> result = ImmutableMap.of("alarmcallback_id", id);
         final URI alarmCallbackUri = UriBuilder.fromResource(AlarmCallbackResource.class)
                 .path("{alarmCallbackId}")
-                .build(id);
+                .build(streamid, id);
 
         return Response.created(alarmCallbackUri).entity(result).build();
     }
