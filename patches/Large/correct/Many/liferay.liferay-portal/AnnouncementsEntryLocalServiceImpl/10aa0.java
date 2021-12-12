diff --git a/portal-impl/src/com/liferay/portlet/announcements/service/impl/AnnouncementsEntryLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/announcements/service/impl/AnnouncementsEntryLocalServiceImpl.java
index f9b7782..3950541 100644
--- a/portal-impl/src/com/liferay/portlet/announcements/service/impl/AnnouncementsEntryLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/announcements/service/impl/AnnouncementsEntryLocalServiceImpl.java
@@ -543,8 +543,9 @@
 			"[$ENTRY_CONTENT$]", entry.getContent(), false);
 		subscriptionSender.setContextAttributes(
 			"[$ENTRY_ID$]", entry.getEntryId(), "[$ENTRY_TITLE$]",
-			entry.getTitle(), "[$ENTRY_TYPE$]", "[$ENTRY_URL$]", entry.getUrl(),
-			"[$PORTLET_NAME$]",
+			entry.getTitle(), "[$ENTRY_TYPE$]",
+			LanguageUtil.get(locale, entry.getType()), "[$ENTRY_URL$]",
+			entry.getUrl(), "[$PORTLET_NAME$]",
 			LanguageUtil.get(
 				locale, (entry.isAlert() ? "alert" : "announcement")));
 		subscriptionSender.setFrom(fromAddress, fromName);
