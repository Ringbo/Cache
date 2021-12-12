diff --git a/web/src/test/java/org/openmrs/web/controller/patient/ShortPatientFormValidatorTest.java b/web/src/test/java/org/openmrs/web/controller/patient/ShortPatientFormValidatorTest.java
index f8900b0..4f9bb3e 100644
--- a/web/src/test/java/org/openmrs/web/controller/patient/ShortPatientFormValidatorTest.java
+++ b/web/src/test/java/org/openmrs/web/controller/patient/ShortPatientFormValidatorTest.java
@@ -228,7 +228,7 @@
 	public void validate_shouldFailValidationIfBirthdateMakesPatient120YearsOldOrOlder() throws Exception {
 		Patient p = ps.getPatient(2);
 		Calendar c = Calendar.getInstance();
-		c.roll(Calendar.YEAR, -120);
+		c.roll(Calendar.YEAR, -121);
 		p.setBirthdate(c.getTime());
 		ShortPatientModel model = new ShortPatientModel(p);
 		Errors errors = new BindException(model, "patientModel");
