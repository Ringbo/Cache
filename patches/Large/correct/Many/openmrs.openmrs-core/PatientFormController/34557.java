diff --git a/src/web/org/openmrs/web/controller/patient/PatientFormController.java b/src/web/org/openmrs/web/controller/patient/PatientFormController.java
index f77c0f2..e02f9ab 100644
--- a/src/web/org/openmrs/web/controller/patient/PatientFormController.java
+++ b/src/web/org/openmrs/web/controller/patient/PatientFormController.java
@@ -598,7 +598,7 @@
 		
 		if (reasonForExitConcept != null && patient.getPatientId() != null) {
 			List<Obs> patientExitObs = Context.getObsService().getObservationsByPersonAndConcept(patient, reasonForExitConcept);
-			if (patientExitObs != null) {
+			if (patientExitObs != null && patientExitObs.size() > 0) {
 				log.debug("Exit obs is size " + patientExitObs.size());
 				if (patientExitObs.size() == 1) {
 					Obs exitObs = patientExitObs.iterator().next();
