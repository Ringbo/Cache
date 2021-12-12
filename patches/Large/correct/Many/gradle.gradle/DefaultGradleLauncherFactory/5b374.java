diff --git a/subprojects/core/src/main/groovy/org/gradle/initialization/DefaultGradleLauncherFactory.java b/subprojects/core/src/main/groovy/org/gradle/initialization/DefaultGradleLauncherFactory.java
index 5d76d0b..fe8b1b3 100644
--- a/subprojects/core/src/main/groovy/org/gradle/initialization/DefaultGradleLauncherFactory.java
+++ b/subprojects/core/src/main/groovy/org/gradle/initialization/DefaultGradleLauncherFactory.java
@@ -72,7 +72,7 @@
     }
 
     public StartParameter createStartParameter(String... commandLineArgs) {
-        if (commandLineConverter != null) {
+        if (commandLineConverter == null) {
             commandLineConverter = sharedServices.get(CommandLineConverter.class);
         }
         return commandLineConverter.convert(Arrays.asList(commandLineArgs));
