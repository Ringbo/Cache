diff --git a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/versions/VespaVersion.java b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/versions/VespaVersion.java
index 04ee176..ea89a70 100644
--- a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/versions/VespaVersion.java
+++ b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/versions/VespaVersion.java
@@ -145,7 +145,7 @@
                                                        ApplicationList failingOnThis,
                                                        ApplicationList productionOnThis,
                                                        CuratorDb curator) {
-        ApplicationList failingNonCanaries = failingOnThis.without(UpgradePolicy.canary).startedFailingOnVersionAfter(version);
+        ApplicationList failingNonCanaries = failingOnThis.without(UpgradePolicy.canary).startedFailingOn(version);
         ApplicationList productionNonCanaries = productionOnThis.without(UpgradePolicy.canary);
 
         if (productionNonCanaries.size() + failingNonCanaries.size() == 0 || curator.readIgnoreConfidence()) return false;
