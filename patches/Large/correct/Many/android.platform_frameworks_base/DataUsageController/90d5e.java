diff --git a/packages/SettingsLib/src/com/android/settingslib/net/DataUsageController.java b/packages/SettingsLib/src/com/android/settingslib/net/DataUsageController.java
index f7aa297..3332193 100644
--- a/packages/SettingsLib/src/com/android/settingslib/net/DataUsageController.java
+++ b/packages/SettingsLib/src/com/android/settingslib/net/DataUsageController.java
@@ -134,7 +134,7 @@
             final NetworkStatsHistory history = session.getHistoryForNetwork(template, FIELDS);
             final long now = System.currentTimeMillis();
             final long start, end;
-            if (policy != null) {
+            if (policy != null && policy.hasCycle()) {
                 final Pair<ZonedDateTime, ZonedDateTime> cycle = NetworkPolicyManager
                         .cycleIterator(policy).next();
                 start = cycle.first.toInstant().toEpochMilli();
