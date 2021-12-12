diff --git a/src/commons/org/codehaus/groovy/grails/commons/GrailsClassUtils.java b/src/commons/org/codehaus/groovy/grails/commons/GrailsClassUtils.java
index e481a66..4f46dac 100644
--- a/src/commons/org/codehaus/groovy/grails/commons/GrailsClassUtils.java
+++ b/src/commons/org/codehaus/groovy/grails/commons/GrailsClassUtils.java
@@ -198,7 +198,7 @@
             PropertyDescriptor[] descriptors = wrapper.getPropertyDescriptors();
 
             for (int i = 0; i < descriptors.length; i++) {
-                if(descriptors[i].getPropertyType().equals( propertyType )  ) {
+                if(descriptors[i].getPropertyType().isAssignableFrom(propertyType)) {
                     properties.add(descriptors[i]);
                 }
             }
