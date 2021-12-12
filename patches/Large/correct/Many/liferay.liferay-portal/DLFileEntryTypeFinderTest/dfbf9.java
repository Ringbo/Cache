diff --git a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/persistence/DLFileEntryTypeFinderTest.java b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/persistence/DLFileEntryTypeFinderTest.java
index 2fee5b0..c7a8922 100644
--- a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/persistence/DLFileEntryTypeFinderTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/persistence/DLFileEntryTypeFinderTest.java
@@ -67,7 +67,7 @@
 
 	@Test
 	public void testFilterCountByKeywords() throws Exception {
-		int initialCount = DLFileEntryTypeFinderUtil.countByKeywords(
+		int initialCount = DLFileEntryTypeFinderUtil.filterCountByKeywords(
 			_group.getCompanyId(), new long[] {_group.getGroupId()},
 			_DL_FILE_ENTRY_TYPE_NAME, true);
 
@@ -82,7 +82,7 @@
 
 	@Test
 	public void testFilterCountByKeywordsWithBlankKeywords() throws Exception {
-		int initialCount = DLFileEntryTypeFinderUtil.countByKeywords(
+		int initialCount = DLFileEntryTypeFinderUtil.filterCountByKeywords(
 			_group.getCompanyId(), new long[] {_group.getGroupId()},
 			StringPool.BLANK, true);
 
@@ -133,7 +133,7 @@
 		DLFileEntryType fileEntryType = addFileEntryType();
 
 		List<DLFileEntryType> fileEntryTypes =
-			DLFileEntryTypeFinderUtil.findByKeywords(
+			DLFileEntryTypeFinderUtil.filterFindByKeywords(
 				_group.getCompanyId(), new long[] {_group.getGroupId()},
 				_DL_FILE_ENTRY_TYPE_NAME, true, QueryUtil.ALL_POS,
 				QueryUtil.ALL_POS, null);
