diff --git a/src/main/java/org/deeplearning4j/rl4j/space/GymObservationSpace.java b/src/main/java/org/deeplearning4j/rl4j/space/GymObservationSpace.java
index b1363bd..5a12da2 100644
--- a/src/main/java/org/deeplearning4j/rl4j/space/GymObservationSpace.java
+++ b/src/main/java/org/deeplearning4j/rl4j/space/GymObservationSpace.java
@@ -48,7 +48,7 @@
 
         for (int i = 0; i < size; i++) {
             low.putScalar(i, lowJson.getDouble(i));
-            high.putScalar(i, lowJson.getDouble(i));
+            high.putScalar(i, highJson.getDouble(i));
         }
 
     }
