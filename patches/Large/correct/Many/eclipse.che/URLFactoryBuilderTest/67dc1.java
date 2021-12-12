diff --git a/plugins/plugin-urlfactory/src/test/java/org/eclipse/che/plugin/urlfactory/URLFactoryBuilderTest.java b/plugins/plugin-urlfactory/src/test/java/org/eclipse/che/plugin/urlfactory/URLFactoryBuilderTest.java
index e1a6d74..156a5b0 100644
--- a/plugins/plugin-urlfactory/src/test/java/org/eclipse/che/plugin/urlfactory/URLFactoryBuilderTest.java
+++ b/plugins/plugin-urlfactory/src/test/java/org/eclipse/che/plugin/urlfactory/URLFactoryBuilderTest.java
@@ -56,7 +56,7 @@
   public void checkDefaultImage() throws Exception {
 
     RecipeDto recipeDto =
-        newDto(RecipeDto.class).withLocation(DEFAULT_DOCKER_IMAGE).withType("dockerimage");
+        newDto(RecipeDto.class).withContent(DEFAULT_DOCKER_IMAGE).withType("dockerimage");
     MachineConfigDto machine =
         newDto(MachineConfigDto.class)
             .withInstallers(singletonList("org.eclipse.che.ws-agent"))
@@ -126,7 +126,7 @@
   public void checkWithNonAccessibleCustomDockerfile() throws Exception {
     String myLocation = "http://foo-location";
     RecipeDto recipeDto =
-        newDto(RecipeDto.class).withLocation(DEFAULT_DOCKER_IMAGE).withType("dockerimage");
+        newDto(RecipeDto.class).withContent(DEFAULT_DOCKER_IMAGE).withType("dockerimage");
     MachineConfigDto machine =
         newDto(MachineConfigDto.class)
             .withInstallers(singletonList("org.eclipse.che.ws-agent"))
