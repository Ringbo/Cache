diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/SignalClusterView.java b/packages/SystemUI/src/com/android/systemui/statusbar/SignalClusterView.java
index b3386ae..67be99e5 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/SignalClusterView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/SignalClusterView.java
@@ -632,7 +632,7 @@
                 DarkIconDispatcher.getDarkIntensity(mTintArea, mWifi, mDarkIntensity),
                 mWifi, mWifiDark);
         setTint(mWifiActivity,
-                StatusBarIconController.getTint(mTintArea, mWifiActivity, mIconTint));
+                DarkIconDispatcher.getTint(mTintArea, mWifiActivity, mIconTint));
         applyDarkIntensity(
                 DarkIconDispatcher.getDarkIntensity(mTintArea, mEthernet, mDarkIntensity),
                 mEthernet, mEthernetDark);
@@ -787,7 +787,7 @@
             setTint(mMobileRoaming, DarkIconDispatcher.getTint(tintArea, mMobileRoaming,
                     tint));
             setTint(mMobileActivity,
-                    StatusBarIconController.getTint(tintArea, mMobileActivity, tint));
+                    DarkIconDispatcher.getTint(tintArea, mMobileActivity, tint));
         }
     }
 }
