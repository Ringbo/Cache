diff --git a/src/org/geometerplus/android/fbreader/network/auth/WebAuthorisationScreen.java b/src/org/geometerplus/android/fbreader/network/auth/WebAuthorisationScreen.java
index c471235..6e268f8 100644
--- a/src/org/geometerplus/android/fbreader/network/auth/WebAuthorisationScreen.java
+++ b/src/org/geometerplus/android/fbreader/network/auth/WebAuthorisationScreen.java
@@ -73,7 +73,7 @@
 			@Override
 			public void onPageStarted(WebView view, String url, Bitmap favicon) {
 				setTitle(url);
-				if (url != null && url.equals(completeUrl)) {
+				if (url != null && url.startsWith(completeUrl)) {
 					final HashMap<String,String> cookies = new HashMap<String,String>();
 					final String cookieString = CookieManager.getInstance().getCookie(url);
 					if (cookieString != null) {
