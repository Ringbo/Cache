diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index 442005a..e08d80c 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -2142,7 +2142,7 @@
                     if (shortcutIntent != null) {
                         shortcutIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                         try {
-                            mContext.startActivity(shortcutIntent);
+                            mContext.startActivityAsUser(shortcutIntent, UserHandle.CURRENT);
                         } catch (ActivityNotFoundException ex) {
                             Slog.w(TAG, "Dropping shortcut key combination because "
                                     + "the activity to which it is registered was not found: "
@@ -2168,7 +2168,7 @@
                 if (shortcutIntent != null) {
                     shortcutIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                     try {
-                        mContext.startActivity(shortcutIntent);
+                        mContext.startActivityAsUser(shortcutIntent, UserHandle.CURRENT);
                     } catch (ActivityNotFoundException ex) {
                         Slog.w(TAG, "Dropping shortcut key combination because "
                                 + "the activity to which it is registered was not found: "
@@ -2186,7 +2186,7 @@
                 Intent intent = Intent.makeMainSelectorActivity(Intent.ACTION_MAIN, category);
                 intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                 try {
-                    mContext.startActivity(intent);
+                    mContext.startActivityAsUser(intent, UserHandle.CURRENT);
                 } catch (ActivityNotFoundException ex) {
                     Slog.w(TAG, "Dropping application launch key because "
                             + "the activity to which it is registered was not found: "
@@ -2333,7 +2333,7 @@
             if (searchManager != null) {
                 searchManager.stopSearch();
             }
-            mContext.startActivityAsUser(intent, new UserHandle(UserHandle.USER_CURRENT));
+            mContext.startActivityAsUser(intent, UserHandle.CURRENT);
         } catch (ActivityNotFoundException e) {
             Slog.w(TAG, "No activity to handle assist long press action.", e);
         }
@@ -2348,7 +2348,7 @@
                     | Intent.FLAG_ACTIVITY_SINGLE_TOP
                     | Intent.FLAG_ACTIVITY_CLEAR_TOP);
             try {
-                mContext.startActivityAsUser(intent, new UserHandle(UserHandle.USER_CURRENT));
+                mContext.startActivityAsUser(intent, UserHandle.CURRENT);
             } catch (ActivityNotFoundException e) {
                 Slog.w(TAG, "No activity to handle assist action.", e);
             }
