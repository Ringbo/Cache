diff --git a/domain/src/main/java/com/thoughtworks/go/domain/Pipeline.java b/domain/src/main/java/com/thoughtworks/go/domain/Pipeline.java
index 879729f..4299a89 100644
--- a/domain/src/main/java/com/thoughtworks/go/domain/Pipeline.java
+++ b/domain/src/main/java/com/thoughtworks/go/domain/Pipeline.java
@@ -50,7 +50,7 @@
         this(new Stages(stages));
         this.pipelineName = pipelineName;
         this.buildCause = buildCause;
-        this.pipelineLabel = PipelineLabel.create(labelTemplate, buildCause.getVariables().insecureVariablesHash());
+        this.pipelineLabel = PipelineLabel.create(labelTemplate);
     }
 
     public Pipeline(String pipelineName, String labelTemplate, BuildCause buildCause, EnvironmentVariables envVars, Stage... stages) {
