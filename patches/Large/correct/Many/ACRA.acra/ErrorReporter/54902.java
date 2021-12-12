diff --git a/acra/src/main/java/org/acra/ErrorReporter.java b/acra/src/main/java/org/acra/ErrorReporter.java
index f43a29a..681a511 100644
--- a/acra/src/main/java/org/acra/ErrorReporter.java
+++ b/acra/src/main/java/org/acra/ErrorReporter.java
@@ -391,7 +391,7 @@
     private void checkReportsOnApplicationStart() {
 
         // Delete any old unsent reports if this is a newer version of the app than when we last started.
-    	final long lastVersionNr = prefs.getLong(ACRA.PREF_LAST_VERSION_NR, 0);
+    	final long lastVersionNr = prefs.getInt(ACRA.PREF_LAST_VERSION_NR, 0);
         final PackageManagerWrapper packageManagerWrapper = new PackageManagerWrapper(mContext);
         final PackageInfo packageInfo = packageManagerWrapper.getPackageInfo();
         final boolean newVersion = (packageInfo != null && packageInfo.versionCode > lastVersionNr);
