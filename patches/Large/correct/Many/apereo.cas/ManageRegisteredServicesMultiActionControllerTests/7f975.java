diff --git a/webapp-mgmt/cas-management-webapp-support/src/test/java/org/apereo/cas/services/web/ManageRegisteredServicesMultiActionControllerTests.java b/webapp-mgmt/cas-management-webapp-support/src/test/java/org/apereo/cas/services/web/ManageRegisteredServicesMultiActionControllerTests.java
index 7130843..1bf72c4 100644
--- a/webapp-mgmt/cas-management-webapp-support/src/test/java/org/apereo/cas/services/web/ManageRegisteredServicesMultiActionControllerTests.java
+++ b/webapp-mgmt/cas-management-webapp-support/src/test/java/org/apereo/cas/services/web/ManageRegisteredServicesMultiActionControllerTests.java
@@ -107,7 +107,7 @@
         this.thrown.expectMessage("Service id 5000 cannot be found.");
 
         this.servicesManager.save(r);
-        RegisteredServiceViewBean[] svcs = new RegisteredServiceViewBean[2];
+        final RegisteredServiceViewBean[] svcs = new RegisteredServiceViewBean[2];
         RegisteredServiceViewBean rsb = new RegisteredServiceViewBean();
         rsb.setAssignedId("5000");
         svcs[0] = rsb;
