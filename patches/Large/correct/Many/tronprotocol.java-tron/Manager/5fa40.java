diff --git a/src/main/java/org/tron/core/db/Manager.java b/src/main/java/org/tron/core/db/Manager.java
index 5ea0150..2f5626f 100644
--- a/src/main/java/org/tron/core/db/Manager.java
+++ b/src/main/java/org/tron/core/db/Manager.java
@@ -212,7 +212,7 @@
   @PostConstruct
   public void initOther() {
     revokingStore = RevokingStore.getInstance();
-    revokingStore.enable();
+    revokingStore.disable();
     this.setWitnessScheduleStore(WitnessScheduleStore.create("witness_schedule"));
     this.setWitnessController(WitnessController.createInstance(this));
     this.setBlockIndexStore(BlockIndexStore.create("block-index"));
