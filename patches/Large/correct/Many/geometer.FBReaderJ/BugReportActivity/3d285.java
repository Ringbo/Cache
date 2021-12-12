diff --git a/platform/android/src/org/geometerplus/zlibrary/ui/android/library/BugReportActivity.java b/platform/android/src/org/geometerplus/zlibrary/ui/android/library/BugReportActivity.java
index 71c707b..f5acfce 100644
--- a/platform/android/src/org/geometerplus/zlibrary/ui/android/library/BugReportActivity.java
+++ b/platform/android/src/org/geometerplus/zlibrary/ui/android/library/BugReportActivity.java
@@ -41,7 +41,7 @@
 		reportTextView.setClickable(false);
 		reportTextView.setLongClickable(false);
 
-		final String versionName = ZLibrary.Instance().getVersionName();
+		final String versionName = ZLAndroidLibrary.Instance().getVersionName();
 		reportTextView.append("FBReader " + versionName + " has been crached, sorry. You can help to fix this bug by sending the report below to FBReader developers. The report will be sent by e-mail. Thank you in advance!\n\n");
 		reportTextView.append(stackTrace);
 
