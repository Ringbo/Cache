diff --git a/portal-impl/src/com/liferay/portlet/journal/util/JournalUtil.java b/portal-impl/src/com/liferay/portlet/journal/util/JournalUtil.java
index db99cbc..9c93fbc 100644
--- a/portal-impl/src/com/liferay/portlet/journal/util/JournalUtil.java
+++ b/portal-impl/src/com/liferay/portlet/journal/util/JournalUtil.java
@@ -580,7 +580,7 @@
 
 		if (layout == null) {
 			layout = LayoutLocalServiceUtil.fetchLayoutByUuidAndGroupId(
-				layoutUuid, groupId, false);
+				layoutUuid, groupId, true);
 		}
 
 		return layout;
