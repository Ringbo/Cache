diff --git a/portal-service/src/com/liferay/portlet/asset/model/AssetTagDisplay.java b/portal-service/src/com/liferay/portlet/asset/model/AssetTagDisplay.java
index 426b983..55c8ece 100644
--- a/portal-service/src/com/liferay/portlet/asset/model/AssetTagDisplay.java
+++ b/portal-service/src/com/liferay/portlet/asset/model/AssetTagDisplay.java
@@ -40,7 +40,7 @@
 	}
 
 	public int getPage() {
-		if ((_end > 0) && (_start > 0)) {
+		if ((_end > 0) && (_start >= 0)) {
 			return _end / (_end - _start);
 		}
 
