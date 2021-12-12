diff --git a/rt/core/src/main/java/org/apache/cxf/endpoint/ClientImpl.java b/rt/core/src/main/java/org/apache/cxf/endpoint/ClientImpl.java
index cd1ef6a..af0bf6d 100644
--- a/rt/core/src/main/java/org/apache/cxf/endpoint/ClientImpl.java
+++ b/rt/core/src/main/java/org/apache/cxf/endpoint/ClientImpl.java
@@ -681,7 +681,7 @@
         }
         List<Interceptor<? extends Message>> i3 = endpoint.getInInterceptors();
         if (LOG.isLoggable(Level.FINE)) {
-            LOG.fine("Interceptors contributed by endpoint: " + i2);
+            LOG.fine("Interceptors contributed by endpoint: " + i3);
         }
         List<Interceptor<? extends Message>> i4 = endpoint.getBinding().getInInterceptors();
         if (LOG.isLoggable(Level.FINE)) {
