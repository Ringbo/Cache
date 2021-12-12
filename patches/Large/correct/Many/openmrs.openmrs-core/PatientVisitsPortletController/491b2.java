diff --git a/web/src/main/java/org/openmrs/web/controller/PatientVisitsPortletController.java b/web/src/main/java/org/openmrs/web/controller/PatientVisitsPortletController.java
index 1bbc63b..03594c5 100644
--- a/web/src/main/java/org/openmrs/web/controller/PatientVisitsPortletController.java
+++ b/web/src/main/java/org/openmrs/web/controller/PatientVisitsPortletController.java
@@ -54,7 +54,7 @@
 		// determine whether it's need to show disclaimer on jsp page or not
 		// as current user does not have enough permissions to view at least one
 		// type of encounters
-		model.put("showDisclaimer", Context.getEncounterService().canViewAllEncounterTypes(Context.getAuthenticatedUser()));
+		model.put("showDisclaimer", !Context.getEncounterService().canViewAllEncounterTypes(Context.getAuthenticatedUser()));
 	}
 	
 }
