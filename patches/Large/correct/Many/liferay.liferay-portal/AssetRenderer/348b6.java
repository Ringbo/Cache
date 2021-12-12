diff --git a/portal-service/src/com/liferay/portlet/asset/model/AssetRenderer.java b/portal-service/src/com/liferay/portlet/asset/model/AssetRenderer.java
index c767421..5125f2f 100644
--- a/portal-service/src/com/liferay/portlet/asset/model/AssetRenderer.java
+++ b/portal-service/src/com/liferay/portlet/asset/model/AssetRenderer.java
@@ -33,7 +33,7 @@
  * @author Jorge Ferrer
  * @author Juan Fernández
  */
-public interface AssetRenderer extends Renderer {
+public interface AssetRenderer<T> extends Renderer {
 
 	public static final String TEMPLATE_ABSTRACT = "abstract";
 
@@ -47,7 +47,7 @@
 	@Deprecated
 	public String getAddToPagePortletId() throws Exception;
 
-	public Object getAsset();
+	public T getAsset();
 
 	public int getAssetRendererType();
 
