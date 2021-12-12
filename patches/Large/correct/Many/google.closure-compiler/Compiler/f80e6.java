diff --git a/src/com/google/javascript/jscomp/Compiler.java b/src/com/google/javascript/jscomp/Compiler.java
index 84b8193..e70cd2c 100644
--- a/src/com/google/javascript/jscomp/Compiler.java
+++ b/src/com/google/javascript/jscomp/Compiler.java
@@ -3349,7 +3349,7 @@
   }
 
   @GwtIncompatible("ObjectInputStream")
-  public void restoreState(InputStream inputStream) throws Exception {
+  public void restoreState(InputStream inputStream) throws IOException  {
     try (final ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
       CompilerState compilerState = runInCompilerThread(new Callable<CompilerState>() {
         @Override
