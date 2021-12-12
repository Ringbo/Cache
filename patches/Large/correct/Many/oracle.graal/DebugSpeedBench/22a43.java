diff --git a/compiler/src/org.graalvm.compiler.truffle.bench/src/org/graalvm/compiler/truffle/bench/debugger/DebugSpeedBench.java b/compiler/src/org.graalvm.compiler.truffle.bench/src/org/graalvm/compiler/truffle/bench/debugger/DebugSpeedBench.java
index 96c4577..e6ffb5c 100644
--- a/compiler/src/org.graalvm.compiler.truffle.bench/src/org/graalvm/compiler/truffle/bench/debugger/DebugSpeedBench.java
+++ b/compiler/src/org.graalvm.compiler.truffle.bench/src/org/graalvm/compiler/truffle/bench/debugger/DebugSpeedBench.java
@@ -73,7 +73,7 @@
     private volatile ACTION action;
 
     @Setup
-    public void beforeTesting() throws IOException, InterruptedException {
+    public void beforeTesting() throws IOException {
         source = Source.newBuilder("instrumentation-test-language", CODE_STEP, "StepTest.instr").build();
         context = Context.create();
         Debugger debugger = context.getEngine().getInstruments().get("debugger").lookup(Debugger.class);
@@ -105,19 +105,19 @@
     }
 
     @Benchmark
-    public void doStepInto() throws InterruptedException {
+    public void doStepInto() {
         action = ACTION.STEP_INTO;
         context.eval(source);
     }
 
     @Benchmark
-    public void doStepOver() throws InterruptedException {
+    public void doStepOver() {
         action = ACTION.STEP_OVER;
         context.eval(source);
     }
 
     @Benchmark
-    public void doStepOut() throws InterruptedException {
+    public void doStepOut() {
         action = ACTION.STEP_IN_OUT;
         context.eval(source);
     }
