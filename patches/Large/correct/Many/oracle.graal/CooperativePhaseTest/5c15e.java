diff --git a/graal/org.graalvm.compiler.core.test/src/org/graalvm/compiler/core/test/CooperativePhaseTest.java b/graal/org.graalvm.compiler.core.test/src/org/graalvm/compiler/core/test/CooperativePhaseTest.java
index bfbae12..1286069 100644
--- a/graal/org.graalvm.compiler.core.test/src/org/graalvm/compiler/core/test/CooperativePhaseTest.java
+++ b/graal/org.graalvm.compiler.core.test/src/org/graalvm/compiler/core/test/CooperativePhaseTest.java
@@ -68,7 +68,7 @@
 
     }
 
-    private static class ParlyCooperativePhase extends Phase {
+    private static class PartiallyCooperativePhase extends Phase {
 
         @Override
         protected void run(StructuredGraph graph) {
@@ -107,7 +107,7 @@
         initializeForTimeout();
         OptionValues initialOptions = getInitialOptions();
         OptionValues options = new OptionValues(initialOptions, CompilationExpirationPeriod, 1/* sec */);
-        try (CompilationAlarm c1 = CompilationAlarm.trackCompilationPeriod(initialOptions)) {
+        try (CompilationAlarm c1 = CompilationAlarm.trackCompilationPeriod(options)) {
             StructuredGraph g = parseEager("snippet", AllowAssumptions.NO, options);
             new CooperativePhase().apply(g);
         }
@@ -119,7 +119,7 @@
         initializeForTimeout();
         OptionValues initialOptions = getInitialOptions();
         OptionValues options = new OptionValues(initialOptions, CompilationExpirationPeriod, 1/* sec */);
-        try (CompilationAlarm c1 = CompilationAlarm.trackCompilationPeriod(initialOptions)) {
+        try (CompilationAlarm c1 = CompilationAlarm.trackCompilationPeriod(options)) {
             StructuredGraph g = parseEager("snippet", AllowAssumptions.NO, options);
             new UnCooperativePhase().apply(g);
         }
@@ -132,9 +132,9 @@
         // 0 disables alarm utility
         OptionValues initialOptions = getInitialOptions();
         OptionValues options = new OptionValues(initialOptions, CompilationExpirationPeriod, 0);
-        try (CompilationAlarm c1 = CompilationAlarm.trackCompilationPeriod(initialOptions)) {
+        try (CompilationAlarm c1 = CompilationAlarm.trackCompilationPeriod(options)) {
             StructuredGraph g = parseEager("snippet", AllowAssumptions.NO, options);
-            new ParlyCooperativePhase().apply(g);
+            new PartiallyCooperativePhase().apply(g);
         }
     }
 
