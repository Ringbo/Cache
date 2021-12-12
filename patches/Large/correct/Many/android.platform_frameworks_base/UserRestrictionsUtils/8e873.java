diff --git a/services/core/java/com/android/server/pm/UserRestrictionsUtils.java b/services/core/java/com/android/server/pm/UserRestrictionsUtils.java
index f57f75f..4b355de62 100644
--- a/services/core/java/com/android/server/pm/UserRestrictionsUtils.java
+++ b/services/core/java/com/android/server/pm/UserRestrictionsUtils.java
@@ -155,7 +155,7 @@
      */
     public static boolean isValidRestriction(@NonNull String restriction) {
         if (!USER_RESTRICTIONS.contains(restriction)) {
-            Slog.wtf(TAG, "Unknown restriction: " + restriction);
+            Slog.e(TAG, "Unknown restriction: " + restriction);
             return false;
         }
         return true;
