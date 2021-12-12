diff --git a/api/src/main/java/org/openmrs/validator/ProgramValidator.java b/api/src/main/java/org/openmrs/validator/ProgramValidator.java
index 7a551fa..5d1b9b2 100644
--- a/api/src/main/java/org/openmrs/validator/ProgramValidator.java
+++ b/api/src/main/java/org/openmrs/validator/ProgramValidator.java
@@ -63,7 +63,7 @@
 			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "error.description.required");
 			List<Program> programs = Context.getProgramWorkflowService().getAllPrograms(false);
 			for (Program program : programs) {
-				if (program.getName().equals(p.getName()) && !program.getProgramId().equals(p.getProgramId())) {
+				if (program.getName().equals(p.getName()) && !program.getUuid().equals(p.getUuid())) {
 					errors.rejectValue("name", "general.error.nameAlreadyInUse");
 					break;
 				} else {
