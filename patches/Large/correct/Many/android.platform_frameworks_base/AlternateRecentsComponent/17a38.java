diff --git a/packages/SystemUI/src/com/android/systemui/recents/AlternateRecentsComponent.java b/packages/SystemUI/src/com/android/systemui/recents/AlternateRecentsComponent.java
index 591149c..cbcacc4 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/AlternateRecentsComponent.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/AlternateRecentsComponent.java
@@ -133,7 +133,7 @@
                 intent.setPackage(mContext.getPackageName());
                 intent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT);
                 intent.putExtra(RecentsActivity.EXTRA_TRIGGERED_FROM_ALT_TAB, triggeredFromAltTab);
-                mContext.sendBroadcast(intent);
+                mContext.sendBroadcastAsUser(intent, UserHandle.CURRENT);
             }
         }
     }
@@ -222,7 +222,7 @@
             Intent intent = new Intent(RecentsActivity.ACTION_TOGGLE_RECENTS_ACTIVITY);
             intent.setPackage(mContext.getPackageName());
             intent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT);
-            mContext.sendBroadcast(intent);
+            mContext.sendBroadcastAsUser(intent, UserHandle.CURRENT);
             mLastToggleTime = System.currentTimeMillis();
             return;
         } else {
@@ -444,7 +444,7 @@
             Intent intent = new Intent(RecentsActivity.ACTION_START_ENTER_ANIMATION);
             intent.setPackage(mContext.getPackageName());
             intent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT);
-            mContext.sendBroadcast(intent);
+            mContext.sendBroadcastAsUser(intent, UserHandle.CURRENT);
             mStartAnimationTriggered = true;
         }
     }
