diff --git a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/rootcause/impl/RCAFrameworkRunner.java b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/rootcause/impl/RCAFrameworkRunner.java
index 4a7b725..cd11561 100644
--- a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/rootcause/impl/RCAFrameworkRunner.java
+++ b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/rootcause/impl/RCAFrameworkRunner.java
@@ -172,7 +172,7 @@
     if(cmd.hasOption(CLI_TIME_START))
       windowSize = windowEnd - ISO8601.parseDateTime(cmd.getOptionValue(CLI_TIME_START)).getMillis();
     else if(cmd.hasOption(CLI_WINDOW_SIZE))
-      windowEnd = Long.parseLong(cmd.getOptionValue(CLI_WINDOW_SIZE)) * DAY_IN_MS;
+      windowSize = Long.parseLong(cmd.getOptionValue(CLI_WINDOW_SIZE)) * DAY_IN_MS;
 
     long baselineOffset = 0;
     if(cmd.hasOption(CLI_BASELINE_OFFSET))
