diff --git a/src/web/org/openmrs/web/controller/program/PatientProgramFormController.java b/src/web/org/openmrs/web/controller/program/PatientProgramFormController.java
index 7c8a01d..50106d3 100644
--- a/src/web/org/openmrs/web/controller/program/PatientProgramFormController.java
+++ b/src/web/org/openmrs/web/controller/program/PatientProgramFormController.java
@@ -67,7 +67,7 @@
 		Date completionDate = (Date) cde.getValue();
 		Patient patient = Context.getPatientService().getPatient(Integer.valueOf(patientIdStr));
 		Program program = pws.getProgram(Integer.valueOf(programIdStr));
-		if (!pws.getPatientPrograms(patient, program, null, enrollmentDate, completionDate, null, false).isEmpty())
+		if (!pws.getPatientPrograms(patient, program, null, completionDate, enrollmentDate, null, false).isEmpty())
 			request.getSession().setAttribute(WebConstants.OPENMRS_ERROR_ATTR, "Program.error.already");
 		else {
 			PatientProgram pp = new PatientProgram();
