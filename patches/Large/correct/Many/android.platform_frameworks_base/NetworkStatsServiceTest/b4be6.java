diff --git a/services/tests/servicestests/src/com/android/server/NetworkStatsServiceTest.java b/services/tests/servicestests/src/com/android/server/NetworkStatsServiceTest.java
index cdc4d78..ed74fdf 100644
--- a/services/tests/servicestests/src/com/android/server/NetworkStatsServiceTest.java
+++ b/services/tests/servicestests/src/com/android/server/NetworkStatsServiceTest.java
@@ -878,8 +878,7 @@
         mAlarmManager.remove(isA(PendingIntent.class));
         expectLastCall().anyTimes();
 
-        mAlarmManager.setInexactRepeating(
-                eq(AlarmManager.ELAPSED_REALTIME), anyLong(), anyLong(), isA(PendingIntent.class));
+        mAlarmManager.set(eq(AlarmManager.ELAPSED_REALTIME), anyLong(), anyLong(), isA(PendingIntent.class), false);
         expectLastCall().atLeastOnce();
 
         mNetManager.setGlobalAlert(anyLong());
