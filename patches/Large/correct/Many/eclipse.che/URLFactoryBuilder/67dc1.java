diff --git a/plugins/plugin-urlfactory/src/main/java/org/eclipse/che/plugin/urlfactory/URLFactoryBuilder.java b/plugins/plugin-urlfactory/src/main/java/org/eclipse/che/plugin/urlfactory/URLFactoryBuilder.java
index 2ad3714..666b55f 100644
--- a/plugins/plugin-urlfactory/src/main/java/org/eclipse/che/plugin/urlfactory/URLFactoryBuilder.java
+++ b/plugins/plugin-urlfactory/src/main/java/org/eclipse/che/plugin/urlfactory/URLFactoryBuilder.java
@@ -104,8 +104,7 @@
               .withType("dockerfile")
               .withContentType("text/x-dockerfile");
     } else {
-      recipeDto =
-          newDto(RecipeDto.class).withLocation(DEFAULT_DOCKER_IMAGE).withType("dockerimage");
+      recipeDto = newDto(RecipeDto.class).withContent(DEFAULT_DOCKER_IMAGE).withType("dockerimage");
     }
     MachineConfigDto machine =
         newDto(MachineConfigDto.class)
