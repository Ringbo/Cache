diff --git a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/DLFileEntryTypeServiceTest.java b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/DLFileEntryTypeServiceTest.java
index 72b5db8..0335525 100644
--- a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/DLFileEntryTypeServiceTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/DLFileEntryTypeServiceTest.java
@@ -85,7 +85,7 @@
 			PortalUtil.getSiteAndCompanyGroupIds(_group.getGroupId()));
 
 		for (DLFileEntryType dlFileEntryType : _dlFileEntryTypes) {
-			String name = dlFileEntryType.getName();
+			String name = dlFileEntryType.getName(Locale.getDefault());
 
 			if (name.equals(DLFileEntryTypeConstants.NAME_CONTRACT)) {
 				_contractDLFileEntryType = dlFileEntryType;
