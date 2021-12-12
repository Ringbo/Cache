diff --git a/api/src/test/java/org/openmrs/annotation/OpenmrsProfileExcludeFilterTest.java b/api/src/test/java/org/openmrs/annotation/OpenmrsProfileExcludeFilterTest.java
index 26cde1d..e51ae34 100644
--- a/api/src/test/java/org/openmrs/annotation/OpenmrsProfileExcludeFilterTest.java
+++ b/api/src/test/java/org/openmrs/annotation/OpenmrsProfileExcludeFilterTest.java
@@ -80,7 +80,7 @@
 	 */
 	@Test
 	public void match_shouldIncludeBeanIfModuleMissing() {
-		OpenmrsProfileWithoutTest1Module bean = applicationContext.getBean(OpenmrsProfileWithoutTest1Module.class);
+		OpenmrsProfileWithoutMissingModule bean = applicationContext.getBean(OpenmrsProfileWithoutMissingModule.class);
 		
 		assertThat(bean, is(notNullValue()));
 	}
