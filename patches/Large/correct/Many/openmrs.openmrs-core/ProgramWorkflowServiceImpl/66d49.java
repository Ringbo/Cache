diff --git a/api/src/main/java/org/openmrs/api/impl/ProgramWorkflowServiceImpl.java b/api/src/main/java/org/openmrs/api/impl/ProgramWorkflowServiceImpl.java
index 4345a9b..72884b9 100644
--- a/api/src/main/java/org/openmrs/api/impl/ProgramWorkflowServiceImpl.java
+++ b/api/src/main/java/org/openmrs/api/impl/ProgramWorkflowServiceImpl.java
@@ -333,7 +333,7 @@
 		}
 		if (!outcomesConcept.getAnswers().isEmpty()) {
 			for (ConceptAnswer conceptAnswer : outcomesConcept.getAnswers()) {
-				possibleOutcomes.add(conceptAnswer.getConcept());
+				possibleOutcomes.add(conceptAnswer.getAnswerConcept());
 			}
 			return possibleOutcomes;
 		}
