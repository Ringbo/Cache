diff --git a/web/src/main/java/org/openmrs/web/controller/PatientEncountersPortletController.java b/web/src/main/java/org/openmrs/web/controller/PatientEncountersPortletController.java
index 84ebc0e..7ea076c 100644
--- a/web/src/main/java/org/openmrs/web/controller/PatientEncountersPortletController.java
+++ b/web/src/main/java/org/openmrs/web/controller/PatientEncountersPortletController.java
@@ -36,7 +36,7 @@
 		// determine whether it's need to show disclaimer on jsp page or not
 		// as current user does not have enough permissions to view at least one
 		// type of encounters
-		model.put("showDisclaimer", Context.getEncounterService().canViewAllEncounterTypes(Context.getAuthenticatedUser()));
+		model.put("showDisclaimer", !Context.getEncounterService().canViewAllEncounterTypes(Context.getAuthenticatedUser()));
 	}
 	
 }
