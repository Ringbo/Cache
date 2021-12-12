diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/updater/AdaDeltaUpdater.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/updater/AdaDeltaUpdater.java
index 4e4f815..bfe5f0b 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/updater/AdaDeltaUpdater.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/updater/AdaDeltaUpdater.java
@@ -40,7 +40,7 @@
     protected static class AdaDeltaAggregator extends BaseUpdater.UpdaterAggregatorImpl {
         @Override
         public Updater getUpdater() {
-            return setUpdaterState(new SgdUpdater());
+            return setUpdaterState(new AdaDeltaUpdater());
         }
     }
 }
