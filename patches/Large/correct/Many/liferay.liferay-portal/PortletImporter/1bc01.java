diff --git a/portal-impl/src/com/liferay/portal/lar/PortletImporter.java b/portal-impl/src/com/liferay/portal/lar/PortletImporter.java
index 9923277..5d4be30 100644
--- a/portal-impl/src/com/liferay/portal/lar/PortletImporter.java
+++ b/portal-impl/src/com/liferay/portal/lar/PortletImporter.java
@@ -495,7 +495,7 @@
 
 		AssetVocabulary importedVocabulary = null;
 
-		AssetVocabulary existingVocabulary = AssetVocabularyUtil.findByG_N(
+		AssetVocabulary existingVocabulary = AssetVocabularyUtil.fetchByG_N(
 			groupId, vocabulary.getName());
 
 		if (existingVocabulary == null) {
