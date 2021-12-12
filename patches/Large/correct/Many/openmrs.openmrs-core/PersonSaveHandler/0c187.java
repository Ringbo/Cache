diff --git a/api/src/main/java/org/openmrs/api/handler/PersonSaveHandler.java b/api/src/main/java/org/openmrs/api/handler/PersonSaveHandler.java
index e0dacb4..75a0564 100644
--- a/api/src/main/java/org/openmrs/api/handler/PersonSaveHandler.java
+++ b/api/src/main/java/org/openmrs/api/handler/PersonSaveHandler.java
@@ -93,7 +93,7 @@
 		// do the checks for voided attributes (also in PersonVoidHandler)
 		if (person.isPersonVoided()) {
 			
-			if (!StringUtils.hasLength(person.getVoidReason()))
+			if (!StringUtils.hasLength(person.getPersonVoidReason()))
 				throw new APIException(
 				        "The voided bit was set to true, so a void reason is required at save time for person: " + person);
 			
