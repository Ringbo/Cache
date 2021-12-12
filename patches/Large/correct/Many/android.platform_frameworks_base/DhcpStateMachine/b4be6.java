diff --git a/core/java/android/net/DhcpStateMachine.java b/core/java/android/net/DhcpStateMachine.java
index 1ebf393..5151a04 100644
--- a/core/java/android/net/DhcpStateMachine.java
+++ b/core/java/android/net/DhcpStateMachine.java
@@ -374,7 +374,7 @@
                 //Do it a bit earlier than half the lease duration time
                 //to beat the native DHCP client and avoid extra packets
                 //48% for one hour lease time = 29 minutes
-                mAlarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,
+                mAlarmManager.setExact(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                         SystemClock.elapsedRealtime() +
                         leaseDuration * 480, //in milliseconds
                         mDhcpRenewalIntent);
