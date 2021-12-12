diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/NotificationData.java b/packages/SystemUI/src/com/android/systemui/statusbar/NotificationData.java
index 58844ad..c0691c1 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/NotificationData.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/NotificationData.java
@@ -438,7 +438,7 @@
                 final int N = mEntries.size();
                 for (int i = 0; i < N; i++) {
                     Entry entry = mEntries.valueAt(i);
-                    final StatusBarNotification oldSbn = entry.notification.clone();
+                    final StatusBarNotification oldSbn = entry.notification.cloneLight();
                     final String overrideGroupKey = getOverrideGroupKey(entry.key);
                     if (!Objects.equals(oldSbn.getOverrideGroupKey(), overrideGroupKey)) {
                         entry.notification.setOverrideGroupKey(overrideGroupKey);
