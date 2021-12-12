diff --git a/modules/apps/collaboration/mentions/mentions-web/src/main/java/com/liferay/mentions/web/servlet/taglib/MentionsTopHeadDynamicInclude.java b/modules/apps/collaboration/mentions/mentions-web/src/main/java/com/liferay/mentions/web/servlet/taglib/MentionsTopHeadDynamicInclude.java
index f076b97..5ba3671 100644
--- a/modules/apps/collaboration/mentions/mentions-web/src/main/java/com/liferay/mentions/web/servlet/taglib/MentionsTopHeadDynamicInclude.java
+++ b/modules/apps/collaboration/mentions/mentions-web/src/main/java/com/liferay/mentions/web/servlet/taglib/MentionsTopHeadDynamicInclude.java
@@ -48,7 +48,7 @@
 
 		PrintWriter printWriter = response.getWriter();
 
-		StringBundler sb = new StringBundler(5);
+		StringBundler sb = new StringBundler(6);
 
 		sb.append("<link href=\"");
 		sb.append(themeDisplay.getPortalURL());
