diff --git a/core/java/com/android/internal/notification/DemoContactNotificationScorer.java b/core/java/com/android/internal/notification/DemoContactNotificationScorer.java
index 081a371..62529e9 100644
--- a/core/java/com/android/internal/notification/DemoContactNotificationScorer.java
+++ b/core/java/com/android/internal/notification/DemoContactNotificationScorer.java
@@ -163,7 +163,7 @@
         if (DBG) Slog.v(TAG, "Initializing  " + getClass().getSimpleName() + ".");
         mContext = context;
         mEnabled = ENABLE_CONTACT_SCORER && 1 == Settings.Global.getInt(
-                mContext.getContentResolver(), SETTING_ENABLE_SCORER, 1);
+                mContext.getContentResolver(), SETTING_ENABLE_SCORER, 0);
     }
 
     @Override
