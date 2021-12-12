diff --git a/modules/apps/change-tracking/change-tracking-test/src/testIntegration/java/com/liferay/change/tracking/service/test/CTManagerTest.java b/modules/apps/change-tracking/change-tracking-test/src/testIntegration/java/com/liferay/change/tracking/service/test/CTManagerTest.java
index c3229c4..495c209 100644
--- a/modules/apps/change-tracking/change-tracking-test/src/testIntegration/java/com/liferay/change/tracking/service/test/CTManagerTest.java
+++ b/modules/apps/change-tracking/change-tracking-test/src/testIntegration/java/com/liferay/change/tracking/service/test/CTManagerTest.java
@@ -278,7 +278,7 @@
 	}
 
 	@Test
-	public void testRegisterModelChange() {
+	public void testRegisterModelChange() throws PortalException {
 		Optional<CTEntry> ctEntryOptional = _ctManager.registerModelChange(
 			_user.getUserId(), _testVersionClassClassName.getClassNameId(),
 			_TEST_VERSION_CLASS_ENTITY_ID, _TEST_RESOURCE_CLASS_ENTITY_ID);
