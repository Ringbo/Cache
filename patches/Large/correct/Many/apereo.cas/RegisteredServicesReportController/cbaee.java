diff --git a/support/cas-server-support-reports/src/main/java/org/apereo/cas/web/report/RegisteredServicesReportController.java b/support/cas-server-support-reports/src/main/java/org/apereo/cas/web/report/RegisteredServicesReportController.java
index 7c7ad77..09145ae 100644
--- a/support/cas-server-support-reports/src/main/java/org/apereo/cas/web/report/RegisteredServicesReportController.java
+++ b/support/cas-server-support-reports/src/main/java/org/apereo/cas/web/report/RegisteredServicesReportController.java
@@ -50,11 +50,11 @@
      */
     @GetMapping
     @ResponseBody
-    public WebAsyncTask<Map<String, Object>> handle(final HttpServletRequest request, final HttpServletResponse response) {
+    public WebAsyncTask<Map<Long, Object>> handle(final HttpServletRequest request, final HttpServletResponse response) {
         ensureEndpointAccessIsAuthorized(request, response);
-        final Callable<Map<String, Object>> asyncTask = () -> this.servicesManager.getAllServices()
+        final Callable<Map<Long, Object>> asyncTask = () -> this.servicesManager.getAllServices()
                 .stream()
-                .collect(Collectors.toMap(RegisteredService::getName, Function.identity()));
+                .collect(Collectors.toMap(RegisteredService::getId, Function.identity()));
         final long timeout = Beans.newDuration(casProperties.getHttpClient().getAsyncTimeout()).toMillis();
         return new WebAsyncTask<>(timeout, asyncTask);
     }
