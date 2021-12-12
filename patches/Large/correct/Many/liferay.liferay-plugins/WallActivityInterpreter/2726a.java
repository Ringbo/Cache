diff --git a/portlets/social-networking-portlet/docroot/WEB-INF/src/com/liferay/socialnetworking/wall/social/WallActivityInterpreter.java b/portlets/social-networking-portlet/docroot/WEB-INF/src/com/liferay/socialnetworking/wall/social/WallActivityInterpreter.java
index fe5da5b..b22ff4f 100644
--- a/portlets/social-networking-portlet/docroot/WEB-INF/src/com/liferay/socialnetworking/wall/social/WallActivityInterpreter.java
+++ b/portlets/social-networking-portlet/docroot/WEB-INF/src/com/liferay/socialnetworking/wall/social/WallActivityInterpreter.java
@@ -49,7 +49,7 @@
 			activity.getReceiverUserId());
 
 		if (!SocialRelationLocalServiceUtil.hasRelation(
-			themeDisplay.getUserId(), activity.getReceiverUserId(),
+			activity.getUserId(), activity.getReceiverUserId(),
 			SocialRelationConstants.TYPE_BI_FRIEND)) {
 
 			return null;
