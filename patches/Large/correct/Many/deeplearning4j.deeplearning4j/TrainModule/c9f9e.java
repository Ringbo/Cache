diff --git a/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModule.java b/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModule.java
index 1b001bc..55b73fa 100644
--- a/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModule.java
+++ b/deeplearning4j-ui-parent/deeplearning4j-play/src/main/java/org/deeplearning4j/ui/module/train/TrainModule.java
@@ -468,9 +468,6 @@
         mmRatioMap.put("layerParamNames", meanMagnitudes.getSecond().keySet());
         mmRatioMap.put("iterCounts", meanMagnitudes.getFirst());
         mmRatioMap.put("ratios", meanMagnitudes.getSecond());
-//        for (Map.Entry<String, List<Double>> entry : meanMagnitudes.getSecond().entrySet()) {
-//            mmRatioMap.put(entry.getKey(), entry.getValue());
-//        }
         result.put("meanMagRatio", mmRatioMap);
 
         //Get activations line chart for layer
@@ -802,7 +799,7 @@
         if (!(p instanceof StatsReport)) return null;
         StatsReport sr = (StatsReport) p;
 
-        String layerName = gi.getVertexNames().get(layerIdx);
+        String layerName = gi.getOriginalVertexName().get(layerIdx);
 
         Map<String, Histogram> map = sr.getHistograms(statsType);
 
