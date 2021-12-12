diff --git a/server/src/main/java/com/metamx/druid/coordination/ZkCoordinator.java b/server/src/main/java/com/metamx/druid/coordination/ZkCoordinator.java
index 1befc1d..0740be8 100644
--- a/server/src/main/java/com/metamx/druid/coordination/ZkCoordinator.java
+++ b/server/src/main/java/com/metamx/druid/coordination/ZkCoordinator.java
@@ -261,7 +261,7 @@
       announcer.unannounceSegment(segment);
     }
     catch (Exception e) {
-      log.makeAlert("Failed to remove segment")
+      log.makeAlert(e, "Failed to remove segment")
           .addData("segment", segment)
           .emit();
     }
