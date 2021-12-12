diff --git a/jaxrs/src/main/java/org/jboss/as/jaxrs/deployment/JaxrsSpringProcessor.java b/jaxrs/src/main/java/org/jboss/as/jaxrs/deployment/JaxrsSpringProcessor.java
index 401c5ea..a440e07 100644
--- a/jaxrs/src/main/java/org/jboss/as/jaxrs/deployment/JaxrsSpringProcessor.java
+++ b/jaxrs/src/main/java/org/jboss/as/jaxrs/deployment/JaxrsSpringProcessor.java
@@ -141,7 +141,7 @@
                 boolean skip = false;
                 for (ParamValueMetaData prop : md.getContextParams()) {
                     if (prop.getParamName().equals(ENABLE_PROPERTY)) {
-                        boolean explicitEnable = Boolean.parseBoolean(prop.getParamName());
+                        boolean explicitEnable = Boolean.parseBoolean(prop.getParamValue());
                         if(explicitEnable) {
                             found = true;
                         } else {
