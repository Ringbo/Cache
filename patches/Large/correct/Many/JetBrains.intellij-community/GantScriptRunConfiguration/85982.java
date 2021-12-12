diff --git a/plugins/groovy/src/org/jetbrains/plugins/gant/runner/GantScriptRunConfiguration.java b/plugins/groovy/src/org/jetbrains/plugins/gant/runner/GantScriptRunConfiguration.java
index b89a564..984f96d 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/gant/runner/GantScriptRunConfiguration.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/gant/runner/GantScriptRunConfiguration.java
@@ -220,7 +220,7 @@
                                ExecutionBundle.message("error.running.configuration.with.error.error.message", getName(),
                                                        "Groovy is not configured"), ExecutionBundle.message("run.error.message.title"));
 
-      int result = Messages.showOkCancelDialog(GroovyBundle.message("groovy.configure.facet.question.text"),
+      int result = Messages.showOkCancelDialog(GroovyBundle.message("groovy.configure.facet.question.text", module.getName()),
                                                GroovyBundle.message("groovy.configure.facet.question"), GroovyIcons.GROOVY_ICON_32x32);
       if (result == 0) {
         ModulesConfigurator.showDialog(module.getProject(), module.getName(), ClasspathEditor.NAME, false);
