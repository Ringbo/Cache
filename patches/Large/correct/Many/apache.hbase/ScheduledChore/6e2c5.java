diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/ScheduledChore.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/ScheduledChore.java
index 538b390..dd98d26 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/ScheduledChore.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/ScheduledChore.java
@@ -228,7 +228,7 @@
         && getTimeBetweenRuns() > getMaximumAllowedTimeBetweenRuns();
   }
 
-  private synchronized double getMaximumAllowedTimeBetweenRuns() {
+  private double getMaximumAllowedTimeBetweenRuns() {
     // Threshold used to determine if the Chore's current run started too late
     return 1.5 * period;
   }
@@ -268,23 +268,23 @@
     choreServicer = null;
   }
 
-  public synchronized String getName() {
+  public String getName() {
     return name;
   }
 
-  public synchronized Stoppable getStopper() {
+  public Stoppable getStopper() {
     return stopper;
   }
 
-  public synchronized int getPeriod() {
+  public int getPeriod() {
     return period;
   }
 
-  public synchronized long getInitialDelay() {
+  public long getInitialDelay() {
     return initialDelay;
   }
 
-  public final synchronized TimeUnit getTimeUnit() {
+  public TimeUnit getTimeUnit() {
     return timeUnit;
   }
 
