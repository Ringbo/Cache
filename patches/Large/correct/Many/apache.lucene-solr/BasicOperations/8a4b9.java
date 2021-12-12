diff --git a/lucene/src/java/org/apache/lucene/util/automaton/BasicOperations.java b/lucene/src/java/org/apache/lucene/util/automaton/BasicOperations.java
index 337ec17..551f70b 100644
--- a/lucene/src/java/org/apache/lucene/util/automaton/BasicOperations.java
+++ b/lucene/src/java/org/apache/lucene/util/automaton/BasicOperations.java
@@ -914,7 +914,7 @@
       // Breadth-first search, from accept states,
       // backwards:
       while(!q.isEmpty()) {
-        final State s = q.pop();
+        final State s = q.removeFirst();
         List<ArrivingTransition> arriving = allArriving.get(s);
         if (arriving != null) {
           for(ArrivingTransition at : arriving) {
