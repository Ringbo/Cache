diff --git a/compiler/cli/src/org/jetbrains/jet/compiler/CompileEnvironment.java b/compiler/cli/src/org/jetbrains/jet/compiler/CompileEnvironment.java
index 600c61e..8d44302 100644
--- a/compiler/cli/src/org/jetbrains/jet/compiler/CompileEnvironment.java
+++ b/compiler/cli/src/org/jetbrains/jet/compiler/CompileEnvironment.java
@@ -154,7 +154,7 @@
     }
 
     private List<Module> runDefineModules(String moduleFile, ClassFileFactory factory) {
-        ClassLoader loader = myStdlib != null ? new GeneratedClassLoader(factory, new URLClassLoader(new URL[] {myStdlib})) : new GeneratedClassLoader(factory);
+        ClassLoader loader = myStdlib != null ? new GeneratedClassLoader(factory, new URLClassLoader(new URL[] {myStdlib}, AllModules.class.getClassLoader())) : new GeneratedClassLoader(factory);
         try {
             Class namespaceClass = loader.loadClass(JvmAbi.PACKAGE_CLASS);
             final Method method = namespaceClass.getDeclaredMethod("project");
