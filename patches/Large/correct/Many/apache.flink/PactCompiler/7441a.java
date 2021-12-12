diff --git a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/PactCompiler.java b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/PactCompiler.java
index 2b33fb1..3af9a9e 100644
--- a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/PactCompiler.java
+++ b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/PactCompiler.java
@@ -710,7 +710,7 @@
 	 */
 	public static OptimizedPlan createPreOptimizedPlan(Plan pactPlan)
 	{
-		GraphCreatingVisitor graphCreator = new GraphCreatingVisitor(null, -1, -1, false);
+		GraphCreatingVisitor graphCreator = new GraphCreatingVisitor(null, -1, 1, false);
 		pactPlan.accept(graphCreator);
 		OptimizedPlan optPlan = new OptimizedPlan(graphCreator.sources, graphCreator.sinks, graphCreator.con2node.values(),
 				pactPlan.getJobName());
