diff --git a/src/main/javassist/CtConstructor.java b/src/main/javassist/CtConstructor.java
index 72dcee1..cac15b3 100644
--- a/src/main/javassist/CtConstructor.java
+++ b/src/main/javassist/CtConstructor.java
@@ -180,7 +180,7 @@
         if (methodInfo.isStaticInitializer())
             return MethodInfo.nameClinit;
         else
-            return declaringClass.getName();
+            return declaringClass.getSimpleName();
     }
 
     /**
