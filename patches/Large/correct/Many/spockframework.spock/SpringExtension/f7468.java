diff --git a/spock-spring/src/main/java/org/spockframework/spring/SpringExtension.java b/spock-spring/src/main/java/org/spockframework/spring/SpringExtension.java
index baa5736..8b92971 100644
--- a/spock-spring/src/main/java/org/spockframework/spring/SpringExtension.java
+++ b/spock-spring/src/main/java/org/spockframework/spring/SpringExtension.java
@@ -80,10 +80,10 @@
   private boolean isSpringSpec(SpecInfo spec) {
     if (isSpringSpecUsingFindAnnotationDescriptorForTypes(spec)) return true;
 
-    if (ReflectionUtil.isAnnotationPresentRecursive(spec.getClass(), ContextConfiguration.class)) return true;
+    if (ReflectionUtil.isAnnotationPresentRecursive(spec.getReflection(), ContextConfiguration.class)) return true;
 
     return  (contextHierarchyClass != null
-      && ReflectionUtil.isAnnotationPresentRecursive(spec.getClass(), contextHierarchyClass));
+      && ReflectionUtil.isAnnotationPresentRecursive(spec.getReflection(), contextHierarchyClass));
   }
 
   private boolean isSpringSpecUsingFindAnnotationDescriptorForTypes(SpecInfo spec) {
