diff --git a/subprojects/base-services/src/main/java/org/gradle/util/JavaMethod.java b/subprojects/base-services/src/main/java/org/gradle/util/JavaMethod.java
index b36da10..73420db 100644
--- a/subprojects/base-services/src/main/java/org/gradle/util/JavaMethod.java
+++ b/subprojects/base-services/src/main/java/org/gradle/util/JavaMethod.java
@@ -28,7 +28,7 @@
 
     public JavaMethod(Class<T> target, Class<R> returnType, String name, Class<?>... paramTypes) {
         this.returnType = returnType;
-        method = findMethod(target, name, paramTypes);
+        method = findMethod(target, target, name, paramTypes);
         method.setAccessible(true);
     }
 
@@ -38,7 +38,7 @@
         method.setAccessible(true);
     }
 
-    private Method findMethod(Class target, String name, Class<?>[] paramTypes) {
+    private Method findMethod(Class origTarget, Class target, String name, Class<?>[] paramTypes) {
         for (Method method : target.getDeclaredMethods()) {
             if (Modifier.isStatic(method.getModifiers())) {
                 continue;
@@ -51,9 +51,9 @@
         Class<?> parent = target.getSuperclass();
         if (parent == null) {
             throw new GradleException(String.format("Could not find method %s(%s) on %s", name, Arrays.toString(paramTypes),
-                    target));
+                    origTarget));
         } else {
-            return findMethod(parent, name, paramTypes);
+            return findMethod(origTarget, parent, name, paramTypes);
         }
     }
 
