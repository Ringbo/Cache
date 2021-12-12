diff --git a/framework/src/org/apache/cordova/Storage.java b/framework/src/org/apache/cordova/Storage.java
index 59041cf..40521f6 100755
--- a/framework/src/org/apache/cordova/Storage.java
+++ b/framework/src/org/apache/cordova/Storage.java
@@ -141,7 +141,7 @@
 
         // If no database path, generate from application package
         if (this.path == null) {
-            this.path = this.ctx.getApplicationContext().getDir("database", Context.MODE_PRIVATE).getPath();
+			this.path = this.ctx.getActivity().getDir("database", Context.MODE_PRIVATE).getPath();
         }
 
         this.dbName = this.path + File.pathSeparator + db + ".db";
