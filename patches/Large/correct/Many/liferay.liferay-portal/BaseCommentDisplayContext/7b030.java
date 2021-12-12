diff --git a/portal-impl/src/com/liferay/portal/comment/display/context/BaseCommentDisplayContext.java b/portal-impl/src/com/liferay/portal/comment/display/context/BaseCommentDisplayContext.java
index 47ab70e..5f9f656 100644
--- a/portal-impl/src/com/liferay/portal/comment/display/context/BaseCommentDisplayContext.java
+++ b/portal-impl/src/com/liferay/portal/comment/display/context/BaseCommentDisplayContext.java
@@ -31,7 +31,7 @@
 
 		Group group = themeDisplay.getSiteGroup();
 
-		if (group.isStagingGroup()) {
+		if (group.isStagingGroup() || group.isStagedRemotely()) {
 			return false;
 		}
 
