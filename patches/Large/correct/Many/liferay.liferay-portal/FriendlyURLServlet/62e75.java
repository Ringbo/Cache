diff --git a/portal-impl/src/com/liferay/portal/servlet/FriendlyURLServlet.java b/portal-impl/src/com/liferay/portal/servlet/FriendlyURLServlet.java
index df1906d..2df658d 100644
--- a/portal-impl/src/com/liferay/portal/servlet/FriendlyURLServlet.java
+++ b/portal-impl/src/com/liferay/portal/servlet/FriendlyURLServlet.java
@@ -288,7 +288,7 @@
 				friendlyURL = friendlyURL.substring(0, pos);
 			}
 
-			if (!friendlyURL.startsWith(layout.getFriendlyURL(locale))) {
+			if (!friendlyURL.equals(layout.getFriendlyURL(locale))) {
 				setAlternativeLayoutFriendlyURL(request, layout, friendlyURL);
 
 				String redirect = PortalUtil.getLocalizedFriendlyURL(
