diff --git a/framework/src/com/phonegap/FileTransfer.java b/framework/src/com/phonegap/FileTransfer.java
index 25c2929..9ee6a20 100644
--- a/framework/src/com/phonegap/FileTransfer.java
+++ b/framework/src/com/phonegap/FileTransfer.java
@@ -364,7 +364,7 @@
     		return ctx.getContentResolver().openInputStream(uri);
     	}
     	else if (path.startsWith("file://")) {
-    	    return new FileInputStream(path.substring(6)); 
+    	    return new FileInputStream(path.substring(7)); 
     	}
     	else {
     		return new FileInputStream(path);
