diff --git a/idea/src/org/jetbrains/jet/plugin/compiler/JetCompiler.java b/idea/src/org/jetbrains/jet/plugin/compiler/JetCompiler.java
index b6336e5..a037ec1 100644
--- a/idea/src/org/jetbrains/jet/plugin/compiler/JetCompiler.java
+++ b/idea/src/org/jetbrains/jet/plugin/compiler/JetCompiler.java
@@ -327,7 +327,7 @@
         try {
             String compilerClassName = "org.jetbrains.jet.cli.jvm.K2JVMCompiler";
             Class<?> kompiler = Class.forName(compilerClassName, true, loader);
-            Method exec = kompiler.getDeclaredMethod("exec", PrintStream.class, String[].class);
+            Method exec = kompiler.getMethod("exec", PrintStream.class, String[].class);
 
             String[] arguments = commandLineArguments(outputDir, scriptFile);
 
@@ -337,7 +337,7 @@
             Object rc = exec.invoke(kompiler.newInstance(), out, arguments);
             // exec() returns a K2JVMCompiler.ExitCode object, that class is not accessible here,
             // so we take it's contents through reflection
-            if ("org.jetbrains.jet.cli.jvm.K2JVMCompiler.ExitCode".equals(rc.getClass().getCanonicalName())) {
+            if ("org.jetbrains.jet.cli.common.ExitCode".equals(rc.getClass().getCanonicalName())) {
                 return (Integer) rc.getClass().getMethod("getCode").invoke(rc);
             }
             else {
