diff --git a/modules/apps/web-experience/fragment/fragment-demo-data-creator-impl/src/main/java/com/liferay/fragment/demo/data/creator/internal/FragmentCollectionDemoDataCreatorImpl.java b/modules/apps/web-experience/fragment/fragment-demo-data-creator-impl/src/main/java/com/liferay/fragment/demo/data/creator/internal/FragmentCollectionDemoDataCreatorImpl.java
index d69e591..7bba7f3 100644
--- a/modules/apps/web-experience/fragment/fragment-demo-data-creator-impl/src/main/java/com/liferay/fragment/demo/data/creator/internal/FragmentCollectionDemoDataCreatorImpl.java
+++ b/modules/apps/web-experience/fragment/fragment-demo-data-creator-impl/src/main/java/com/liferay/fragment/demo/data/creator/internal/FragmentCollectionDemoDataCreatorImpl.java
@@ -50,17 +50,17 @@
 			_fragmentCollectionLocalService.addFragmentCollection(
 				userId, groupId, name, null, serviceContext);
 
-		_entryIds.add(fragmentCollection.getFragmentCollectionId());
+		_fragmentCollectionIds.add(fragmentCollection.getFragmentCollectionId());
 
 		return fragmentCollection;
 	}
 
 	@Override
 	public void delete() throws PortalException {
-		for (long entryId : _entryIds) {
+		for (long fragmentCollectionId : _fragmentCollectionIds) {
 			try {
 				_fragmentCollectionLocalService.deleteFragmentCollection(
-					entryId);
+					fragmentCollectionId);
 			}
 			catch (NoSuchCollectionException nsce) {
 				if (_log.isWarnEnabled()) {
@@ -68,14 +68,15 @@
 				}
 			}
 
-			_entryIds.remove(entryId);
+			_fragmentCollectionIds.remove(fragmentCollectionId);
 		}
 	}
 
 	private static final Log _log = LogFactoryUtil.getLog(
 		FragmentCollectionDemoDataCreatorImpl.class);
 
-	private final List<Long> _entryIds = new CopyOnWriteArrayList<>();
+	private final List<Long> _fragmentCollectionIds =
+		new CopyOnWriteArrayList<>();
 
 	@Reference
 	private FragmentCollectionLocalService _fragmentCollectionLocalService;
