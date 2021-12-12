diff --git a/lucene/src/java/org/apache/lucene/search/AutomatonQuery.java b/lucene/src/java/org/apache/lucene/search/AutomatonQuery.java
index d779634..0d2d5ee 100644
--- a/lucene/src/java/org/apache/lucene/search/AutomatonQuery.java
+++ b/lucene/src/java/org/apache/lucene/search/AutomatonQuery.java
@@ -75,7 +75,8 @@
     MinimizationOperations.minimize(automaton);
   }
 
-  private void compileAutomaton() {
+  private synchronized void compileAutomaton() {
+    // this method must be synchronized, as setting the three transient fields is not atomic:
     if (runAutomaton == null) {
       runAutomaton = new ByteRunAutomaton(automaton);
       isFinite = SpecialOperations.isFinite(automaton);
