diff --git a/portal-impl/src/com/liferay/portlet/asset/util/AssetUtil.java b/portal-impl/src/com/liferay/portlet/asset/util/AssetUtil.java
index fd6a1a2..d0efdd8 100644
--- a/portal-impl/src/com/liferay/portlet/asset/util/AssetUtil.java
+++ b/portal-impl/src/com/liferay/portlet/asset/util/AssetUtil.java
@@ -509,13 +509,13 @@
 						allAssetTagNames, redirect);
 
 					if (addPortletURL != null) {
-						String mesage =
+						String message =
 							className + CLASSNAME_SEPARATOR +
 							classType.getName();
 
 						addPortletURLs.add(
 							new AssetPortletAddURL(
-								portlet.getPortletId(), mesage, resourceBundle,
+								portlet.getPortletId(), message, resourceBundle,
 								locale, addPortletURL));
 					}
 				}
