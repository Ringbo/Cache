diff --git a/server/src/main/java/com/metamx/druid/master/DruidMaster.java b/server/src/main/java/com/metamx/druid/master/DruidMaster.java
index fde2de3..6a019a6 100644
--- a/server/src/main/java/com/metamx/druid/master/DruidMaster.java
+++ b/server/src/main/java/com/metamx/druid/master/DruidMaster.java
@@ -95,7 +95,7 @@
 
   private final Map<String, LoadQueuePeon> loadManagementPeons;
   private final AtomicReference<LeaderLatch> leaderLatch;
-  private AtomicReference<MasterSegmentSettings> segmentSettingsAtomicReference;
+  private volatile AtomicReference<MasterSegmentSettings> segmentSettingsAtomicReference;
 
   public DruidMaster(
       DruidMasterConfig config,
@@ -467,7 +467,7 @@
         serverInventoryView.start();
 
         final List<Pair<? extends MasterRunnable, Duration>> masterRunnables = Lists.newArrayList();
-        segmentSettingsAtomicReference = configManager.watch(MasterSegmentSettings.CONFIG_KEY, MasterSegmentSettings.class,(new MasterSegmentSettings.Builder()).build());
+        segmentSettingsAtomicReference = configManager.watch(MasterSegmentSettings.CONFIG_KEY, MasterSegmentSettings.class,new MasterSegmentSettings.Builder().build());
         masterRunnables.add(Pair.of(new MasterComputeManagerRunnable(), config.getMasterPeriod()));
         if (indexingServiceClient != null) {
 
