diff --git a/services/core/java/com/android/server/notification/EventConditionProvider.java b/services/core/java/com/android/server/notification/EventConditionProvider.java
index 88ef366..a4d5bce 100644
--- a/services/core/java/com/android/server/notification/EventConditionProvider.java
+++ b/services/core/java/com/android/server/notification/EventConditionProvider.java
@@ -176,7 +176,7 @@
         }
         mTrackers.clear();
         for (UserHandle user : UserManager.get(mContext).getUserProfiles()) {
-            final Context context = user.isOwner() ? mContext : getContextForUser(mContext, user);
+            final Context context = user.isSystem() ? mContext : getContextForUser(mContext, user);
             if (context == null) {
                 Slog.w(TAG, "Unable to create context for user " + user.getIdentifier());
                 continue;
