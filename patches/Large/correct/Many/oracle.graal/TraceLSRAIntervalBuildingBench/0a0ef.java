diff --git a/graal/com.oracle.graal.microbenchmarks/src/com/oracle/graal/microbenchmarks/lir/trace/TraceLSRAIntervalBuildingBench.java b/graal/com.oracle.graal.microbenchmarks/src/com/oracle/graal/microbenchmarks/lir/trace/TraceLSRAIntervalBuildingBench.java
index 5ec8a4e..d27edfd 100644
--- a/graal/com.oracle.graal.microbenchmarks/src/com/oracle/graal/microbenchmarks/lir/trace/TraceLSRAIntervalBuildingBench.java
+++ b/graal/com.oracle.graal.microbenchmarks/src/com/oracle/graal/microbenchmarks/lir/trace/TraceLSRAIntervalBuildingBench.java
@@ -67,7 +67,7 @@
             TraceBuilderResult<B> resultTraces = getTraces(context);
 
             for (Trace<B> trace : resultTraces.getTraces()) {
-                intervalData = new IntervalData(target, lirGenRes, registerAllocationConfig, trace);
+                intervalData = new IntervalData(target, lirGenRes, registerAllocationConfig);
                 Analyser a = new TraceLinearScanLifetimeAnalysisPhase.Analyser(intervalData, resultTraces, trace.getBlocks(), lirGenRes.getLIR(), true, spillMoveFactory,
                                 registerAllocationConfig.getRegisterConfig().getCallerSaveRegisters());
                 a.analyze();
