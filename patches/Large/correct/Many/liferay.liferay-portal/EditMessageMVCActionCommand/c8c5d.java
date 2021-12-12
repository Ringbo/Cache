diff --git a/modules/apps/collaboration/message-boards/message-boards-web/src/main/java/com/liferay/message/boards/web/internal/portlet/action/EditMessageMVCActionCommand.java b/modules/apps/collaboration/message-boards/message-boards-web/src/main/java/com/liferay/message/boards/web/internal/portlet/action/EditMessageMVCActionCommand.java
index 4bc1656..3d5ab93 100644
--- a/modules/apps/collaboration/message-boards/message-boards-web/src/main/java/com/liferay/message/boards/web/internal/portlet/action/EditMessageMVCActionCommand.java
+++ b/modules/apps/collaboration/message-boards/message-boards-web/src/main/java/com/liferay/message/boards/web/internal/portlet/action/EditMessageMVCActionCommand.java
@@ -548,7 +548,7 @@
 					}
 					catch (IOException ioe) {
 						if (_log.isWarnEnabled()) {
-							_log.error(ioe, ioe);
+							_log.warn(ioe, ioe);
 						}
 					}
 				}
