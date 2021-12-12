diff --git a/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/impl/MSBFragmentEntryLocalServiceImpl.java b/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/impl/MSBFragmentEntryLocalServiceImpl.java
index 49ed94e..f2e5f4d 100644
--- a/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/impl/MSBFragmentEntryLocalServiceImpl.java
+++ b/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/impl/MSBFragmentEntryLocalServiceImpl.java
@@ -98,7 +98,7 @@
 		resourceLocalService.deleteResource(
 			msbFragmentEntry.getCompanyId(), MSBFragmentEntry.class.getName(),
 			ResourceConstants.SCOPE_INDIVIDUAL,
-			msbFragmentEntry.getFragmentEntryId());
+			msbFragmentEntry.getMsbFragmentEntryId());
 
 		return msbFragmentEntry;
 	}
