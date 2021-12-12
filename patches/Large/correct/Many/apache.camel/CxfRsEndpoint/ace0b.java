diff --git a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/jaxrs/CxfRsEndpoint.java b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/jaxrs/CxfRsEndpoint.java
index df29145..824af69 100644
--- a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/jaxrs/CxfRsEndpoint.java
+++ b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/jaxrs/CxfRsEndpoint.java
@@ -121,7 +121,7 @@
 
     }
     
-    public CxfRsBinding getBinding() {
+    public synchronized CxfRsBinding getBinding() {
         if (binding == null) {
             binding = new DefaultCxfRsBinding();
             if (LOG.isDebugEnabled()) {
