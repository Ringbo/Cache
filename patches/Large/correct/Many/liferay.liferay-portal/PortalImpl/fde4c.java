diff --git a/portal-impl/src/com/liferay/portal/util/PortalImpl.java b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
index 6c4b6cf..e67f9e7 100644
--- a/portal-impl/src/com/liferay/portal/util/PortalImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
@@ -534,7 +534,7 @@
 		ListMergeable<String> titleListMergeable =
 			(ListMergeable<String>)request.getAttribute(WebKeys.PAGE_TITLE);
 
-		if (titleListMergeable != null) {
+		if (titleListMergeable == null) {
 			titleListMergeable = new ListMergeable<String>();
 
 			request.setAttribute(WebKeys.PAGE_TITLE, titleListMergeable);
