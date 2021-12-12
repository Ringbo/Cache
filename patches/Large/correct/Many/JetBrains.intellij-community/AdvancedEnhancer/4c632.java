diff --git a/source/net/sf/cglib/proxy/AdvancedEnhancer.java b/source/net/sf/cglib/proxy/AdvancedEnhancer.java
index e47f24c..1b6ce8a 100644
--- a/source/net/sf/cglib/proxy/AdvancedEnhancer.java
+++ b/source/net/sf/cglib/proxy/AdvancedEnhancer.java
@@ -395,7 +395,7 @@
   }
 
   protected ClassLoader getDefaultClassLoader() {
-    if (interfaces != null) return interfaces[0].getClassLoader();
+    if (interfaces != null && interfaces.length > 0) return interfaces[0].getClassLoader();
     if (superclass != null) return superclass.getClassLoader();
     return null;
   }
