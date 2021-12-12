diff --git a/java/org/apache/catalina/core/NamingContextListener.java b/java/org/apache/catalina/core/NamingContextListener.java
index bd8b5ac..388696a 100644
--- a/java/org/apache/catalina/core/NamingContextListener.java
+++ b/java/org/apache/catalina/core/NamingContextListener.java
@@ -998,7 +998,7 @@
 
         // Create a reference to the resource.
         Reference ref = new ServiceRef
-            (service.getName(), service.getType(), service.getServiceqname(),
+            (service.getName(), service.getInterface(), service.getServiceqname(),
              service.getWsdlfile(), service.getJaxrpcmappingfile());
         // Adding the additional port-component-ref, if any
         Iterator<String> portcomponent = service.getServiceendpoints();
