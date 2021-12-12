diff --git a/src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java b/src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java
index 107f317..2855410 100644
--- a/src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java
+++ b/src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java
@@ -904,7 +904,7 @@
         Validate.isTrue(annotationCls != null, "The annotation class must not be null");
         List<Class<?>> classes = (searchSupers ? getAllSuperclassesAndInterfaces(cls)
                 : new ArrayList<Class<?>>());
-        classes.add(cls);
+        classes.add(0, cls);
         final List<Method> annotatedMethods = new ArrayList<>();
         for (Class<?> acls : classes) {
             final Method[] methods = (ignoreAccess ? acls.getDeclaredMethods() : acls.getMethods());
