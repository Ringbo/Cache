diff --git a/portlets/sample-struts-liferay-portlet/docroot/WEB-INF/src/com/liferay/samplestrutsliferay/struts/action/UnsubscribeAction.java b/portlets/sample-struts-liferay-portlet/docroot/WEB-INF/src/com/liferay/samplestrutsliferay/struts/action/UnsubscribeAction.java
index 84b23d5..392dedd 100644
--- a/portlets/sample-struts-liferay-portlet/docroot/WEB-INF/src/com/liferay/samplestrutsliferay/struts/action/UnsubscribeAction.java
+++ b/portlets/sample-struts-liferay-portlet/docroot/WEB-INF/src/com/liferay/samplestrutsliferay/struts/action/UnsubscribeAction.java
@@ -36,8 +36,9 @@
 
 	@Override
 	public void processAction(
-			ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
-			ActionRequest actionRequest, ActionResponse actionResponse)
+			ActionMapping actionMapping, ActionForm actionForm,
+			PortletConfig portletConfig, ActionRequest actionRequest,
+			ActionResponse actionResponse)
 		throws Exception {
 
 		setForward(
@@ -47,17 +48,18 @@
 
 	@Override
 	public ActionForward render(
-			ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
-			RenderRequest renderRequest, RenderResponse renderResponse)
+			ActionMapping actionMapping, ActionForm actionForm,
+			PortletConfig portletConfig, RenderRequest renderRequest,
+			RenderResponse renderResponse)
 		throws Exception {
 
-		UnsubscribeForm unsubscribeForm = (UnsubscribeForm)form;
+		UnsubscribeForm unsubscribeForm = (UnsubscribeForm)actionForm;
 
 		if (_log.isInfoEnabled()) {
 			_log.info(unsubscribeForm.toString());
 		}
 
-		return mapping.findForward(
+		return actionMapping.findForward(
 			"portlet.sample_struts_liferay_portlet.unsubscribe");
 	}
 
