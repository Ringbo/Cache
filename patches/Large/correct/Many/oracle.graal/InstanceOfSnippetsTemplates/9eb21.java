diff --git a/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/InstanceOfSnippetsTemplates.java b/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/InstanceOfSnippetsTemplates.java
index 697117e..a568212 100644
--- a/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/InstanceOfSnippetsTemplates.java
+++ b/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/InstanceOfSnippetsTemplates.java
@@ -93,7 +93,7 @@
      */
     protected InstanceOfUsageReplacer createReplacer(FloatingNode instanceOf, Instantiation instantiation, Node usage, final StructuredGraph graph) {
         InstanceOfUsageReplacer replacer;
-        if (usage instanceof IfNode || usage instanceof FixedGuardNode || usage instanceof ShortCircuitOrNode || usage instanceof GuardingPiNode) {
+        if (usage instanceof IfNode || usage instanceof FixedGuardNode || usage instanceof ShortCircuitOrNode || usage instanceof GuardingPiNode || usage instanceof ConditionAnchorNode) {
             replacer = new NonMaterializationUsageReplacer(instantiation, ConstantNode.forInt(1, graph), ConstantNode.forInt(0, graph), instanceOf, usage);
         } else {
             assert usage instanceof ConditionalNode : "unexpected usage of " + instanceOf + ": " + usage;
