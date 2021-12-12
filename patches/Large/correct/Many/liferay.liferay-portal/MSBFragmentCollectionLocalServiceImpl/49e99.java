diff --git a/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/impl/MSBFragmentCollectionLocalServiceImpl.java b/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/impl/MSBFragmentCollectionLocalServiceImpl.java
index dbea5c96..dbb08f0 100644
--- a/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/impl/MSBFragmentCollectionLocalServiceImpl.java
+++ b/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/impl/MSBFragmentCollectionLocalServiceImpl.java
@@ -100,13 +100,13 @@
 			msbFragmentCollection.getCompanyId(),
 			MSBFragmentCollection.class.getName(),
 			ResourceConstants.SCOPE_INDIVIDUAL,
-			msbFragmentCollection.getFragmentCollectionId());
+			msbFragmentCollection.getMsbFragmentCollectionId());
 
 		// Mobile site building fragment entries
 
 		List<MSBFragmentEntry> msbFragmentEntries =
 			msbFragmentEntryPersistence.findByMSBFragmentCollectionId(
-				msbFragmentCollection.getFragmentCollectionId());
+				msbFragmentCollection.getMsbFragmentCollectionId());
 
 		for (MSBFragmentEntry msbFragmentEntry : msbFragmentEntries) {
 			msbFragmentEntryLocalService.deleteMSBFragmentEntry(
