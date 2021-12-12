diff --git a/src/main/groovy/org/gradle/api/plugins/JavaPlugin.java b/src/main/groovy/org/gradle/api/plugins/JavaPlugin.java
index f9444d6..5c6bf72 100644
--- a/src/main/groovy/org/gradle/api/plugins/JavaPlugin.java
+++ b/src/main/groovy/org/gradle/api/plugins/JavaPlugin.java
@@ -152,7 +152,7 @@
         },
                 "testOutputDirectory", new ConventionValue() {
             public Object getValue(Convention convention, Task task) {
-                return java(convention).getClassesDir();
+                return java(convention).getTestClassesDir();
             }
         },
                 "classpathLibs", new ConventionValue() {
