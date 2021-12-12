diff --git a/modules/swagger-jaxrs2/src/main/java/io/swagger/jaxrs2/DefaultParameterExtension.java b/modules/swagger-jaxrs2/src/main/java/io/swagger/jaxrs2/DefaultParameterExtension.java
index d5eb567..73d8a86 100644
--- a/modules/swagger-jaxrs2/src/main/java/io/swagger/jaxrs2/DefaultParameterExtension.java
+++ b/modules/swagger-jaxrs2/src/main/java/io/swagger/jaxrs2/DefaultParameterExtension.java
@@ -114,7 +114,7 @@
 
                 // Gather the field's details
                 if (field != null) {
-                    paramType = field.getRawType();
+                	paramType = field.getType();
 
                     for (final Annotation fieldAnnotation : field.annotations()) {
                         if (!paramAnnotations.contains(fieldAnnotation)) {
@@ -127,7 +127,8 @@
                 if (setter != null) {
                     // Do not set the param class/type from the setter if the values are already identified
                     if (paramType == null) {
-                        paramType = setter.getRawParameterTypes() != null ? setter.getRawParameterTypes()[0] : null;
+                    	// paramType will stay null if there is no parameter
+                    	paramType = setter.getParameterType(0); 
                     }
 
                     for (final Annotation fieldAnnotation : setter.annotations()) {
@@ -141,7 +142,7 @@
                 if (getter != null) {
                     // Do not set the param class/type from the getter if the values are already identified
                     if (paramType == null) {
-                        paramType = getter.getRawReturnType();
+                        paramType = getter.getType();
                     }
 
                     for (final Annotation fieldAnnotation : getter.annotations()) {
