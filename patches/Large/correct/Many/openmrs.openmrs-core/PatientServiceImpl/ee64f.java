diff --git a/api/src/main/java/org/openmrs/api/impl/PatientServiceImpl.java b/api/src/main/java/org/openmrs/api/impl/PatientServiceImpl.java
index 870156d..71a9a87 100644
--- a/api/src/main/java/org/openmrs/api/impl/PatientServiceImpl.java
+++ b/api/src/main/java/org/openmrs/api/impl/PatientServiceImpl.java
@@ -125,7 +125,7 @@
 			Context.requirePrivilege(PrivilegeConstants.DELETE_PATIENTS);
 		}
 		
-		if (patient.getIdentifiers().size() == 1) {
+		if (!patient.isVoided() && patient.getIdentifiers().size() == 1) {
 			patient.getPatientIdentifier().setPreferred(true);
 		}
 		
