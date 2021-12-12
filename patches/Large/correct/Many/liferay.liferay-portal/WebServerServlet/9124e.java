diff --git a/portal-impl/src/com/liferay/portal/webserver/WebServerServlet.java b/portal-impl/src/com/liferay/portal/webserver/WebServerServlet.java
index 1cfdfb5..8c20a3c 100644
--- a/portal-impl/src/com/liferay/portal/webserver/WebServerServlet.java
+++ b/portal-impl/src/com/liferay/portal/webserver/WebServerServlet.java
@@ -858,9 +858,9 @@
 			fileEntry.getFileEntryId(), version);
 
 		if (fileEntry.getModel() instanceof DLFileEntry) {
-			LiferayFileEntry liferayFileEntry = (LiferayFileEntry)fileEntry;
+			DLFileEntry dlFileEntry = (DLFileEntry)fileEntry.getModel();
 
-			if (liferayFileEntry.isInTrash()) {
+			if (dlFileEntry.isInTrash()) {
 				int status = ParamUtil.getInteger(
 					request, "status", WorkflowConstants.STATUS_APPROVED);
 
