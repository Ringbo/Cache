diff --git a/modules/apps/social-private-messaging/social-private-messaging-web/src/main/java/com/liferay/social/privatemessaging/web/internal/portlet/PrivateMessagingPortlet.java b/modules/apps/social-private-messaging/social-private-messaging-web/src/main/java/com/liferay/social/privatemessaging/web/internal/portlet/PrivateMessagingPortlet.java
index 1e81160..ca940bf 100644
--- a/modules/apps/social-private-messaging/social-private-messaging-web/src/main/java/com/liferay/social/privatemessaging/web/internal/portlet/PrivateMessagingPortlet.java
+++ b/modules/apps/social-private-messaging/social-private-messaging-web/src/main/java/com/liferay/social/privatemessaging/web/internal/portlet/PrivateMessagingPortlet.java
@@ -288,7 +288,7 @@
 					}
 					catch (IOException ioe) {
 						if (_log.isWarnEnabled()) {
-							_log.error(ioe, ioe);
+							_log.warn(ioe, ioe);
 						}
 					}
 				}
