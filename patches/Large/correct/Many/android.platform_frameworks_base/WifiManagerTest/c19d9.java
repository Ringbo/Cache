diff --git a/wifi/tests/src/android/net/wifi/WifiManagerTest.java b/wifi/tests/src/android/net/wifi/WifiManagerTest.java
index ee6f12b..1364224 100644
--- a/wifi/tests/src/android/net/wifi/WifiManagerTest.java
+++ b/wifi/tests/src/android/net/wifi/WifiManagerTest.java
@@ -136,7 +136,7 @@
 
         assertEquals(mApConfig, callback.mRes.getWifiConfiguration());
         callback.mRes.close();
-        verify(mWifiService).stopLocalOnlyHotspot();
+        verify(mWifiService).stopLocalOnlyHotspot(TEST_PACKAGE_NAME);
     }
 
     /**
@@ -156,7 +156,7 @@
             assertEquals(mApConfig, res.getWifiConfiguration());
         }
 
-        verify(mWifiService).stopLocalOnlyHotspot();
+        verify(mWifiService).stopLocalOnlyHotspot(TEST_PACKAGE_NAME);
     }
 
     /**
@@ -547,7 +547,7 @@
                 anyString())).thenReturn(REQUEST_REGISTERED);
         mWifiManager.startLocalOnlyHotspot(callback, mHandler);
         mWifiManager.cancelLocalOnlyHotspotRequest();
-        verify(mWifiService).stopLocalOnlyHotspot();
+        verify(mWifiService).stopLocalOnlyHotspot(TEST_PACKAGE_NAME);
     }
 
     /**
@@ -569,7 +569,7 @@
                 anyString())).thenReturn(REQUEST_REGISTERED);
         mWifiManager.startLocalOnlyHotspot(callback, mHandler);
         mWifiManager.cancelLocalOnlyHotspotRequest();
-        verify(mWifiService).stopLocalOnlyHotspot();
+        verify(mWifiService).stopLocalOnlyHotspot(TEST_PACKAGE_NAME);
         mLooper.dispatchAll();
         assertEquals(ERROR_NOT_SET, callback.mFailureReason);
         assertFalse(callback.mOnStartedCalled);
@@ -593,7 +593,7 @@
         assertFalse(callback.mOnStoppedCalled);
         assertEquals(null, callback.mRes);
         mWifiManager.cancelLocalOnlyHotspotRequest();
-        verify(mWifiService, never()).stopLocalOnlyHotspot();
+        verify(mWifiService, never()).stopLocalOnlyHotspot(anyString());
     }
 
     /**
