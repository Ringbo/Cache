diff --git a/src/com/google/javascript/jscomp/Compiler.java b/src/com/google/javascript/jscomp/Compiler.java
index d16c12e..3f38020 100644
--- a/src/com/google/javascript/jscomp/Compiler.java
+++ b/src/com/google/javascript/jscomp/Compiler.java
@@ -757,7 +757,7 @@
   }
 
   private void externExports() {
-    logger.info("Creating extern file for exports");
+    logger.fine("Creating extern file for exports");
     startPass("externExports");
 
     ExternExportsPass pass = new ExternExportsPass(this);
@@ -795,7 +795,7 @@
    * Removes try/catch/finally statements for easier debugging.
    */
   void removeTryCatchFinally() {
-    logger.info("Remove try/catch/finally");
+    logger.fine("Remove try/catch/finally");
     startPass("removeTryCatchFinally");
     RemoveTryCatch r = new RemoveTryCatch(this);
     process(r);
@@ -808,7 +808,7 @@
    */
   void stripCode(Set<String> stripTypes, Set<String> stripNameSuffixes,
       Set<String> stripTypePrefixes, Set<String> stripNamePrefixes) {
-    logger.info("Strip code");
+    logger.fine("Strip code");
     startPass("stripCode");
     StripCode r = new StripCode(this, stripTypes, stripNameSuffixes,
         stripTypePrefixes, stripNamePrefixes);
@@ -1784,7 +1784,7 @@
 
   /** Control Flow Analysis. */
   ControlFlowGraph<Node> computeCFG() {
-    logger.info("Computing Control Flow Graph");
+    logger.fine("Computing Control Flow Graph");
     Tracer tracer = newTracer("computeCFG");
     ControlFlowAnalysis cfa = new ControlFlowAnalysis(this, true, false);
     process(cfa);
@@ -1793,7 +1793,7 @@
   }
 
   public void normalize() {
-    logger.info("Normalizing");
+    logger.fine("Normalizing");
     startPass("normalize");
     process(new Normalize(this, false));
     endPass();
@@ -1806,7 +1806,7 @@
   }
 
   void recordFunctionInformation() {
-    logger.info("Recording function information");
+    logger.fine("Recording function information");
     startPass("recordFunctionInformation");
     RecordFunctionInformation recordFunctionInfoPass =
         new RecordFunctionInformation(
