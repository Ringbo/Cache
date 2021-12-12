diff --git a/src/web/org/openmrs/web/controller/encounter/EncounterFormController.java b/src/web/org/openmrs/web/controller/encounter/EncounterFormController.java
index a80c32b..6669852 100644
--- a/src/web/org/openmrs/web/controller/encounter/EncounterFormController.java
+++ b/src/web/org/openmrs/web/controller/encounter/EncounterFormController.java
@@ -214,7 +214,7 @@
 			map.put("forms", Context.getFormService().getForms());
 			// loop over the encounter's observations to find the edited obs
 			String reason = "";
-			for (Obs o : encounter.getObsAtTopLevel(false)) {
+			for (Obs o : encounter.getObsAtTopLevel(true)) {
 				// only the voided obs have been edited
 				if (o.isVoided()){
 					// assumes format of: ".* (new obsId: \d*)"
