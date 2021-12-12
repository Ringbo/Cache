diff --git a/core/java/android/widget/RemoteViews.java b/core/java/android/widget/RemoteViews.java
index 8aef304..05ff151 100644
--- a/core/java/android/widget/RemoteViews.java
+++ b/core/java/android/widget/RemoteViews.java
@@ -2656,7 +2656,7 @@
         if (UserHandle.getUserId(applicationInfo.uid) != userId
                 || !applicationInfo.packageName.equals(packageName)) {
             try {
-                Context context = application.getApplicationContext().createPackageContextAsUser(
+                Context context = application.getBaseContext().createPackageContextAsUser(
                         packageName, 0, new UserHandle(userId));
                 applicationInfo = context.getApplicationInfo();
             } catch (NameNotFoundException nnfe) {
