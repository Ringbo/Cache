diff --git a/portal-ejb/src/com/liferay/portlet/mailbox/util/MailUtil.java b/portal-ejb/src/com/liferay/portlet/mailbox/util/MailUtil.java
index 1152f9c..82e8748 100644
--- a/portal-ejb/src/com/liferay/portlet/mailbox/util/MailUtil.java
+++ b/portal-ejb/src/com/liferay/portlet/mailbox/util/MailUtil.java
@@ -354,8 +354,8 @@
 		for (int i = 0; i < folders.length; i++) {
 			if ((folders[i].getType() & IMAPFolder.HOLDS_MESSAGES) != 0) {
 				MailFolder mf = new MailFolder(
-					folders[i].getNewMessageCount(), folders[i].getName(),
-					folders[i].getMessageCount());
+					folders[i].getMessageCount(), folders[i].getName(),
+					folders[i].getNewMessageCount());
 
 				list.add(mf);
 			}
