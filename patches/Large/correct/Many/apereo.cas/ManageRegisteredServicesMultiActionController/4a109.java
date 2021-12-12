diff --git a/webapp-mgmt/cas-management-webapp-support/src/main/java/org/apereo/cas/mgmt/services/web/ManageRegisteredServicesMultiActionController.java b/webapp-mgmt/cas-management-webapp-support/src/main/java/org/apereo/cas/mgmt/services/web/ManageRegisteredServicesMultiActionController.java
index 49185dc..cfdf48e 100644
--- a/webapp-mgmt/cas-management-webapp-support/src/main/java/org/apereo/cas/mgmt/services/web/ManageRegisteredServicesMultiActionController.java
+++ b/webapp-mgmt/cas-management-webapp-support/src/main/java/org/apereo/cas/mgmt/services/web/ManageRegisteredServicesMultiActionController.java
@@ -128,16 +128,16 @@
      */
     @GetMapping(value = "/deleteRegisteredService")
     public ResponseEntity<String> deleteRegisteredService(@RequestParam("id") final long idAsLong,
-                                                          final HttpServletResponse response) {
+                                                          final HttpServletResponse response) throws Exception {
         final RegisteredService svc = this.servicesManager.findServiceBy(this.defaultService);
         if (svc == null || svc.getId() == idAsLong) {
-            throw new IllegalArgumentException("The default service " + this.defaultService.getId() + " cannot be deleted. "
-                    + "The definition is required for accessing the application.");
+            return new ResponseEntity<String>("The default service " + this.defaultService.getId() + " cannot be deleted. "
+                    + "The definition is required for accessing the application.", HttpStatus.BAD_REQUEST);
         }
 
         final RegisteredService r = this.servicesManager.delete(idAsLong);
         if (r == null) {
-            throw new IllegalArgumentException("Service id " + idAsLong + " cannot be found.");
+            return new ResponseEntity<String>("Service id " + idAsLong + " cannot be found.", HttpStatus.BAD_REQUEST);
         }
         return new ResponseEntity<String>(r.getName(), HttpStatus.OK);
     }
