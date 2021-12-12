diff --git a/portal-service/src/com/liferay/portlet/asset/model/AssetVocabularyDisplay.java b/portal-service/src/com/liferay/portlet/asset/model/AssetVocabularyDisplay.java
index a08101b..83d1629 100644
--- a/portal-service/src/com/liferay/portlet/asset/model/AssetVocabularyDisplay.java
+++ b/portal-service/src/com/liferay/portlet/asset/model/AssetVocabularyDisplay.java
@@ -42,7 +42,7 @@
 	}
 
 	public int getPage() {
-		if ((_end > 0) && (_start > 0)) {
+		if ((_end > 0) && (_start >= 0)) {
 			return _end / (_end - _start);
 		}
 
