diff --git a/src/api/org/openmrs/hl7/handler/ORUR01Handler.java b/src/api/org/openmrs/hl7/handler/ORUR01Handler.java
index de5ed9e..68d8290 100644
--- a/src/api/org/openmrs/hl7/handler/ORUR01Handler.java
+++ b/src/api/org/openmrs/hl7/handler/ORUR01Handler.java
@@ -260,7 +260,7 @@
 			log.debug("Current thread: " + Thread.currentThread());
 			log.debug("Creating the encounter object");
 		}
-		Context.getEncounterService().createEncounter(encounter);
+		Context.getEncounterService().saveEncounter(encounter);
 		
 		// Notify HL7 service that we have created a new encounter, allowing
 		// features/modules to trigger on HL7-generated encounters.
