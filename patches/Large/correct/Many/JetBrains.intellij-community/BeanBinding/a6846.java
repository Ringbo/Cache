diff --git a/platform/util/src/com/intellij/util/xmlb/BeanBinding.java b/platform/util/src/com/intellij/util/xmlb/BeanBinding.java
index 78c073a..8bafa44 100644
--- a/platform/util/src/com/intellij/util/xmlb/BeanBinding.java
+++ b/platform/util/src/com/intellij/util/xmlb/BeanBinding.java
@@ -368,7 +368,7 @@
 
     if (setter == null) {
       // check hasStoreAnnotations to ensure that this addition will not lead to regression (since there is a chance that there is some existing not-annotated list getters without setter)
-      return (List.class.isAssignableFrom(getter.getReturnType()) || Map.class.isAssignableFrom(getter.getReturnType())) && hasStoreAnnotations(getter);
+      return (Collection.class.isAssignableFrom(getter.getReturnType()) || Map.class.isAssignableFrom(getter.getReturnType())) && hasStoreAnnotations(getter);
     }
 
     if (setter.getAnnotation(Transient.class) != null || !getter.getReturnType().equals(setter.getParameterTypes()[0])) {
