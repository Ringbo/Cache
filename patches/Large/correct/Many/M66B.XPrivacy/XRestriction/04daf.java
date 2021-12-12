diff --git a/src/biz/bokhorst/xprivacy/XRestriction.java b/src/biz/bokhorst/xprivacy/XRestriction.java
index 3142427..ce96e05 100644
--- a/src/biz/bokhorst/xprivacy/XRestriction.java
+++ b/src/biz/bokhorst/xprivacy/XRestriction.java
@@ -136,14 +136,14 @@
 			if (context == null) {
 				XUtil.log(hook, Log.WARN, "context is null");
 				XUtil.logStack(hook);
-				return true;
+				return false;
 			}
 
 			// Check uid
 			if (uid == 0) {
 				XUtil.log(hook, Log.WARN, "uid=0");
 				XUtil.logStack(hook);
-				return true;
+				return false;
 			}
 
 			// Get content resolver
@@ -151,7 +151,7 @@
 			if (contentResolver == null) {
 				XUtil.log(hook, Log.WARN, "contentResolver is null");
 				XUtil.logStack(hook);
-				return true;
+				return false;
 			}
 
 			// Query restriction
@@ -159,7 +159,7 @@
 					new String[] { Integer.toString(uid), Boolean.toString(usage) }, null);
 			if (cursor == null) {
 				XUtil.log(hook, Log.WARN, "cursor is null");
-				return true;
+				return false;
 			}
 
 			// Get restriction
