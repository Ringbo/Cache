diff --git a/quasar-core/src/main/java/co/paralleluniverse/common/reflection/ASMUtil.java b/quasar-core/src/main/java/co/paralleluniverse/common/reflection/ASMUtil.java
index c6b5408..1e73cdb 100644
--- a/quasar-core/src/main/java/co/paralleluniverse/common/reflection/ASMUtil.java
+++ b/quasar-core/src/main/java/co/paralleluniverse/common/reflection/ASMUtil.java
@@ -125,11 +125,11 @@
     }
 
     public static boolean isAssignableFrom(Class<?> supertype, String className, ClassLoader cl) {
-        return isAssignableFrom0(classToSlashed(supertype), className, cl);
+        return isAssignableFrom0(classToSlashed(supertype), classToSlashed(className), cl);
     }
 
     public static boolean isAssignableFrom(String supertypeName, String className, ClassLoader cl) {
-        return isAssignableFrom0(classToSlashed(supertypeName), className, cl);
+        return isAssignableFrom0(classToSlashed(supertypeName), classToSlashed(className), cl);
     }
     
     private static boolean isAssignableFrom0(String supertypeName, String className, ClassLoader cl) {        
@@ -142,14 +142,14 @@
 
             if (supertypeName.equals(cn.superName))
                 return true;
-            if (isAssignableFrom(supertypeName, cn.superName, cl))
+            if (isAssignableFrom0(supertypeName, cn.superName, cl))
                 return true;
 
             if (cn.interfaces != null) {
                 for (String iface : (List<String>) cn.interfaces) {
                     if (supertypeName.equals(iface))
                         return true;
-                    if (isAssignableFrom(supertypeName, iface, cl))
+                    if (isAssignableFrom0(supertypeName, iface, cl))
                         return true;
                 }
             }
