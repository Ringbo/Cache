diff --git a/portal-impl/test/integration/com/liferay/portlet/dynamicdatamapping/service/BaseDDMServiceTestCase.java b/portal-impl/test/integration/com/liferay/portlet/dynamicdatamapping/service/BaseDDMServiceTestCase.java
index 3f3b018..64bbd6a 100644
--- a/portal-impl/test/integration/com/liferay/portlet/dynamicdatamapping/service/BaseDDMServiceTestCase.java
+++ b/portal-impl/test/integration/com/liferay/portlet/dynamicdatamapping/service/BaseDDMServiceTestCase.java
@@ -129,10 +129,10 @@
 		throws Exception {
 
 		return DDMTemplateLocalServiceUtil.addTemplate(
-			TestPropsValues.getUserId(), TestPropsValues.getGroupId(),
-			classNameId, classPK, templateKey, getDefaultLocaleMap(name), null,
-			type, mode, language, script, cacheable, smallImage, smallImageURL,
-			smallFile, ServiceTestUtil.getServiceContext());
+			TestPropsValues.getUserId(), group.getGroupId(), classNameId,
+			classPK, templateKey, getDefaultLocaleMap(name), null, type, mode,
+			language, script, cacheable, smallImage, smallImageURL, smallFile,
+			ServiceTestUtil.getServiceContext());
 	}
 
 	protected Map<Locale, String> getDefaultLocaleMap(String defaultValue) {
