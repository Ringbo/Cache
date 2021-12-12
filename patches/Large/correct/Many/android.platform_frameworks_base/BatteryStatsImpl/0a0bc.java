diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index 3599e64..16e469e 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -119,7 +119,7 @@
     private static final int MAGIC = 0xBA757475; // 'BATSTATS'
 
     // Current on-disk Parcel version
-    private static final int VERSION = 162 + (USE_OLD_HISTORY ? 1000 : 0);
+    private static final int VERSION = 163 + (USE_OLD_HISTORY ? 1000 : 0);
 
     // Maximum number of items we will record in the history.
     private static final int MAX_HISTORY_ITEMS;
@@ -8038,6 +8038,7 @@
 
             /**
              * Number of times wakeup alarms have occurred for this app.
+             * On screen-off timebase starting in report v25.
              */
             ArrayMap<String, Counter> mWakeupAlarms = new ArrayMap<>();
 
@@ -8066,7 +8067,7 @@
                 mWakeupAlarms.clear();
                 for (int i=0; i<numWA; i++) {
                     String tag = in.readString();
-                    mWakeupAlarms.put(tag, new Counter(mBsi.mOnBatteryTimeBase, in));
+                    mWakeupAlarms.put(tag, new Counter(mBsi.mOnBatteryScreenOffTimeBase, in));
                 }
 
                 int numServs = in.readInt();
@@ -8105,7 +8106,7 @@
             public void noteWakeupAlarmLocked(String tag) {
                 Counter c = mWakeupAlarms.get(tag);
                 if (c == null) {
-                    c = new Counter(mBsi.mOnBatteryTimeBase);
+                    c = new Counter(mBsi.mOnBatteryScreenOffTimeBase);
                     mWakeupAlarms.put(tag, c);
                 }
                 c.stepAtomic();
@@ -11862,7 +11863,7 @@
                 p.mWakeupAlarms.clear();
                 for (int iwa=0; iwa<NWA; iwa++) {
                     String tag = in.readString();
-                    Counter c = new Counter(mOnBatteryTimeBase);
+                    Counter c = new Counter(mOnBatteryScreenOffTimeBase);
                     c.readSummaryFromParcelLocked(in);
                     p.mWakeupAlarms.put(tag, c);
                 }
