diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/JavaBasePlugin.java b/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/JavaBasePlugin.java
index fd1fe8b..1b225f2 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/JavaBasePlugin.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/JavaBasePlugin.java
@@ -70,7 +70,7 @@
             public void execute(final SourceSet sourceSet) {
                 final Project project = pluginConvention.getProject();
 
-                ConventionMapping outputConventionMapping = ((IConventionAware) sourceSet.getClasses()).getConventionMapping();
+                ConventionMapping outputConventionMapping = ((IConventionAware) sourceSet.getOutput()).getConventionMapping();
 
                 outputConventionMapping.map("classesDir", new ConventionValue() {
                     public Object getValue(Convention convention, IConventionAware conventionAwareObject) {
@@ -98,7 +98,7 @@
                 });
                 conventionMapping.map("destinationDir", new ConventionValue() {
                     public Object getValue(Convention convention, IConventionAware conventionAwareObject) {
-                        return sourceSet.getClasses().getResourcesDir();
+                        return sourceSet.getOutput().getResourcesDir();
                     }
                 });
 
@@ -132,7 +132,7 @@
         });
         conventionMapping.map("destinationDir", new ConventionValue() {
             public Object getValue(Convention convention, IConventionAware conventionAwareObject) {
-                return sourceSet.getClassesDir();
+                return sourceSet.getOutput().getClassesDir();
             }
         });
     }
