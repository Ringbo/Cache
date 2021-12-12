diff --git a/modules/apps/collaboration/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/internal/exportimport/data/handler/MBMessageStagedModelDataHandler.java b/modules/apps/collaboration/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/internal/exportimport/data/handler/MBMessageStagedModelDataHandler.java
index 1d87aff..de36ff1 100644
--- a/modules/apps/collaboration/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/internal/exportimport/data/handler/MBMessageStagedModelDataHandler.java
+++ b/modules/apps/collaboration/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/internal/exportimport/data/handler/MBMessageStagedModelDataHandler.java
@@ -442,7 +442,7 @@
 					}
 					catch (IOException ioe) {
 						if (_log.isWarnEnabled()) {
-							_log.error(ioe, ioe);
+							_log.warn(ioe, ioe);
 						}
 					}
 				}
