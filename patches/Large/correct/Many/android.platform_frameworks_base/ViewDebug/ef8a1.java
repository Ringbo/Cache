diff --git a/core/java/android/view/ViewDebug.java b/core/java/android/view/ViewDebug.java
index 531a99d..50e64c6 100644
--- a/core/java/android/view/ViewDebug.java
+++ b/core/java/android/view/ViewDebug.java
@@ -1006,7 +1006,7 @@
         }
 
         final ArrayList<Field> declaredFields = new ArrayList();
-        klass.getDeclaredFields(false, declaredFields);
+        klass.getDeclaredFieldsUnchecked(false, declaredFields);
 
         final ArrayList<Field> foundFields = new ArrayList<Field>();
         final int count = declaredFields.size();
@@ -1049,7 +1049,7 @@
         }
 
         final ArrayList<Method> declaredMethods = new ArrayList();
-        klass.getDeclaredMethods(false, declaredMethods);
+        klass.getDeclaredMethodsUnchecked(false, declaredMethods);
 
         final ArrayList<Method> foundMethods = new ArrayList<Method>();
         final int count = declaredMethods.size();
