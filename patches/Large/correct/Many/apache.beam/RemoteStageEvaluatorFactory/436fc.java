diff --git a/runners/direct-java/src/main/java/org/apache/beam/runners/direct/portable/RemoteStageEvaluatorFactory.java b/runners/direct-java/src/main/java/org/apache/beam/runners/direct/portable/RemoteStageEvaluatorFactory.java
index b648205..ac96e8a 100644
--- a/runners/direct-java/src/main/java/org/apache/beam/runners/direct/portable/RemoteStageEvaluatorFactory.java
+++ b/runners/direct-java/src/main/java/org/apache/beam/runners/direct/portable/RemoteStageEvaluatorFactory.java
@@ -70,7 +70,7 @@
       StageBundleFactory<T> stageFactory = jobFactory.forStage(stage);
       bundle =
           stageFactory.getBundle(
-              BundleFactoryOutputRecieverFactory.create(
+              BundleFactoryOutputReceiverFactory.create(
                   bundleFactory, stage.getComponents(), outputs::add),
               StateRequestHandler.unsupported());
     }
