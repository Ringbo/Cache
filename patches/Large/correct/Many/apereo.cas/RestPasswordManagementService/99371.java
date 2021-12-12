diff --git a/support/cas-server-support-pm-rest/src/main/java/org/apereo/cas/pm/rest/RestPasswordManagementService.java b/support/cas-server-support-pm-rest/src/main/java/org/apereo/cas/pm/rest/RestPasswordManagementService.java
index 9b95d6e..33bb8a4 100644
--- a/support/cas-server-support-pm-rest/src/main/java/org/apereo/cas/pm/rest/RestPasswordManagementService.java
+++ b/support/cas-server-support-pm-rest/src/main/java/org/apereo/cas/pm/rest/RestPasswordManagementService.java
@@ -53,7 +53,7 @@
         headers.put("oldPassword", Arrays.asList(upc.getPassword()));
 
         final HttpEntity<String> entity = new HttpEntity<>(headers);
-        final ResponseEntity<Boolean> result = restTemplate.exchange(rest.getEndpointUrlEmail(), HttpMethod.POST, entity, Boolean.class);
+        final ResponseEntity<Boolean> result = restTemplate.exchange(rest.getEndpointUrlChange(), HttpMethod.POST, entity, Boolean.class);
         if (result.getStatusCodeValue() == HttpStatus.OK.value()) {
             return result.getBody();
         }
