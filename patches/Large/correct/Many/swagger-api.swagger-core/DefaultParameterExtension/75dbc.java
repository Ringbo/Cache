diff --git a/modules/swagger-jaxrs/src/main/java/io/swagger/jaxrs/DefaultParameterExtension.java b/modules/swagger-jaxrs/src/main/java/io/swagger/jaxrs/DefaultParameterExtension.java
index 75f3043..d7c694a 100644
--- a/modules/swagger-jaxrs/src/main/java/io/swagger/jaxrs/DefaultParameterExtension.java
+++ b/modules/swagger-jaxrs/src/main/java/io/swagger/jaxrs/DefaultParameterExtension.java
@@ -140,7 +140,7 @@
 
                 // Gather the field's details
                 if (field != null) {
-                    paramType = field.getRawType();
+                    paramType = field.getType();
 
                     for (final Annotation fieldAnnotation : field.annotations()) {
                         if (!paramAnnotations.contains(fieldAnnotation)) {
@@ -153,7 +153,8 @@
                 if (setter != null) {
                     // Do not set the param class/type from the setter if the values are already identified
                     if (paramType == null) {
-                        paramType = setter.getRawParameterTypes() != null ? setter.getRawParameterTypes()[0] : null;
+                    	// paramType will stay null if there is no parameter
+                        paramType = setter.getParameterType(0); 
                     }
 
                     for (final Annotation fieldAnnotation : setter.annotations()) {
@@ -167,7 +168,7 @@
                 if (getter != null) {
                     // Do not set the param class/type from the getter if the values are already identified
                     if (paramType == null) {
-                        paramType = getter.getRawReturnType();
+                        paramType = getter.getType();
                     }
 
                     for (final Annotation fieldAnnotation : getter.annotations()) {
