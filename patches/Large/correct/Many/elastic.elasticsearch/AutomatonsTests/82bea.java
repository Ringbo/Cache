diff --git a/src/test/java/org/elasticsearch/shield/support/AutomatonsTests.java b/src/test/java/org/elasticsearch/shield/support/AutomatonsTests.java
index 9d18d82..a77f8f4 100644
--- a/src/test/java/org/elasticsearch/shield/support/AutomatonsTests.java
+++ b/src/test/java/org/elasticsearch/shield/support/AutomatonsTests.java
@@ -60,12 +60,12 @@
     }
 
     private void assertMatch(Automaton automaton, String text) {
-        RunAutomaton runAutomaton = new RunAutomaton(automaton);
+        RunAutomaton runAutomaton = new RunAutomaton(automaton, false);
         assertThat(runAutomaton.run(text), is(true));
     }
 
     private void assertMismatch(Automaton automaton, String text) {
-        RunAutomaton runAutomaton = new RunAutomaton(automaton);
+        RunAutomaton runAutomaton = new RunAutomaton(automaton, false);
         assertThat(runAutomaton.run(text), is(false));
     }
 
