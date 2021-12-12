diff --git a/portlets/sample-struts-portlet/docroot/WEB-INF/src/com/liferay/samplestruts/struts/action/NestedAction.java b/portlets/sample-struts-portlet/docroot/WEB-INF/src/com/liferay/samplestruts/struts/action/NestedAction.java
index f9cc8d5..ef20149 100644
--- a/portlets/sample-struts-portlet/docroot/WEB-INF/src/com/liferay/samplestruts/struts/action/NestedAction.java
+++ b/portlets/sample-struts-portlet/docroot/WEB-INF/src/com/liferay/samplestruts/struts/action/NestedAction.java
@@ -36,11 +36,11 @@
 
 	@Override
 	public ActionForward execute(
-			ActionMapping mapping, ActionForm form, HttpServletRequest request,
-			HttpServletResponse response)
+			ActionMapping actionMapping, ActionForm actionForm,
+			HttpServletRequest request, HttpServletResponse response)
 		throws Exception {
 
-		NestedForm nestedForm = (NestedForm)form;
+		NestedForm nestedForm = (NestedForm)actionForm;
 
 		Collection<Book> books = nestedForm.getBooks();
 
@@ -52,7 +52,8 @@
 			}
 		}
 
-		return mapping.findForward("/sample_struts_portlet/nested_success");
+		return actionMapping.findForward(
+			"/sample_struts_portlet/nested_success");
 	}
 
 	private static Log _log = LogFactoryUtil.getLog(NestedAction.class);
