diff --git a/services/core/java/com/android/server/BluetoothManagerService.java b/services/core/java/com/android/server/BluetoothManagerService.java
index 50bd544..d5c4a41 100644
--- a/services/core/java/com/android/server/BluetoothManagerService.java
+++ b/services/core/java/com/android/server/BluetoothManagerService.java
@@ -273,7 +273,8 @@
             sysUiUid = mContext.getPackageManager().getPackageUid("com.android.systemui",
                     UserHandle.USER_OWNER);
         } catch (PackageManager.NameNotFoundException e) {
-            Log.wtf(TAG, "Unable to resolve SystemUI's UID.", e);
+            // Some platforms, such as wearables do not have a system ui.
+            Log.w(TAG, "Unable to resolve SystemUI's UID.", e);
         }
         mSystemUiUid = sysUiUid;
     }
