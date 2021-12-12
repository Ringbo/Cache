diff --git a/rt/databinding/aegis/src/main/java/org/apache/cxf/aegis/type/java5/AnnotationReader.java b/rt/databinding/aegis/src/main/java/org/apache/cxf/aegis/type/java5/AnnotationReader.java
index 1d68a56..01b3e14 100644
--- a/rt/databinding/aegis/src/main/java/org/apache/cxf/aegis/type/java5/AnnotationReader.java
+++ b/rt/databinding/aegis/src/main/java/org/apache/cxf/aegis/type/java5/AnnotationReader.java
@@ -295,7 +295,7 @@
         return null;
     }
 
-    private static Object getAnnotationValue(String name,
+    Object getAnnotationValue(String name,
             Method method,
             int index,
             Object ignoredValue,
