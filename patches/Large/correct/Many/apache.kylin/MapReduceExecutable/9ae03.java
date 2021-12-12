diff --git a/engine-mr/src/main/java/org/apache/kylin/engine/mr/common/MapReduceExecutable.java b/engine-mr/src/main/java/org/apache/kylin/engine/mr/common/MapReduceExecutable.java
index ae285cc..b26e40f 100755
--- a/engine-mr/src/main/java/org/apache/kylin/engine/mr/common/MapReduceExecutable.java
+++ b/engine-mr/src/main/java/org/apache/kylin/engine/mr/common/MapReduceExecutable.java
@@ -279,7 +279,7 @@
                 conf.set(entry.getKey(), entry.getValue());
             }
             if (conf.get("mapreduce.job.is-mem-hungry") != null
-                    && Boolean.valueOf(conf.get("mapreduce.job.is-mem-hungry"))) {
+                    && Boolean.parseBoolean(conf.get("mapreduce.job.is-mem-hungry"))) {
                 for (Map.Entry<String, String> entry : CubeManager.getInstance(config).getCube(cubeName).getConfig()
                         .getMemHungryConfigOverride().entrySet()) {
                     conf.set(entry.getKey(), entry.getValue());
