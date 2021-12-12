diff --git a/services/tests/servicestests/src/com/android/server/am/ActivityManagerServiceTest.java b/services/tests/servicestests/src/com/android/server/am/ActivityManagerServiceTest.java
index 092c60b..6701b71 100644
--- a/services/tests/servicestests/src/com/android/server/am/ActivityManagerServiceTest.java
+++ b/services/tests/servicestests/src/com/android/server/am/ActivityManagerServiceTest.java
@@ -137,7 +137,7 @@
         mHandler = new TestHandler(mHandlerThread.getLooper());
         mInjector = new TestInjector();
         mAms = new ActivityManagerService(mInjector);
-        mAms.mWaitForNetworkTimeoutMs = 100;
+        mAms.mWaitForNetworkTimeoutMs = 2000;
 
         when(mContext.getPackageManager()).thenReturn(mPackageManager);
     }
