diff --git a/portlets/sample-struts-portlet/docroot/WEB-INF/src/com/liferay/samplestruts/struts/action/UploadAction.java b/portlets/sample-struts-portlet/docroot/WEB-INF/src/com/liferay/samplestruts/struts/action/UploadAction.java
index cbbe0dd..1d2390f 100644
--- a/portlets/sample-struts-portlet/docroot/WEB-INF/src/com/liferay/samplestruts/struts/action/UploadAction.java
+++ b/portlets/sample-struts-portlet/docroot/WEB-INF/src/com/liferay/samplestruts/struts/action/UploadAction.java
@@ -38,12 +38,12 @@
 
 	@Override
 	public ActionForward execute(
-			ActionMapping mapping, ActionForm form, HttpServletRequest request,
-			HttpServletResponse response)
+			ActionMapping actionMapping, ActionForm actionForm,
+			HttpServletRequest request, HttpServletResponse response)
 		throws Exception {
 
 		MultipartRequestHandler multipartRequestHandler =
-			form.getMultipartRequestHandler();
+			actionForm.getMultipartRequestHandler();
 
 		Hashtable<String, FormFile> fileElements =
 			multipartRequestHandler.getFileElements();
@@ -68,7 +68,8 @@
 
 		request.setAttribute("file_name", fileName);
 
-		return mapping.findForward("/sample_struts_portlet/upload_success");
+		return actionMapping.findForward(
+			"/sample_struts_portlet/upload_success");
 	}
 
 	private static Log _log = LogFactoryUtil.getLog(UploadAction.class);
