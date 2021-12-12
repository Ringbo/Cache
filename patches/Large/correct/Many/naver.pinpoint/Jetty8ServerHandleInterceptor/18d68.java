diff --git a/plugins/jetty/src/main/java/com/navercorp/pinpoint/plugin/jetty/interceptor/Jetty8ServerHandleInterceptor.java b/plugins/jetty/src/main/java/com/navercorp/pinpoint/plugin/jetty/interceptor/Jetty8ServerHandleInterceptor.java
index 9f3e1d0..076d640 100644
--- a/plugins/jetty/src/main/java/com/navercorp/pinpoint/plugin/jetty/interceptor/Jetty8ServerHandleInterceptor.java
+++ b/plugins/jetty/src/main/java/com/navercorp/pinpoint/plugin/jetty/interceptor/Jetty8ServerHandleInterceptor.java
@@ -27,7 +27,7 @@
 
 
             final Method getRequestMethod = getGetRequestMethod(object);
-            if (getRequestMethod == null) {
+            if (getRequestMethod != null) {
                 final Request request = (Request) getRequestMethod.invoke(object);
                 return request;
             }
