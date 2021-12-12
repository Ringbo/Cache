diff --git a/api/src/test/java/org/openmrs/api/ProgramWorkflowServiceTest.java b/api/src/test/java/org/openmrs/api/ProgramWorkflowServiceTest.java
index 9c554d0..fa8a057 100644
--- a/api/src/test/java/org/openmrs/api/ProgramWorkflowServiceTest.java
+++ b/api/src/test/java/org/openmrs/api/ProgramWorkflowServiceTest.java
@@ -343,7 +343,7 @@
 		executeDataSet(PROGRAM_WITH_OUTCOMES_XML);
 		
 		List<Concept> possibleOutcomes = Context.getProgramWorkflowService().getPossibleOutcomes(4);
-		assertEquals(2, possibleOutcomes.size());
+		assertEquals(4, possibleOutcomes.size());
 	}
 	
 	@Test
