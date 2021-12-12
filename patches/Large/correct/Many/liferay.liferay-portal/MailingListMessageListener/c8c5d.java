diff --git a/portal-impl/src/com/liferay/portlet/messageboards/messaging/MailingListMessageListener.java b/portal-impl/src/com/liferay/portlet/messageboards/messaging/MailingListMessageListener.java
index 0eb36dd..a342abf 100644
--- a/portal-impl/src/com/liferay/portlet/messageboards/messaging/MailingListMessageListener.java
+++ b/portal-impl/src/com/liferay/portlet/messageboards/messaging/MailingListMessageListener.java
@@ -262,7 +262,7 @@
 					}
 					catch (IOException ioe) {
 						if (_log.isWarnEnabled()) {
-							_log.error(ioe, ioe);
+							_log.warn(ioe, ioe);
 						}
 					}
 				}
