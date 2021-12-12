diff --git a/support/cas-server-support-rest/src/main/java/org/apereo/cas/support/rest/resources/TicketGrantingTicketResource.java b/support/cas-server-support-rest/src/main/java/org/apereo/cas/support/rest/resources/TicketGrantingTicketResource.java
index 7d34d3f..a0e39f0 100644
--- a/support/cas-server-support-rest/src/main/java/org/apereo/cas/support/rest/resources/TicketGrantingTicketResource.java
+++ b/support/cas-server-support-rest/src/main/java/org/apereo/cas/support/rest/resources/TicketGrantingTicketResource.java
@@ -157,7 +157,7 @@
                 .collect(Collectors.toList());
         final Map<String, List<String>> errorsMap = new HashMap<>();
         errorsMap.put("authentication_exceptions", authnExceptions);
-        LOGGER.error("[{}] Caused by: [{}]", e.getMessage(), authnExceptions, e);
+        LOGGER.warn("[{}] Caused by: [{}]", e.getMessage(), authnExceptions);
         try {
             return new ResponseEntity<>(this.jacksonPrettyWriter.writeValueAsString(errorsMap), HttpStatus.UNAUTHORIZED);
         } catch (final JsonProcessingException exception) {
