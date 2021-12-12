diff --git a/graylog2-server/src/main/java/org/graylog2/rest/resources/streams/alerts/StreamAlertConditionResource.java b/graylog2-server/src/main/java/org/graylog2/rest/resources/streams/alerts/StreamAlertConditionResource.java
index a895cc1..299915a 100644
--- a/graylog2-server/src/main/java/org/graylog2/rest/resources/streams/alerts/StreamAlertConditionResource.java
+++ b/graylog2-server/src/main/java/org/graylog2/rest/resources/streams/alerts/StreamAlertConditionResource.java
@@ -101,7 +101,7 @@
         final Map<String, String> result = ImmutableMap.of("alert_condition_id", alertCondition.getId());
         final URI alertConditionUri = UriBuilder.fromResource(StreamAlertConditionResource.class)
                 .path("{conditionId}")
-                .build(alertCondition.getId());
+                .build(stream.getId(), alertCondition.getId());
 
         return Response.created(alertConditionUri).entity(result).build();
     }
