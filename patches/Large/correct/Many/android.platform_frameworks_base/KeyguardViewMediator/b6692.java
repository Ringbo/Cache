diff --git a/packages/SystemUI/src/com/android/systemui/keyguard/KeyguardViewMediator.java b/packages/SystemUI/src/com/android/systemui/keyguard/KeyguardViewMediator.java
index 312d3c5..707aad6 100644
--- a/packages/SystemUI/src/com/android/systemui/keyguard/KeyguardViewMediator.java
+++ b/packages/SystemUI/src/com/android/systemui/keyguard/KeyguardViewMediator.java
@@ -811,7 +811,7 @@
         intent.putExtra("seq", mDelayedShowingSequence);
         PendingIntent sender = PendingIntent.getBroadcast(mContext,
                 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
-        mAlarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, when, sender);
+        mAlarmManager.setExactAndAllowWhileIdle(AlarmManager.ELAPSED_REALTIME_WAKEUP, when, sender);
         if (DEBUG) Log.d(TAG, "setting alarm to turn off keyguard, seq = "
                          + mDelayedShowingSequence);
         doKeyguardLaterForChildProfilesLocked();
@@ -828,7 +828,8 @@
                 lockIntent.putExtra(Intent.EXTRA_USER_ID, info.id);
                 PendingIntent lockSender = PendingIntent.getBroadcast(
                         mContext, 0, lockIntent, PendingIntent.FLAG_CANCEL_CURRENT);
-                mAlarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, userWhen, lockSender);
+                mAlarmManager.setExactAndAllowWhileIdle(AlarmManager.ELAPSED_REALTIME_WAKEUP,
+                        userWhen, lockSender);
             }
         }
     }
