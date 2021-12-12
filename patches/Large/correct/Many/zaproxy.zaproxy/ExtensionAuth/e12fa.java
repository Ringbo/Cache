diff --git a/src/org/zaproxy/zap/extension/auth/ExtensionAuth.java b/src/org/zaproxy/zap/extension/auth/ExtensionAuth.java
index e53971d..f755d84 100644
--- a/src/org/zaproxy/zap/extension/auth/ExtensionAuth.java
+++ b/src/org/zaproxy/zap/extension/auth/ExtensionAuth.java
@@ -378,8 +378,9 @@
 				method = HttpRequestHeader.POST;
 			}
 			URI uri = new URI(url, true);
+			// Note the findNode just checks the parameter names, not their values
 			SiteNode sn = Model.getSingleton().getSession().getSiteTree().findNode(uri, method, postData);
-			if (sn != null) {
+			if (sn != null && sn.getHistoryReference().getHttpMessage().getRequestBody().toString().equals(postData)) {
 				this.setLoginRequest(contextId, sn);
 			} else {
 				// Havnt visited this node before, not a problem
@@ -439,8 +440,9 @@
 				method = HttpRequestHeader.POST;
 			}
 			URI uri = new URI(url, true);
+			// Note the findNode just checks the parameter names, not their values
 			SiteNode sn = Model.getSingleton().getSession().getSiteTree().findNode(uri, method, postData);
-			if (sn != null) {
+			if (sn != null && sn.getHistoryReference().getHttpMessage().getRequestBody().toString().equals(postData)) {
 				this.setLogoutRequest(contextId, sn);
 			} else {
 				// Havnt visited this node before, not a problem
@@ -506,7 +508,8 @@
 
 	@Override
 	public void onHttpResponseReceive(HttpMessage msg, int initiator) {
-		if (! reauthenticate || msg.getResponseBody() == null || msg.getRequestHeader().isImage() || initiator != HttpSender.ACTIVE_SCANNER_INITIATOR) {
+		if (! reauthenticate || msg.getResponseBody() == null || msg.getRequestHeader().isImage() || 
+				(initiator == HttpSender.AUTHENTICATION_INITIATOR)) {
 			// Not relevant
 			return;
 		}
