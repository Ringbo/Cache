diff --git a/api/src/main/java/org/openmrs/Allergy.java b/api/src/main/java/org/openmrs/Allergy.java
index 1a9c291..b2813b5 100644
--- a/api/src/main/java/org/openmrs/Allergy.java
+++ b/api/src/main/java/org/openmrs/Allergy.java
@@ -317,7 +317,7 @@
 	 * @throws InvocationTargetException
 	 * @throws IllegalAccessException
 	 */
-	public void copy(Allergy allergy) throws InvocationTargetException, IllegalAccessException {
+	public void copy(Allergy allergy) {
 		setAllergyId(null);
 		setUuid(UUID.randomUUID().toString());
 		setPatient(allergy.getPatient());
