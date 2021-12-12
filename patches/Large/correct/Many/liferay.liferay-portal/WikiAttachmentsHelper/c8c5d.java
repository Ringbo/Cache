diff --git a/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/internal/WikiAttachmentsHelper.java b/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/internal/WikiAttachmentsHelper.java
index d79b879..9a096fd 100644
--- a/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/internal/WikiAttachmentsHelper.java
+++ b/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/internal/WikiAttachmentsHelper.java
@@ -104,7 +104,7 @@
 					}
 					catch (IOException ioe) {
 						if (_log.isWarnEnabled()) {
-							_log.error(ioe, ioe);
+							_log.warn(ioe, ioe);
 						}
 					}
 				}
