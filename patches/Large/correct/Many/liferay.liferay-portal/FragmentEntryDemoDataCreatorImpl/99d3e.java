diff --git a/modules/apps/web-experience/fragment/fragment-demo-data-creator-impl/src/main/java/com/liferay/fragment/demo/data/creator/internal/FragmentEntryDemoDataCreatorImpl.java b/modules/apps/web-experience/fragment/fragment-demo-data-creator-impl/src/main/java/com/liferay/fragment/demo/data/creator/internal/FragmentEntryDemoDataCreatorImpl.java
index 716e417..73f2bcd 100644
--- a/modules/apps/web-experience/fragment/fragment-demo-data-creator-impl/src/main/java/com/liferay/fragment/demo/data/creator/internal/FragmentEntryDemoDataCreatorImpl.java
+++ b/modules/apps/web-experience/fragment/fragment-demo-data-creator-impl/src/main/java/com/liferay/fragment/demo/data/creator/internal/FragmentEntryDemoDataCreatorImpl.java
@@ -72,16 +72,16 @@
 				userId, groupId, fragmentCollectionId, name, css, html, js,
 				serviceContext);
 
-		_entryIds.add(fragmentEntry.getFragmentEntryId());
+		_fragmentEntryIds.add(fragmentEntry.getFragmentEntryId());
 
 		return fragmentEntry;
 	}
 
 	@Override
 	public void delete() throws PortalException {
-		for (long entryId : _entryIds) {
+		for (long fragmentEntryId : _fragmentEntryIds) {
 			try {
-				_fragmentEntryLocalService.deleteFragmentEntry(entryId);
+				_fragmentEntryLocalService.deleteFragmentEntry(fragmentEntryId);
 			}
 			catch (NoSuchEntryException nsee) {
 				if (_log.isWarnEnabled()) {
@@ -89,7 +89,7 @@
 				}
 			}
 
-			_entryIds.remove(entryId);
+			_fragmentEntryIds.remove(fragmentEntryId);
 		}
 	}
 
@@ -121,7 +121,7 @@
 	private final AtomicInteger _atomicInteger = new AtomicInteger(0);
 	private final List<Integer> _availableIndexes =
 		new CopyOnWriteArrayList<>();
-	private final List<Long> _entryIds = new CopyOnWriteArrayList<>();
+	private final List<Long> _fragmentEntryIds = new CopyOnWriteArrayList<>();
 
 	@Reference
 	private FragmentEntryLocalService _fragmentEntryLocalService;
