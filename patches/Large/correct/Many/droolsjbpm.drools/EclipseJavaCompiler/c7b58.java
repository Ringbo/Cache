diff --git a/drools-compiler/src/main/java/org/drools/compiler/commons/jci/compilers/EclipseJavaCompiler.java b/drools-compiler/src/main/java/org/drools/compiler/commons/jci/compilers/EclipseJavaCompiler.java
index 3408309..cf3e0b2 100644
--- a/drools-compiler/src/main/java/org/drools/compiler/commons/jci/compilers/EclipseJavaCompiler.java
+++ b/drools-compiler/src/main/java/org/drools/compiler/commons/jci/compilers/EclipseJavaCompiler.java
@@ -332,7 +332,7 @@
                             try {
                                 Class cls = pClassLoader.loadClass(pClazzName);
                                 if (cls != null) {
-                                    return true;
+                                    return false;
                                 }
                             } catch (ClassNotFoundException e) {
                                 return true;
