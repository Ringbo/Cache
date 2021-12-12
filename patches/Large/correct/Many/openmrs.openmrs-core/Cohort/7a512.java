diff --git a/api/src/main/java/org/openmrs/Cohort.java b/api/src/main/java/org/openmrs/Cohort.java
index 23fcaa9..e87f27c 100644
--- a/api/src/main/java/org/openmrs/Cohort.java
+++ b/api/src/main/java/org/openmrs/Cohort.java
@@ -213,8 +213,7 @@
 	 * @since 2.1.0
 	 */
 	public CohortMembership getActiveMembership(Patient patient) {
-		return getMemberships().stream().filter(m -> m.isActive() && m.getPatientId().equals(patient.getPatientId()))
-		        .collect(Collectors.toList()).get(0);
+		return getMemberships().stream().filter(m -> m.isActive() && m.getPatientId().equals(patient.getPatientId())).findFirst().get();
 	}
 	
 	public int size() {
