diff --git a/webapp-mgmt/cas-management-webapp-support/src/test/java/org/apereo/cas/services/web/RegisteredServiceSimpleFormControllerTests.java b/webapp-mgmt/cas-management-webapp-support/src/test/java/org/apereo/cas/services/web/RegisteredServiceSimpleFormControllerTests.java
index 0125977..8e2942e 100644
--- a/webapp-mgmt/cas-management-webapp-support/src/test/java/org/apereo/cas/services/web/RegisteredServiceSimpleFormControllerTests.java
+++ b/webapp-mgmt/cas-management-webapp-support/src/test/java/org/apereo/cas/services/web/RegisteredServiceSimpleFormControllerTests.java
@@ -95,7 +95,7 @@
 
         assertTrue(this.manager.getAllServices().isEmpty());
         final RegisteredServiceEditBean.ServiceData data = registeredServiceFactory.createServiceData(svc);
-        this.controller.saveService(new MockHttpServletRequest(), new MockHttpServletResponse(), data, mock(BindingResult.class));
+        this.controller.saveService(data);
 
         final Collection<RegisteredService> services = this.manager.getAllServices();
         assertEquals(1, services.size());
@@ -120,7 +120,7 @@
         svc.setEvaluationOrder(1000);
 
         final RegisteredServiceEditBean.ServiceData data = registeredServiceFactory.createServiceData(svc);
-        this.controller.saveService(new MockHttpServletRequest(), new MockHttpServletResponse(), data, mock(BindingResult.class));
+        this.controller.saveService(data);
 
         assertFalse(this.manager.getAllServices().isEmpty());
         final RegisteredService r2 = this.manager.findServiceBy(1000);
@@ -138,7 +138,7 @@
         svc.setEvaluationOrder(1000);
 
         final RegisteredServiceEditBean.ServiceData data = registeredServiceFactory.createServiceData(svc);
-        this.controller.saveService(new MockHttpServletRequest(), new MockHttpServletResponse(), data, mock(BindingResult.class));
+        this.controller.saveService(data);
 
         final Collection<RegisteredService> services = this.manager.getAllServices();
         assertEquals(1, services.size());
@@ -155,7 +155,7 @@
         svc.setEvaluationOrder(1000);
 
         final RegisteredServiceEditBean.ServiceData data = registeredServiceFactory.createServiceData(svc);
-        this.controller.saveService(new MockHttpServletRequest(), new MockHttpServletResponse(), data, mock(BindingResult.class));
+        this.controller.saveService(data);
 
         svc = new RegexRegisteredService();
         svc.setDescription(DESCRIPTION);
@@ -165,7 +165,7 @@
         svc.setEvaluationOrder(100);
 
         final RegisteredServiceEditBean.ServiceData data2 = registeredServiceFactory.createServiceData(svc);
-        this.controller.saveService(new MockHttpServletRequest(), new MockHttpServletResponse(), data2, mock(BindingResult.class));
+        this.controller.saveService(data2);
 
         final Collection<RegisteredService> services = this.manager.getAllServices();
         assertEquals(2, services.size());
@@ -187,7 +187,7 @@
         svc.setEvaluationOrder(1000);
 
         final RegisteredServiceEditBean.ServiceData data = registeredServiceFactory.createServiceData(svc);
-        this.controller.saveService(new MockHttpServletRequest(), new MockHttpServletResponse(), data, mock(BindingResult.class));
+        this.controller.saveService(data);
 
         final Collection<RegisteredService> services = this.manager.getAllServices();
         assertEquals(1, services.size());
@@ -212,7 +212,7 @@
 
         r.setServiceId("serviceId1");
         final RegisteredServiceEditBean.ServiceData data = registeredServiceFactory.createServiceData(r);
-        this.controller.saveService(new MockHttpServletRequest(), new MockHttpServletResponse(), data, mock(BindingResult.class));
+        this.controller.saveService(data);
 
         assertFalse(this.manager.getAllServices().isEmpty());
         final RegisteredService r2 = this.manager.findServiceBy(1000);
