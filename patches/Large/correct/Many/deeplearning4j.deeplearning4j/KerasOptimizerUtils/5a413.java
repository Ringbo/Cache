diff --git a/deeplearning4j/deeplearning4j-modelimport/src/main/java/org/deeplearning4j/nn/modelimport/keras/utils/KerasOptimizerUtils.java b/deeplearning4j/deeplearning4j-modelimport/src/main/java/org/deeplearning4j/nn/modelimport/keras/utils/KerasOptimizerUtils.java
index bda052e..7158f16 100644
--- a/deeplearning4j/deeplearning4j-modelimport/src/main/java/org/deeplearning4j/nn/modelimport/keras/utils/KerasOptimizerUtils.java
+++ b/deeplearning4j/deeplearning4j-modelimport/src/main/java/org/deeplearning4j/nn/modelimport/keras/utils/KerasOptimizerUtils.java
@@ -105,12 +105,13 @@
                 double beta1 = (double) optimizerParameters.get("beta_1");
                 double beta2 = (double) optimizerParameters.get("beta_2");
                 double epsilon = (double) optimizerParameters.get("epsilon");
-                double decay = (double) optimizerParameters.get("decay");
+                double scheduleDecay = (double) optimizerParameters.get("schedule_decay");
 
                 dl4jOptimizer = new Nadam.Builder()
                         .beta1(beta1).beta2(beta2)
                         .epsilon(epsilon).learningRate(lr)
-                        .learningRateSchedule(new InverseSchedule(ScheduleType.ITERATION, 1, decay, 1))
+                        .learningRateSchedule(new InverseSchedule(ScheduleType.ITERATION, 1,
+                                scheduleDecay, 1))
                         .build();
                 break;
             }
