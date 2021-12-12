diff --git a/modules/apps/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/service/impl/MBMessageLocalServiceImpl.java b/modules/apps/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/service/impl/MBMessageLocalServiceImpl.java
index 1c15728..543652a 100644
--- a/modules/apps/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/service/impl/MBMessageLocalServiceImpl.java
+++ b/modules/apps/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/service/impl/MBMessageLocalServiceImpl.java
@@ -2008,7 +2008,7 @@
 	}
 
 	protected String getBody(String subject, String body, String format) {
-		if (Validator.isNull(body)) {
+		if (Validator.isBlank(body)) {
 			if (StringUtil.equals(format, "html")) {
 				return HtmlUtil.escape(subject);
 			}
