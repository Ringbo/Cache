diff --git a/webapp-mgmt/cas-management-webapp-support/src/main/java/org/apereo/cas/mgmt/services/web/ManageRegisteredServicesMultiActionController.java b/webapp-mgmt/cas-management-webapp-support/src/main/java/org/apereo/cas/mgmt/services/web/ManageRegisteredServicesMultiActionController.java
index cfdf48e..2b6ca33c 100644
--- a/webapp-mgmt/cas-management-webapp-support/src/main/java/org/apereo/cas/mgmt/services/web/ManageRegisteredServicesMultiActionController.java
+++ b/webapp-mgmt/cas-management-webapp-support/src/main/java/org/apereo/cas/mgmt/services/web/ManageRegisteredServicesMultiActionController.java
@@ -128,18 +128,18 @@
      */
     @GetMapping(value = "/deleteRegisteredService")
     public ResponseEntity<String> deleteRegisteredService(@RequestParam("id") final long idAsLong,
-                                                          final HttpServletResponse response) throws Exception {
+                                                          final HttpServletResponse response) {
         final RegisteredService svc = this.servicesManager.findServiceBy(this.defaultService);
         if (svc == null || svc.getId() == idAsLong) {
-            return new ResponseEntity<String>("The default service " + this.defaultService.getId() + " cannot be deleted. "
+            return new ResponseEntity<>("The default service " + this.defaultService.getId() + " cannot be deleted. "
                     + "The definition is required for accessing the application.", HttpStatus.BAD_REQUEST);
         }
 
         final RegisteredService r = this.servicesManager.delete(idAsLong);
         if (r == null) {
-            return new ResponseEntity<String>("Service id " + idAsLong + " cannot be found.", HttpStatus.BAD_REQUEST);
+            return new ResponseEntity<>("Service id " + idAsLong + " cannot be found.", HttpStatus.BAD_REQUEST);
         }
-        return new ResponseEntity<String>(r.getName(), HttpStatus.OK);
+        return new ResponseEntity<>(r.getName(), HttpStatus.OK);
     }
 
     /**
@@ -167,7 +167,7 @@
     @GetMapping(value = "/domains")
     public ResponseEntity<Collection<String>> getDomains() throws Exception {
         final Collection<String> data = this.servicesManager.getDomains();
-        return new ResponseEntity<Collection<String>>(data, HttpStatus.OK);
+        return new ResponseEntity<>(data, HttpStatus.OK);
     }
 
     /**
