diff --git a/src/main/java/org/acra/collector/CrashReportDataFactory.java b/src/main/java/org/acra/collector/CrashReportDataFactory.java
index 6e14ec7..bd81c0c 100644
--- a/src/main/java/org/acra/collector/CrashReportDataFactory.java
+++ b/src/main/java/org/acra/collector/CrashReportDataFactory.java
@@ -159,7 +159,7 @@
         collectors.add(new MemoryInfoCollector());
         collectors.add(new ReflectionCollector(context, config));
         collectors.add(new DisplayManagerCollector(context));
-        collectors.add(new CustomDataColletor(customParameters));
+        collectors.add(new CustomDataCollector(customParameters));
         collectors.add(new SharedPreferencesCollector(context, config, prefs));
         collectors.add(new DeviceFeaturesCollector(context));
         collectors.add(new SettingsCollector(context, config));
