diff --git a/modules/apps/collaboration/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/internal/pop/MessageListenerImpl.java b/modules/apps/collaboration/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/internal/pop/MessageListenerImpl.java
index 81a22df..a839444 100644
--- a/modules/apps/collaboration/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/internal/pop/MessageListenerImpl.java
+++ b/modules/apps/collaboration/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/internal/pop/MessageListenerImpl.java
@@ -257,7 +257,7 @@
 						}
 						catch (IOException ioe) {
 							if (_log.isWarnEnabled()) {
-								_log.error(ioe, ioe);
+								_log.warn(ioe, ioe);
 							}
 						}
 					}
