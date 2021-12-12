diff --git a/jps-plugin/src/org/jetbrains/kotlin/compilerRunner/CompilerRunnerUtil.java b/jps-plugin/src/org/jetbrains/kotlin/compilerRunner/CompilerRunnerUtil.java
index 6f93cb0..cc97d03 100644
--- a/jps-plugin/src/org/jetbrains/kotlin/compilerRunner/CompilerRunnerUtil.java
+++ b/jps-plugin/src/org/jetbrains/kotlin/compilerRunner/CompilerRunnerUtil.java
@@ -70,7 +70,7 @@
     }
 
     @Nullable
-    public static Object invokeExecMethod(
+    public synchronized static Object invokeExecMethod(
             @NotNull String compilerClassName,
             @NotNull String[] arguments,
             @NotNull CompilerEnvironment environment,
