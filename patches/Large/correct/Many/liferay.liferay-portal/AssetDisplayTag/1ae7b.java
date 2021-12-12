diff --git a/util-taglib/src/com/liferay/taglib/ui/AssetDisplayTag.java b/util-taglib/src/com/liferay/taglib/ui/AssetDisplayTag.java
index c31a1e7e..cd65782 100644
--- a/util-taglib/src/com/liferay/taglib/ui/AssetDisplayTag.java
+++ b/util-taglib/src/com/liferay/taglib/ui/AssetDisplayTag.java
@@ -170,8 +170,7 @@
 			}
 		}
 
-		request.setAttribute(
-			"liferay-ui:asset-display:assetEntry", _assetEntry);
+		request.setAttribute("liferay-ui:asset-display:assetEntry", assetEntry);
 
 		Renderer renderer = _renderer;
 
