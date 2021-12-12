diff --git a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/servlet/CXFNonSpringJaxrsServlet.java b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/servlet/CXFNonSpringJaxrsServlet.java
index 155c892..4b34eea 100644
--- a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/servlet/CXFNonSpringJaxrsServlet.java
+++ b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/servlet/CXFNonSpringJaxrsServlet.java
@@ -417,7 +417,7 @@
 
     protected boolean isAppResourceLifecycleASingleton(Application app, ServletConfig servletConfig) {
         String scope = servletConfig.getInitParameter(SERVICE_SCOPE_PARAM);
-        if (scope != null) {
+        if (scope == null) {
             scope = (String)app.getProperties().get(SERVICE_SCOPE_PARAM);
         }
         return SERVICE_SCOPE_SINGLETON.equals(scope);    
