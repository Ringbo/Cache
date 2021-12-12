diff --git a/src/main/java/com/pahimar/ee3/api/RecipeMapping.java b/src/main/java/com/pahimar/ee3/api/RecipeMapping.java
index 6961f01..0c5a1ab 100644
--- a/src/main/java/com/pahimar/ee3/api/RecipeMapping.java
+++ b/src/main/java/com/pahimar/ee3/api/RecipeMapping.java
@@ -113,10 +113,10 @@
         JsonArray jsonArray = new JsonArray();
         for (WrappedStack inputStack : recipeMapping.inputWrappedStacks)
         {
-            jsonArray.add(gsonWrappedStack.toJsonTree(inputStack));
+            jsonArray.add(gsonWrappedStack.toJsonTree(inputStack, WrappedStack.class));
         }
 
-        jsonRecipeMapping.add("outputWrappedStack", gsonWrappedStack.toJsonTree(recipeMapping.outputWrappedStack));
+        jsonRecipeMapping.add("outputWrappedStack", gsonWrappedStack.toJsonTree(recipeMapping.outputWrappedStack, WrappedStack.class));
         jsonRecipeMapping.add("inputWrappedStacks", jsonArray);
 
         return jsonRecipeMapping;
