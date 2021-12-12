diff --git a/src/org/parosproxy/paros/extension/manualrequest/ManualRequestEditorDialog.java b/src/org/parosproxy/paros/extension/manualrequest/ManualRequestEditorDialog.java
index 11cb561..8cf69cf 100644
--- a/src/org/parosproxy/paros/extension/manualrequest/ManualRequestEditorDialog.java
+++ b/src/org/parosproxy/paros/extension/manualrequest/ManualRequestEditorDialog.java
@@ -241,7 +241,7 @@
 	 */
 	private HttpPanelResponse getResponsePanel() {
 		if (responsePanel == null) {
-			responsePanel = new HttpPanelResponse(true, extension, httpMessage);
+			responsePanel = new HttpPanelResponse(false, extension, httpMessage);
 		}
 		return responsePanel;
 	}
