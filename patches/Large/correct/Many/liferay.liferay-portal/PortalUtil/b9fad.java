diff --git a/portal-kernel/src/com/liferay/portal/kernel/util/PortalUtil.java b/portal-kernel/src/com/liferay/portal/kernel/util/PortalUtil.java
index adbca19..a24fa60 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/util/PortalUtil.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/util/PortalUtil.java
@@ -1155,7 +1155,7 @@
 			groupId, privateLayout, friendlyURL, params, requestContext);
 	}
 
-	public static LayoutFriendlyURLComposite
+	public static LayoutFriendlyURLSeparatorComposite
 			getLayoutFriendlyURLSeparatorComposite(
 				long groupId, boolean privateLayout, String friendlyURL,
 				Map<String, String[]> params,
