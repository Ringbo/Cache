diff --git a/src/fitnesse/testsystems/slim/tables/DecisionTable.java b/src/fitnesse/testsystems/slim/tables/DecisionTable.java
index aa05d7a..2d46e3b 100644
--- a/src/fitnesse/testsystems/slim/tables/DecisionTable.java
+++ b/src/fitnesse/testsystems/slim/tables/DecisionTable.java
@@ -96,7 +96,7 @@
         String assignedSymbol = ifSymbolAssignment(col, row);
         SlimAssertion assertion;
         if (assignedSymbol != null) {
-        	assertion= makeAssertion(callAndAssign(assignedSymbol, "scriptTable" + "Actor", "cloneSymbol", "$"+functionName),
+        	assertion= makeAssertion(callAndAssign(assignedSymbol, "scriptTable" + "Actor", "cloneSymbol", "$"+name),
         			new ReturnedSymbolExpectation(col, row, name, assignedSymbol));
         } else {
           assertion = makeAssertion(Instruction.NOOP_INSTRUCTION, new ReturnedSymbolExpectation(col, row, name));
