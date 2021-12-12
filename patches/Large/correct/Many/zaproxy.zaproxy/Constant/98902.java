diff --git a/src/org/parosproxy/paros/Constant.java b/src/org/parosproxy/paros/Constant.java
index ff8b16e..7f9dad1 100644
--- a/src/org/parosproxy/paros/Constant.java
+++ b/src/org/parosproxy/paros/Constant.java
@@ -334,7 +334,7 @@
 	            
 	            if (ver == VERSION_TAG) {
 	            	// Nothing to do
-	            } else if (isDevBuild() || isDevBuild()) {
+	            } else if (isDevBuild() || isDailyBuild()) {
 	            	// Nothing to do
 	            } else {
 	            	// Backup the old one
