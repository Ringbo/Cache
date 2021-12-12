diff --git a/java/java-tests/testSrc/com/intellij/codeInspection/bytecodeAnalysis/BytecodeAnalysisTest.java b/java/java-tests/testSrc/com/intellij/codeInspection/bytecodeAnalysis/BytecodeAnalysisTest.java
index 5968446..09fa87f 100644
--- a/java/java-tests/testSrc/com/intellij/codeInspection/bytecodeAnalysis/BytecodeAnalysisTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInspection/bytecodeAnalysis/BytecodeAnalysisTest.java
@@ -78,7 +78,7 @@
     checkLeakingParameters(LeakingParametersData.class);
   }
 
-  private void checkLeakingParameters(Class<?> jClass) throws IOException {
+  private static void checkLeakingParameters(Class<?> jClass) throws IOException {
     final HashMap<Method, boolean[]> map = new HashMap<Method, boolean[]>();
 
     // collecting leakedParameters
