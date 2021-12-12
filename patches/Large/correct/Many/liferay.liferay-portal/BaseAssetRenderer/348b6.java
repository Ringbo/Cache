diff --git a/portal-service/src/com/liferay/portlet/asset/model/BaseAssetRenderer.java b/portal-service/src/com/liferay/portlet/asset/model/BaseAssetRenderer.java
index f6f8f0c..e2c0d01 100644
--- a/portal-service/src/com/liferay/portlet/asset/model/BaseAssetRenderer.java
+++ b/portal-service/src/com/liferay/portlet/asset/model/BaseAssetRenderer.java
@@ -56,7 +56,7 @@
  * @author Jorge Ferrer
  * @author Sergio González
  */
-public abstract class BaseAssetRenderer implements AssetRenderer {
+public abstract class BaseAssetRenderer<T> implements AssetRenderer<T> {
 
 	/**
 	 * @deprecated As of 7.0.0, with no direct replacement
@@ -68,7 +68,7 @@
 	}
 
 	@Override
-	public Object getAsset() {
+	public T getAsset() {
 		return null;
 	}
 
