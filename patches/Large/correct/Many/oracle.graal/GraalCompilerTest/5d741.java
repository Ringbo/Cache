diff --git a/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/GraalCompilerTest.java b/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/GraalCompilerTest.java
index e21000a..cad6074 100644
--- a/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/GraalCompilerTest.java
+++ b/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/GraalCompilerTest.java
@@ -499,7 +499,7 @@
 
     private CompilationResult compileBaseline(ResolvedJavaMethod javaMethod) {
         try (Scope bds = Debug.scope("compileBaseline")) {
-            BaslineCompiler baselineCompiler = new BaslineCompiler(GraphBuilderConfiguration.getDefault(), providers.getMetaAccess());
+            BaselineCompiler baselineCompiler = new BaselineCompiler(GraphBuilderConfiguration.getDefault(), providers.getMetaAccess());
             baselineCompiler.generate(javaMethod, -1);
             return null;
         } catch (Throwable e) {
