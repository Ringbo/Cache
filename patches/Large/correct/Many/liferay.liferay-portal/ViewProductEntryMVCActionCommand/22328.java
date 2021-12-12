diff --git a/portal-impl/src/com/liferay/portlet/softwarecatalog/action/ViewProductEntryMVCActionCommand.java b/portal-impl/src/com/liferay/portlet/softwarecatalog/action/ViewProductEntryMVCActionCommand.java
index a779471..6296e6a 100644
--- a/portal-impl/src/com/liferay/portlet/softwarecatalog/action/ViewProductEntryMVCActionCommand.java
+++ b/portal-impl/src/com/liferay/portlet/softwarecatalog/action/ViewProductEntryMVCActionCommand.java
@@ -44,10 +44,10 @@
 			ActionRequest actionRequest, ActionResponse actionResponse)
 		throws Exception {
 
-		ActionUtil.getProductEntry(renderRequest);
+		ActionUtil.getProductEntry(actionRequest);
 
 		SCProductEntry productEntry =
-			(SCProductEntry)renderRequest.getAttribute(
+			(SCProductEntry)actionRequest.getAttribute(
 				WebKeys.SOFTWARE_CATALOG_PRODUCT_ENTRY);
 
 		if (productEntry == null) {
