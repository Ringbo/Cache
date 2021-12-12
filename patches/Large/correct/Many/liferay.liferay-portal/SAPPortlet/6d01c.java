diff --git a/modules/apps/service-access-policy/service-access-policy-web/src/com/liferay/service/access/policy/web/portlet/SAPPortlet.java b/modules/apps/service-access-policy/service-access-policy-web/src/com/liferay/service/access/policy/web/portlet/SAPPortlet.java
index a88c0e7..70eec11 100644
--- a/modules/apps/service-access-policy/service-access-policy-web/src/com/liferay/service/access/policy/web/portlet/SAPPortlet.java
+++ b/modules/apps/service-access-policy/service-access-policy-web/src/com/liferay/service/access/policy/web/portlet/SAPPortlet.java
@@ -159,7 +159,7 @@
 		writer.write(jsonArray.toString());
 	}
 
-	public void updateSACPEntry(
+	public void updateSAPEntry(
 			ActionRequest actionRequest, ActionResponse actionResponse)
 		throws Exception {
 
@@ -237,6 +237,6 @@
 	}
 
 	private JSONWebServiceActionsManager _jsonWebServiceActionsManager;
-	private SACPEntryService _sacpEntryService;
+	private SAPEntryService _sapEntryService;
 
 }
\ No newline at end of file
