diff --git a/portal-service/src/com/liferay/portlet/asset/model/AssetCategoryDisplay.java b/portal-service/src/com/liferay/portlet/asset/model/AssetCategoryDisplay.java
index 0ed199c..86d4390 100644
--- a/portal-service/src/com/liferay/portlet/asset/model/AssetCategoryDisplay.java
+++ b/portal-service/src/com/liferay/portlet/asset/model/AssetCategoryDisplay.java
@@ -46,7 +46,7 @@
 	}
 
 	public int getPage() {
-		if ((_end > 0) && (_start > 0)) {
+		if ((_end > 0) && (_start >= 0)) {
 			return _end / (_end - _start);
 		}
 
