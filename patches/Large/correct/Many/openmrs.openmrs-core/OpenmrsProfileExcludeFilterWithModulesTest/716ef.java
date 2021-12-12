diff --git a/api/src/test/java/org/openmrs/annotation/OpenmrsProfileExcludeFilterWithModulesTest.java b/api/src/test/java/org/openmrs/annotation/OpenmrsProfileExcludeFilterWithModulesTest.java
index 2150b30..df31d0c 100644
--- a/api/src/test/java/org/openmrs/annotation/OpenmrsProfileExcludeFilterWithModulesTest.java
+++ b/api/src/test/java/org/openmrs/annotation/OpenmrsProfileExcludeFilterWithModulesTest.java
@@ -21,6 +21,6 @@
 	 */
 	@Test(expected = NoSuchBeanDefinitionException.class)
 	public void match_shouldNotIncludeBeanIfModuleIsStarted() {
-		applicationContext.getBean(OpenmrsProfileWithoutTest1Module.class);
+		applicationContext.getBean(OpenmrsProfileWithoutMissingModule.class);
 	}
 }
\ No newline at end of file
