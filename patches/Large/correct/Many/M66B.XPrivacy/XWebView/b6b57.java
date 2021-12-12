diff --git a/src/biz/bokhorst/xprivacy/XWebView.java b/src/biz/bokhorst/xprivacy/XWebView.java
index 94edfbb..f1a9480 100644
--- a/src/biz/bokhorst/xprivacy/XWebView.java
+++ b/src/biz/bokhorst/xprivacy/XWebView.java
@@ -30,7 +30,7 @@
 	// frameworks/base/core/java/android/webkit/WebView.java
 	// http://developer.android.com/reference/android/webkit/WebView.html
 
-	// public synchronize String getUserAgentString()
+	// public synchronized void setUserAgent(int ua)
 	// public synchronized void setUserAgentString (String ua)
 	// frameworks/base/core/java/android/webkit/WebSettings.java
 	// http://developer.android.com/reference/android/webkit/WebSettings.html
@@ -69,7 +69,7 @@
 
 					// setUserAgent
 					try {
-						Method setUserAgent = clazzWebSettings.getDeclaredMethod("setUserAgent", String.class);
+						Method setUserAgent = clazzWebSettings.getDeclaredMethod("setUserAgent", Integer.class);
 						Util.log(this, Log.INFO, "Hooking " + setUserAgent.getName());
 						XposedBridge.hookMethod(setUserAgent, new XC_MethodHook() {
 							@Override
