diff --git a/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/internal/portlet/action/ExportPageMVCActionCommand.java b/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/internal/portlet/action/ExportPageMVCActionCommand.java
index 795c9dd..b40387d 100644
--- a/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/internal/portlet/action/ExportPageMVCActionCommand.java
+++ b/modules/apps/collaboration/wiki/wiki-web/src/main/java/com/liferay/wiki/web/internal/portlet/action/ExportPageMVCActionCommand.java
@@ -124,7 +124,7 @@
 			actionResponse.setRenderParameter("mvcPath", "/null.jsp");
 		}
 		catch (Exception e) {
-			_log.error(e);
+			_log.error(e, e);
 
 			_portal.sendError(e, actionRequest, actionResponse);
 		}
