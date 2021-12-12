diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/StatusBarIconView.java b/packages/SystemUI/src/com/android/systemui/statusbar/StatusBarIconView.java
index ce0163e..bc33b30 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/StatusBarIconView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/StatusBarIconView.java
@@ -328,7 +328,7 @@
         Notification.Builder builder = Notification.Builder.recoverBuilder(c, n);
         String appName = builder.loadHeaderAppName();
 
-        CharSequence title = n.extras.getString(Notification.EXTRA_TITLE);
+        CharSequence title = n.extras.getCharSequence(Notification.EXTRA_TITLE);
         CharSequence ticker = n.tickerText;
 
         CharSequence desc = !TextUtils.isEmpty(ticker) ? ticker
