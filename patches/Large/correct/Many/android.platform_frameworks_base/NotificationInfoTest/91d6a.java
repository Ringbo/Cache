diff --git a/packages/SystemUI/tests/src/com/android/systemui/statusbar/NotificationInfoTest.java b/packages/SystemUI/tests/src/com/android/systemui/statusbar/NotificationInfoTest.java
index 08c580b..2bb7f3b 100644
--- a/packages/SystemUI/tests/src/com/android/systemui/statusbar/NotificationInfoTest.java
+++ b/packages/SystemUI/tests/src/com/android/systemui/statusbar/NotificationInfoTest.java
@@ -240,7 +240,7 @@
     public void testBindNotification_SettingsButtonReappersAfterSecondBind() throws Exception {
         mNotificationInfo.bindNotification(mMockPackageManager, mMockINotificationManager,
                 TEST_PACKAGE_NAME, Arrays.asList(mNotificationChannel),
-                null, null, null, null);
+                mNotificationChannel.getImportance(), mSbn, null, null, null, null, null);
         mNotificationInfo.bindNotification(mMockPackageManager, mMockINotificationManager,
                 TEST_PACKAGE_NAME, Arrays.asList(mNotificationChannel),
                 mNotificationChannel.getImportance(), mSbn,
