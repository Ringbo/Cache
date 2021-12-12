diff --git a/tool/test/org/antlr/v4/test/TestPerformance.java b/tool/test/org/antlr/v4/test/TestPerformance.java
index acab9d9..4ab3681 100644
--- a/tool/test/org/antlr/v4/test/TestPerformance.java
+++ b/tool/test/org/antlr/v4/test/TestPerformance.java
@@ -849,7 +849,7 @@
 					System.out.format("\tMode\tStates\tConfigs\tMode%n");
 					for (int i = 0; i < modeToDFA.length; i++) {
 						DFA dfa = modeToDFA[i];
-						if (dfa == null) {
+						if (dfa == null || dfa.states.isEmpty()) {
 							continue;
 						}
 
