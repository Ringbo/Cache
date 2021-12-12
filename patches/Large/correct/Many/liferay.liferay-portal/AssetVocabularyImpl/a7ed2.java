diff --git a/portal-impl/src/com/liferay/portlet/asset/model/impl/AssetVocabularyImpl.java b/portal-impl/src/com/liferay/portlet/asset/model/impl/AssetVocabularyImpl.java
index a2d3c41..61b21cd 100644
--- a/portal-impl/src/com/liferay/portlet/asset/model/impl/AssetVocabularyImpl.java
+++ b/portal-impl/src/com/liferay/portlet/asset/model/impl/AssetVocabularyImpl.java
@@ -178,7 +178,7 @@
 			long classNameId, final long[] categoryIds)
 		throws SystemException {
 
-		if (isClassNameIdSpecified(classNameId, getRequiredClassNameIds())) {
+		if (!isClassNameIdSpecified(classNameId, getRequiredClassNameIds())) {
 			return false;
 		}
 
