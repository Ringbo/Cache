diff --git a/plugins/google-app-engine/source/com/intellij/appengine/server/instance/AppEngineRunConfigurationEditor.java b/plugins/google-app-engine/source/com/intellij/appengine/server/instance/AppEngineRunConfigurationEditor.java
index c18af53..20c40f1 100644
--- a/plugins/google-app-engine/source/com/intellij/appengine/server/instance/AppEngineRunConfigurationEditor.java
+++ b/plugins/google-app-engine/source/com/intellij/appengine/server/instance/AppEngineRunConfigurationEditor.java
@@ -47,10 +47,10 @@
     final Artifact selectedArtifact = getSelectedArtifact();
     if (!Comparing.equal(myLastSelectedArtifact, selectedArtifact)) {
       if (myLastSelectedArtifact != null) {
-        BuildArtifactsBeforeRunTaskProvider.setBuildArtifactBeforeRunOption(myMainPanel, myLastSelectedArtifact, false);
+        BuildArtifactsBeforeRunTaskProvider.setBuildArtifactBeforeRunOption(myMainPanel, myProject, myLastSelectedArtifact, false);
       }
       if (selectedArtifact != null) {
-        BuildArtifactsBeforeRunTaskProvider.setBuildArtifactBeforeRunOption(myMainPanel, selectedArtifact, true);
+        BuildArtifactsBeforeRunTaskProvider.setBuildArtifactBeforeRunOption(myMainPanel, myProject, selectedArtifact, true);
       }
       myLastSelectedArtifact = selectedArtifact;
     }
