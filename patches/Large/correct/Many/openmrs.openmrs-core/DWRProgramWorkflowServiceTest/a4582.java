diff --git a/web/src/test/java/org/openmrs/web/dwr/DWRProgramWorkflowServiceTest.java b/web/src/test/java/org/openmrs/web/dwr/DWRProgramWorkflowServiceTest.java
index 8e25003..63df58f 100644
--- a/web/src/test/java/org/openmrs/web/dwr/DWRProgramWorkflowServiceTest.java
+++ b/web/src/test/java/org/openmrs/web/dwr/DWRProgramWorkflowServiceTest.java
@@ -27,6 +27,6 @@
 		executeDataSet(PROGRAM_WITH_OUTCOMES_XML);
 		Vector<ListItem> possibleOutcomes = dwrProgramWorkflowService.getPossibleOutcomes(4);
 		assertFalse(possibleOutcomes.isEmpty());
-		assertEquals(2, possibleOutcomes.size());
+		assertEquals(4, possibleOutcomes.size());
 	}
 }
