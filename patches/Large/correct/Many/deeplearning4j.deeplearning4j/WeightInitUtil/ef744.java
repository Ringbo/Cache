diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/weights/WeightInitUtil.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/weights/WeightInitUtil.java
index 62385a3..fc28d88 100755
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/weights/WeightInitUtil.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/weights/WeightInitUtil.java
@@ -87,7 +87,7 @@
                 ret = Nd4j.rand(shape, Nd4j.getDistributions().createUniform(-a, a));
                 break;
             case XAVIER:
-                ret = Nd4j.randn(order, shape).divi(FastMath.sqrt(2.0 / (fanIn + fanOut)));
+                ret = Nd4j.randn(order, shape).muli(FastMath.sqrt(2.0 / (fanIn + fanOut)));
                 break;
             case VI:
             case XAVIER_UNIFORM:
