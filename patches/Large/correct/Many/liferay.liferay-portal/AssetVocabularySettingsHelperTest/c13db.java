diff --git a/portal-impl/test/unit/com/liferay/portlet/asset/util/AssetVocabularySettingsHelperTest.java b/portal-impl/test/unit/com/liferay/portlet/asset/util/AssetVocabularySettingsHelperTest.java
index e3fe4258..f640a89 100644
--- a/portal-impl/test/unit/com/liferay/portlet/asset/util/AssetVocabularySettingsHelperTest.java
+++ b/portal-impl/test/unit/com/liferay/portlet/asset/util/AssetVocabularySettingsHelperTest.java
@@ -103,7 +103,7 @@
 		AssetVocabularySettingsHelper vocabularySettingsHelper =
 			getVocabularySettingsHelper(1, 2, true);
 
-		long[] classTypePKs = vocabularySettingsHelper.getClassTypePKs();
+		long[] classTypePKs = vocabularySettingsHelper.getRequiredClassTypePKs();
 
 		Assert.assertNotNull(classTypePKs);
 		Assert.assertEquals(1, classTypePKs.length);
