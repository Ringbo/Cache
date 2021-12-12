diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/GroovyPlugin.java b/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/GroovyPlugin.java
index 8a4b6a6..25b0738 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/GroovyPlugin.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/GroovyPlugin.java
@@ -52,7 +52,7 @@
 
         JavaPluginConvention convention = project.getConvention().getPlugin(JavaPluginConvention.class);
         SourceSet sourceSet = convention.getSourceSets().getByName(SourceSet.MAIN_SOURCE_SET_NAME);
-        groovyDoc.setClasspath(sourceSet.getClasses().plus(sourceSet.getCompileClasspath()));
+        groovyDoc.setClasspath(sourceSet.getOutput().plus(sourceSet.getCompileClasspath()));
 
         GroovySourceSet groovySourceSet = ((DynamicObjectAware) sourceSet).getConvention().getPlugin(GroovySourceSet.class);
         groovyDoc.setSource(groovySourceSet.getGroovy());
