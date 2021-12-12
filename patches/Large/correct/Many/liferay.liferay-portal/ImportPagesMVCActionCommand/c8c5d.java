diff --git a/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/internal/portlet/action/ImportPagesMVCActionCommand.java b/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/internal/portlet/action/ImportPagesMVCActionCommand.java
index d5310c4..320e9bc 100644
--- a/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/internal/portlet/action/ImportPagesMVCActionCommand.java
+++ b/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/internal/portlet/action/ImportPagesMVCActionCommand.java
@@ -124,7 +124,7 @@
 					}
 					catch (IOException ioe) {
 						if (_log.isWarnEnabled()) {
-							_log.error(ioe, ioe);
+							_log.warn(ioe, ioe);
 						}
 					}
 				}
