diff --git a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/AbstractJAXBProvider.java b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/AbstractJAXBProvider.java
index e491f40..dd1847d 100644
--- a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/AbstractJAXBProvider.java
+++ b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/AbstractJAXBProvider.java
@@ -323,7 +323,7 @@
     }
     
     public JAXBContext getPackageContext(Class<?> type) {
-        if (type == null) {
+        if (type == null || type == JAXBElement.class) {
             return null;
         }
         synchronized (packageContexts) {
