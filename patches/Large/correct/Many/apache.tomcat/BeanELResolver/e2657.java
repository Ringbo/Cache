diff --git a/java/javax/el/BeanELResolver.java b/java/javax/el/BeanELResolver.java
index c525bb5..7ba9ce0 100644
--- a/java/javax/el/BeanELResolver.java
+++ b/java/javax/el/BeanELResolver.java
@@ -312,7 +312,7 @@
     }
 
     private static final Method getMethod(Class<?> type, Method m) {
-        if (m == null || Modifier.isPublic(m.getModifiers())) {
+        if (m == null || Modifier.isPublic(type.getModifiers())) {
             return m;
         }
         Class<?>[] inf = type.getInterfaces();
