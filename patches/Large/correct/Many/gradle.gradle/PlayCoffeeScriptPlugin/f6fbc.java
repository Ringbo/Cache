diff --git a/subprojects/platform-play/src/main/java/org/gradle/play/plugins/PlayCoffeeScriptPlugin.java b/subprojects/platform-play/src/main/java/org/gradle/play/plugins/PlayCoffeeScriptPlugin.java
index 21214ed..7562746 100644
--- a/subprojects/platform-play/src/main/java/org/gradle/play/plugins/PlayCoffeeScriptPlugin.java
+++ b/subprojects/platform-play/src/main/java/org/gradle/play/plugins/PlayCoffeeScriptPlugin.java
@@ -70,7 +70,7 @@
 
     @Mutate
     void createCoffeeScriptSourceSets(ModelMap<PlayApplicationSpec> components) {
-        components.beforeEach(new Action<PlayApplicationSpec>() {
+        components.afterEach(new Action<PlayApplicationSpec>() {
             @Override
             public void execute(PlayApplicationSpec playComponent) {
                 playComponent.getSources().create("coffeeScript", CoffeeScriptSourceSet.class, new Action<CoffeeScriptSourceSet>() {
