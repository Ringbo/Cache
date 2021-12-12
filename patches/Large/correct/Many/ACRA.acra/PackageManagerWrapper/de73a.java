diff --git a/acra/src/main/java/org/acra/util/PackageManagerWrapper.java b/acra/src/main/java/org/acra/util/PackageManagerWrapper.java
index d8184b8..2de8117 100644
--- a/acra/src/main/java/org/acra/util/PackageManagerWrapper.java
+++ b/acra/src/main/java/org/acra/util/PackageManagerWrapper.java
@@ -45,7 +45,7 @@
 
         try {
             return pm.checkPermission(permission, context.getPackageName()) == PackageManager.PERMISSION_GRANTED;
-        } catch (RuntimeException e) {
+        } catch (Throwable e) {
             // To catch RuntimeException("Package manager has died") that can occur on some version of Android,
             // when the remote PackageManager is unavailable. I suspect this sometimes occurs when the App is being reinstalled.
             return false;
@@ -67,7 +67,7 @@
         } catch (PackageManager.NameNotFoundException e) {
             ACRA.log.w(LOG_TAG, "Failed to find PackageInfo for current App : " + context.getPackageName());
             return null;
-        } catch (RuntimeException e) {
+        } catch (Throwable e) {
             // To catch RuntimeException("Package manager has died") that can occur on some version of Android,
             // when the remote PackageManager is unavailable. I suspect this sometimes occurs when the App is being reinstalled.
             return null;
