diff --git a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plantranslate/NepheleJobGraphGenerator.java b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plantranslate/NepheleJobGraphGenerator.java
index 7db06db..6ecdb8e 100644
--- a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plantranslate/NepheleJobGraphGenerator.java
+++ b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plantranslate/NepheleJobGraphGenerator.java
@@ -229,7 +229,7 @@
 	@Override
 	public boolean preVisit(PlanNode node) {
 		// check if we have visited this node before. in non-tree graphs, this happens
-		if (this.vertices.containsKey(node) || this.chainedTasks.containsKey(node)) {
+		if (this.vertices.containsKey(node) || this.chainedTasks.containsKey(node) || this.iterations.containsKey(node)) {
 			// return false to prevent further descend
 			return false;
 		}
