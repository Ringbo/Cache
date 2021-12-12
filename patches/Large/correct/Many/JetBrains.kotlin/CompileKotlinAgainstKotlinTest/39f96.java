diff --git a/compiler/tests/org/jetbrains/jet/jvm/compiler/CompileKotlinAgainstKotlinTest.java b/compiler/tests/org/jetbrains/jet/jvm/compiler/CompileKotlinAgainstKotlinTest.java
index ecd3103..56b6a8a 100644
--- a/compiler/tests/org/jetbrains/jet/jvm/compiler/CompileKotlinAgainstKotlinTest.java
+++ b/compiler/tests/org/jetbrains/jet/jvm/compiler/CompileKotlinAgainstKotlinTest.java
@@ -76,7 +76,10 @@
         compileA();
         compileB();
 
-        URLClassLoader classLoader = new URLClassLoader(new URL[]{ aDir.toURI().toURL(), bDir.toURI().toURL() });
+        URLClassLoader classLoader = new URLClassLoader(
+                new URL[]{ aDir.toURI().toURL(), bDir.toURI().toURL() },
+                CompileKotlinAgainstKotlinTest.class.getClassLoader()
+        );
         Class<?> clazz = classLoader.loadClass("bbb.namespace");
         Method main = clazz.getMethod("main", new Class[] { String[].class });
         main.invoke(null, new Object[] { new String[0] });
