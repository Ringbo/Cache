diff --git a/jps-plugin/src/org/jetbrains/kotlin/compilerRunner/KotlinCompilerRunner.java b/jps-plugin/src/org/jetbrains/kotlin/compilerRunner/KotlinCompilerRunner.java
index 4ce0905..4921e35 100644
--- a/jps-plugin/src/org/jetbrains/kotlin/compilerRunner/KotlinCompilerRunner.java
+++ b/jps-plugin/src/org/jetbrains/kotlin/compilerRunner/KotlinCompilerRunner.java
@@ -132,10 +132,12 @@
             // trying the daemon first
             if (incrementalCaches != null && KotlinCompilerClient.Companion.isDaemonEnabled()) {
                 File libPath = CompilerRunnerUtil.getLibPath(environment.getKotlinPaths(), messageCollector);
+                // TODO: it may be a good idea to cache the compilerId, since making it means calculating digest over jar(s) and if \\
+                //    the lifetime of JPS process is small anyway, we can neglect the probability of changed compiler
                 CompilerId compilerId = CompilerId.makeCompilerId(new File(libPath, "kotlin-compiler.jar"));
                 DaemonOptions daemonOptions = new DaemonOptions();
                 // TODO: find proper stream to report daemon connection progress
-                CompileService daemon = KotlinCompilerClient.Companion.connectToCompileService(compilerId, daemonOptions, System.out);
+                CompileService daemon = KotlinCompilerClient.Companion.connectToCompileService(compilerId, daemonOptions, System.out, true, true);
                 if (daemon != null) {
                     Integer res = KotlinCompilerClient.Companion.incrementalCompile(daemon, argsArray, incrementalCaches, out);
                     return res.toString();
