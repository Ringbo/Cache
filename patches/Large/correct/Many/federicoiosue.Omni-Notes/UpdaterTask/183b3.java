diff --git a/src/it/feio/android/omninotes/async/UpdaterTask.java b/src/it/feio/android/omninotes/async/UpdaterTask.java
index b0b1eed..09659b7 100644
--- a/src/it/feio/android/omninotes/async/UpdaterTask.java
+++ b/src/it/feio/android/omninotes/async/UpdaterTask.java
@@ -155,7 +155,7 @@
 	public String getAppData() {
 		StringBuilder sb = new StringBuilder();
 		
-		if (mActivity.get() != null) {
+		if (mActivity.get() != null && !mActivity.get().isFinishing()) {
 			packageName = mActivity.get().getApplicationContext().getPackageName();
 
 			try {
