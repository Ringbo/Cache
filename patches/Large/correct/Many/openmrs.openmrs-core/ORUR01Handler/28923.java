diff --git a/api/src/main/java/org/openmrs/hl7/handler/ORUR01Handler.java b/api/src/main/java/org/openmrs/hl7/handler/ORUR01Handler.java
index b62fc7f..e380dfb 100644
--- a/api/src/main/java/org/openmrs/hl7/handler/ORUR01Handler.java
+++ b/api/src/main/java/org/openmrs/hl7/handler/ORUR01Handler.java
@@ -892,7 +892,7 @@
 	 * @should return a mapped Concept if given a valid mapping
 	 */
 	protected Concept getConcept(String hl7ConceptId, String codingSystem, String uid) throws HL7Exception {
-		if (HL7Constants.HL7_LOCAL_CONCEPT.equals(codingSystem)) {
+		if (codingSystem == null || HL7Constants.HL7_LOCAL_CONCEPT.equals(codingSystem)) {
 			// the concept is local
 			try {
 				Integer conceptId = new Integer(hl7ConceptId);
