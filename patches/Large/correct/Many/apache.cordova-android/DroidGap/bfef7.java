diff --git a/framework/src/com/phonegap/DroidGap.java b/framework/src/com/phonegap/DroidGap.java
index 336f162..dbc9f40 100755
--- a/framework/src/com/phonegap/DroidGap.java
+++ b/framework/src/com/phonegap/DroidGap.java
@@ -424,7 +424,7 @@
                 
                 // If loadingDialog property, then show the App loading dialog for first page of app
                 String loading = null;
-                if (me.urls.size() == 0) {
+                if (me.urls.size() == 1) {
                 	loading = me.getStringProperty("loadingDialog", null);
                 }
                 else {
