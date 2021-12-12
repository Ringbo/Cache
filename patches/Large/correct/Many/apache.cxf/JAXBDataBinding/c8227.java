diff --git a/rt/databinding/jaxb/src/main/java/org/apache/cxf/jaxb/JAXBDataBinding.java b/rt/databinding/jaxb/src/main/java/org/apache/cxf/jaxb/JAXBDataBinding.java
index 74d9642..f5439cd 100644
--- a/rt/databinding/jaxb/src/main/java/org/apache/cxf/jaxb/JAXBDataBinding.java
+++ b/rt/databinding/jaxb/src/main/java/org/apache/cxf/jaxb/JAXBDataBinding.java
@@ -307,7 +307,7 @@
 
             boolean schemasFromCache = false;
             Collection<DOMSource> schemas = getSchemas();
-            if (schemas == null) {
+            if (schemas == null || schemas.size() == 0) {
                 schemas = cachedContextAndSchemas.getSchemas();
                 if (schemas != null) {
                     schemasFromCache = true;
