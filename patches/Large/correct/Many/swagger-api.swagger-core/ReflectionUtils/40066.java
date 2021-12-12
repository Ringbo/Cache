diff --git a/modules/swagger-jaxrs/src/main/java/io/swagger/jaxrs/utils/ReflectionUtils.java b/modules/swagger-jaxrs/src/main/java/io/swagger/jaxrs/utils/ReflectionUtils.java
index 4701727..ce0424a 100644
--- a/modules/swagger-jaxrs/src/main/java/io/swagger/jaxrs/utils/ReflectionUtils.java
+++ b/modules/swagger-jaxrs/src/main/java/io/swagger/jaxrs/utils/ReflectionUtils.java
@@ -83,7 +83,11 @@
         Type[] gpTypes = methodToFind.getGenericParameterTypes();
         methodLoop:
         for (Method method : cls.getMethods()) {
-            if (!method.getName().equals(methodToSearch) || !method.getReturnType().isAssignableFrom(methodToFind.getReturnType())) {
+            if (
+            	!method.getName().equals(methodToSearch) || 
+            	!method.getReturnType().isAssignableFrom(methodToFind.getReturnType()) ||
+            	method.getParameterTypes().length != pTypes.length
+            	) {
                 continue;
             }
             Class<?>[] pt = method.getParameterTypes();
