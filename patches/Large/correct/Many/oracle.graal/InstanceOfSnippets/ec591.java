diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/InstanceOfSnippets.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/InstanceOfSnippets.java
index a890d0b..8ddecb4 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/InstanceOfSnippets.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/InstanceOfSnippets.java
@@ -230,7 +230,7 @@
                 Arguments args;
 
                 StructuredGraph graph = instanceOf.graph();
-                if (hintInfo.hintHitProbability >= hintHitProbabilityThresholdForDeoptimizingSnippet()) {
+                if (hintInfo.hintHitProbability >= hintHitProbabilityThresholdForDeoptimizingSnippet() && hintInfo.exact == null) {
                     Hints hints = createHints(hintInfo, providers.getMetaAccess(), false, graph);
                     args = new Arguments(instanceofWithProfile, graph.getGuardsStage(), tool.getLoweringStage());
                     args.add("object", object);
@@ -256,7 +256,7 @@
                 }
                 args.add("trueValue", replacer.trueValue);
                 args.add("falseValue", replacer.falseValue);
-                if (hintInfo.hintHitProbability >= hintHitProbabilityThresholdForDeoptimizingSnippet()) {
+                if (hintInfo.hintHitProbability >= hintHitProbabilityThresholdForDeoptimizingSnippet() && hintInfo.exact == null) {
                     args.addConst("nullSeen", hintInfo.profile.getNullSeen() != TriState.FALSE);
                 }
                 return args;
