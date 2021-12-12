diff --git a/src/api/org/openmrs/hl7/handler/ADTA28Handler.java b/src/api/org/openmrs/hl7/handler/ADTA28Handler.java
index ad5a952..2c78d85 100644
--- a/src/api/org/openmrs/hl7/handler/ADTA28Handler.java
+++ b/src/api/org/openmrs/hl7/handler/ADTA28Handler.java
@@ -288,7 +288,7 @@
 		
 		// Date of Birth
 		TS dateOfBirth = pid.getDateTimeOfBirth();
-	    if (dateOfBirth == null)	
+	    if (dateOfBirth == null || dateOfBirth.getTime() == null || dateOfBirth.getTime().getValue() == null)	
 			throw new HL7Exception("Missing birth date in the PID segment");
 		patient.setBirthdate(tsToDate(dateOfBirth));
 		
