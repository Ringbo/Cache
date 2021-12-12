diff --git a/src/main/java/org/elasticsearch/shield/support/AutomatonPredicate.java b/src/main/java/org/elasticsearch/shield/support/AutomatonPredicate.java
index 601626e..dba05b4 100644
--- a/src/main/java/org/elasticsearch/shield/support/AutomatonPredicate.java
+++ b/src/main/java/org/elasticsearch/shield/support/AutomatonPredicate.java
@@ -17,7 +17,7 @@
     private final RunAutomaton automaton;
 
     public AutomatonPredicate(Automaton automaton) {
-        this(new RunAutomaton(automaton));
+        this(new RunAutomaton(automaton, false));
     }
 
     public AutomatonPredicate(RunAutomaton automaton) {
