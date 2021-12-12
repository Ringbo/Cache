diff --git a/test/javax/el/TestBeanNameELResolver.java b/test/javax/el/TestBeanNameELResolver.java
index d093b74..e73a12c 100644
--- a/test/javax/el/TestBeanNameELResolver.java
+++ b/test/javax/el/TestBeanNameELResolver.java
@@ -32,7 +32,7 @@
      * resolver with the same configuration.
      */
     private BeanNameELResolver createBeanNameELResolver() {
-        return createBeanNameELResolver(false);
+        return createBeanNameELResolver(true);
     }
 
     private BeanNameELResolver createBeanNameELResolver(boolean allowCreate) {
