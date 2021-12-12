diff --git a/core/src/main/java/org/acegisecurity/util/MethodInvocationUtils.java b/core/src/main/java/org/acegisecurity/util/MethodInvocationUtils.java
index b4e4883..f43d76e 100644
--- a/core/src/main/java/org/acegisecurity/util/MethodInvocationUtils.java
+++ b/core/src/main/java/org/acegisecurity/util/MethodInvocationUtils.java
@@ -72,7 +72,7 @@
             classArgs = (Class[]) list.toArray(new Class[] {});
         }
 
-        return createFromClass(object.getClass(), methodName, classArgs);
+        return createFromClass(object.getClass(), methodName, classArgs, args);
     }
 
     /**
@@ -84,7 +84,7 @@
      * @return a <code>MethodInvocation</code>, or <code>null</code> if there was a problem
      */
     public static MethodInvocation createFromClass(Class clazz, String methodName) {
-        return createFromClass(clazz, methodName, null);
+        return createFromClass(clazz, methodName, null, null);
     }
 
     /**
@@ -93,18 +93,18 @@
      *
      * @param clazz the class of object that will be used to find the relevant <code>Method</code>
      * @param methodName the name of the method to find
-     * @param args arguments that are required as part of the method signature
-     *
+     * @param classArgs arguments that are required to locate the relevant method signature
+     * @param args the actual arguments that should be passed to SimpleMethodInvocation
      * @return a <code>MethodInvocation</code>, or <code>null</code> if there was a problem
      */
-    public static MethodInvocation createFromClass(Class clazz, String methodName, Class[] args) {
+    public static MethodInvocation createFromClass(Class clazz, String methodName, Class[] classArgs, Object[] args) {
         Assert.notNull(clazz, "Class required");
         Assert.hasText(methodName, "MethodName required");
 
         Method method;
 
         try {
-            method = clazz.getMethod(methodName, args);
+            method = clazz.getMethod(methodName, classArgs);
         } catch (Exception e) {
             return null;
         }
