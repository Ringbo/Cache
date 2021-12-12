diff --git a/modules/apps/foundation/portal-search/portal-search-api/src/main/java/com/liferay/portal/search/suggest/BaseSpellCheckIndexWriter.java b/modules/apps/foundation/portal-search/portal-search-api/src/main/java/com/liferay/portal/search/suggest/BaseSpellCheckIndexWriter.java
index b74e0ef..49ab005 100644
--- a/modules/apps/foundation/portal-search/portal-search-api/src/main/java/com/liferay/portal/search/suggest/BaseSpellCheckIndexWriter.java
+++ b/modules/apps/foundation/portal-search/portal-search-api/src/main/java/com/liferay/portal/search/suggest/BaseSpellCheckIndexWriter.java
@@ -70,7 +70,7 @@
 		long[] groupIds = searchContext.getGroupIds();
 
 		if ((groupIds != null) && (groupIds.length > 0)) {
-			groupId = groupIds[1];
+			groupId = groupIds[0];
 		}
 
 		String keywordFieldName = Field.KEYWORD_SEARCH;
