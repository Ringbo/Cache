diff --git a/src/biz/bokhorst/xprivacy/XWebView.java b/src/biz/bokhorst/xprivacy/XWebView.java
index 9bc40e6..e825b64 100644
--- a/src/biz/bokhorst/xprivacy/XWebView.java
+++ b/src/biz/bokhorst/xprivacy/XWebView.java
@@ -70,7 +70,7 @@
 		if (mMethod == Methods.WebView) {
 			if (param.args.length > 0) {
 				int uid = Binder.getCallingUid();
-				Context context = (Context) param.args[1];
+				Context context = (Context) param.args[0];
 				if (getRestricted(context, uid, true)) {
 					String ua = (String) PrivacyManager.getDefacedProp(Binder.getCallingUid(), "UA");
 					WebView webView = (WebView) param.thisObject;
