diff --git a/src/biz/bokhorst/xprivacy/XContentResolver.java b/src/biz/bokhorst/xprivacy/XContentResolver.java
index 2e8a812..5f25b1f 100644
--- a/src/biz/bokhorst/xprivacy/XContentResolver.java
+++ b/src/biz/bokhorst/xprivacy/XContentResolver.java
@@ -136,7 +136,7 @@
 			if (param.args.length > 0 && param.args[0] instanceof Uri) {
 				String uri = ((Uri) param.args[0]).toString();
 				if (isRestrictedExtra(param, uri))
-					param.setResult(new FileNotFoundException("XPrivacy"));
+					param.setThrowable(new FileNotFoundException("XPrivacy"));
 			}
 
 		} else if (mMethod == Methods.query) {
