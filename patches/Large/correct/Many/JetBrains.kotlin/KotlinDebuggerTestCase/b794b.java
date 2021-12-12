diff --git a/idea/tests/org/jetbrains/jet/plugin/debugger/KotlinDebuggerTestCase.java b/idea/tests/org/jetbrains/jet/plugin/debugger/KotlinDebuggerTestCase.java
index 0887d58..83e7063 100644
--- a/idea/tests/org/jetbrains/jet/plugin/debugger/KotlinDebuggerTestCase.java
+++ b/idea/tests/org/jetbrains/jet/plugin/debugger/KotlinDebuggerTestCase.java
@@ -131,7 +131,7 @@
 
             MockLibraryUtil.compileKotlin(sourcesDir, new File(outputDir), CUSTOM_LIBRARY_JAR.getPath());
 
-            List<String> options = Arrays.asList("-d", outputDir);
+            List<String> options = Arrays.asList("-d", outputDir, "-classpath", ForTestCompileRuntime.runtimeJarForTests().getPath());
             JetTestUtils.compileJavaFiles(findJavaFiles(new File(sourcesDir)), options);
 
             IS_TINY_APP_COMPILED = true;
