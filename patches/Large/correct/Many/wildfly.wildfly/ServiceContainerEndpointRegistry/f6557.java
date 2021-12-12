diff --git a/webservices/server-integration/src/main/java/org/jboss/as/webservices/util/ServiceContainerEndpointRegistry.java b/webservices/server-integration/src/main/java/org/jboss/as/webservices/util/ServiceContainerEndpointRegistry.java
index 179ebd5..f0bae70 100644
--- a/webservices/server-integration/src/main/java/org/jboss/as/webservices/util/ServiceContainerEndpointRegistry.java
+++ b/webservices/server-integration/src/main/java/org/jboss/as/webservices/util/ServiceContainerEndpointRegistry.java
@@ -43,10 +43,10 @@
         Set<ObjectName> endpoints = new CopyOnWriteArraySet<ObjectName>();
         for (ServiceName sname : WSServices.getContainerRegistry().getServiceNames()) {
             if (sname.getCanonicalName().startsWith(endpointPrefix)) {
-                String contextPath = sname.getParent().getSimpleName().substring(9);
+                String contextPath = sname.getParent().getSimpleName().substring(8);
                 String endpointName = sname.getSimpleName();
                 final StringBuilder name = new StringBuilder(Endpoint.SEPID_DOMAIN + ":");
-                name.append(Endpoint.SEPID_PROPERTY_CONTEXT + "=" + contextPath);
+                name.append(Endpoint.SEPID_PROPERTY_CONTEXT + "=" + contextPath + ",");
                 name.append(Endpoint.SEPID_PROPERTY_ENDPOINT + "=" + endpointName);
                 endpoints.add(ObjectNameFactory.create(name.toString()));
             }
