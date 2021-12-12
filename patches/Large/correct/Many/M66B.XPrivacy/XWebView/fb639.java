diff --git a/src/biz/bokhorst/xprivacy/XWebView.java b/src/biz/bokhorst/xprivacy/XWebView.java
index 5cbf72a..6398303 100644
--- a/src/biz/bokhorst/xprivacy/XWebView.java
+++ b/src/biz/bokhorst/xprivacy/XWebView.java
@@ -77,7 +77,7 @@
 	@Override
 	protected void after(MethodHookParam param) throws Throwable {
 		if (mMethod == Methods.WebView) {
-			if (param.args.length > 0) {
+			if (param.args.length > 0 && param.thisObject instanceof WebView) {
 				int uid = Binder.getCallingUid();
 				if (getRestricted(uid)) {
 					String ua = (String) PrivacyManager.getDefacedProp(Binder.getCallingUid(), "UA");
