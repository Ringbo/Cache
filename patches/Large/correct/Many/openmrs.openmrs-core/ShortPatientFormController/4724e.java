diff --git a/web/src/main/java/org/openmrs/web/controller/patient/ShortPatientFormController.java b/web/src/main/java/org/openmrs/web/controller/patient/ShortPatientFormController.java
index df87763..86ffec5 100644
--- a/web/src/main/java/org/openmrs/web/controller/patient/ShortPatientFormController.java
+++ b/web/src/main/java/org/openmrs/web/controller/patient/ShortPatientFormController.java
@@ -247,7 +247,7 @@
 				
 				if (!patient.getVoided()) {
 					// save the relationships to the database
-					Map<String, Relationship> relationships = getRelationshipsMap(patientModel, request);
+					Map<String, Relationship> relationships = getRelationshipsMap(patientModel, result, request);
 					for (Relationship relationship : relationships.values()) {
 						// if the user added a person to this relationship, save
 						// it
@@ -347,6 +347,7 @@
 	
 	/**
 	 * Creates a map of string of the form 3b, 3a and the actual person Relationships
+	 * @param result 
 	 * 
 	 * @param person the patient/person whose relationships to return
 	 * @param request the webRequest Object
@@ -354,13 +355,13 @@
 	 */
 	@ModelAttribute("relationshipsMap")
 	private Map<String, Relationship> getRelationshipsMap(@ModelAttribute("patientModel") ShortPatientModel patientModel,
-	        WebRequest request) {
+	        BindingResult result, WebRequest request) {
 		
 		// Check if relationships must be shown
 		String showRelationships = Context.getAdministrationService().getGlobalProperty(
 		    OpenmrsConstants.GLOBAL_PROPERTY_NEWPATIENTFORM_SHOW_RELATIONSHIPS, "false");
 		
-		if ("false".equals(showRelationships)) {
+		if ("false".equals(showRelationships) || result.hasErrors()) {
 			return new LinkedHashMap<String, Relationship>();
 		}
 		
