diff --git a/subprojects/ide/src/main/java/org/gradle/plugins/ide/idea/IdeaPlugin.java b/subprojects/ide/src/main/java/org/gradle/plugins/ide/idea/IdeaPlugin.java
index 9539e3c..b027b70 100644
--- a/subprojects/ide/src/main/java/org/gradle/plugins/ide/idea/IdeaPlugin.java
+++ b/subprojects/ide/src/main/java/org/gradle/plugins/ide/idea/IdeaPlugin.java
@@ -130,7 +130,7 @@
         getCleanTask().configure(withDescription("Cleans IDEA project files (IML, IPR)"));
 
         ideaModel = project.getObjects().newInstance(IdeaModel.class);
-        project.getExtensions().add("idea", ideaModel);
+        project.getExtensions().add(IdeaModel.class, "idea", ideaModel);
 
         configureIdeaWorkspace(project);
         configureIdeaProject(project);
