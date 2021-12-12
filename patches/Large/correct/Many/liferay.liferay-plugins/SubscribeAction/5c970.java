diff --git a/portlets/sample-struts-liferay-portlet/docroot/WEB-INF/src/com/liferay/samplestrutsliferay/struts/action/SubscribeAction.java b/portlets/sample-struts-liferay-portlet/docroot/WEB-INF/src/com/liferay/samplestrutsliferay/struts/action/SubscribeAction.java
index 4d6227f..c3d58c4 100644
--- a/portlets/sample-struts-liferay-portlet/docroot/WEB-INF/src/com/liferay/samplestrutsliferay/struts/action/SubscribeAction.java
+++ b/portlets/sample-struts-liferay-portlet/docroot/WEB-INF/src/com/liferay/samplestrutsliferay/struts/action/SubscribeAction.java
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
@@ -46,17 +47,18 @@
 
 	@Override
 	public ActionForward render(
-			ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
-			RenderRequest renderRequest, RenderResponse renderResponse)
+			ActionMapping actionMapping, ActionForm actionForm,
+			PortletConfig portletConfig, RenderRequest renderRequest,
+			RenderResponse renderResponse)
 		throws Exception {
 
-		SubscribeForm subscribeForm = (SubscribeForm)form;
+		SubscribeForm subscribeForm = (SubscribeForm)actionForm;
 
 		if (_log.isInfoEnabled()) {
 			_log.info(subscribeForm.toString());
 		}
 
-		return mapping.findForward(
+		return actionMapping.findForward(
 			"portlet.sample_struts_liferay_portlet.subscribe");
 	}
 
