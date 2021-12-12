diff --git a/src/org/geometerplus/android/fbreader/network/Util.java b/src/org/geometerplus/android/fbreader/network/Util.java
index a93411e..7ff2ea6 100644
--- a/src/org/geometerplus/android/fbreader/network/Util.java
+++ b/src/org/geometerplus/android/fbreader/network/Util.java
@@ -79,7 +79,7 @@
 		});
 	}
 
-	static Intent authorisationIntent(INetworkLink link, Activity activity, Class<? extends Activity> cls) {
+	public static Intent authorisationIntent(INetworkLink link, Activity activity, Class<? extends Activity> cls) {
 		final Intent intent = new Intent(activity, cls);
 		intent.putExtra(CATALOG_URL, link.getUrl(UrlInfo.Type.Catalog));
 		intent.putExtra(SIGNIN_URL, link.getUrl(UrlInfo.Type.SignIn));
