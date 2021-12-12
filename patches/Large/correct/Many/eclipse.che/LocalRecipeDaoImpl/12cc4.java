diff --git a/wsmaster/wsmaster-local/src/main/java/org/eclipse/che/api/local/LocalRecipeDaoImpl.java b/wsmaster/wsmaster-local/src/main/java/org/eclipse/che/api/local/LocalRecipeDaoImpl.java
index 2366b7d..2f872b6 100644
--- a/wsmaster/wsmaster-local/src/main/java/org/eclipse/che/api/local/LocalRecipeDaoImpl.java
+++ b/wsmaster/wsmaster-local/src/main/java/org/eclipse/che/api/local/LocalRecipeDaoImpl.java
@@ -142,13 +142,13 @@
     public List<RecipeImpl> search(String user, List<String> tags, String type, int skipCount, int maxItems) throws ServerException {
         lock.readLock().lock();
         try {
-            final Stream<RecipeImpl> recipesStream = recipes.values()
+            Stream<RecipeImpl> recipesStream = recipes.values()
                                                             .stream()
                                                             .filter(recipe -> (tags == null || recipe.getTags().containsAll(tags))
                                                                               && (type == null || type.equals(recipe.getType())))
                                                             .skip(skipCount);
             if (maxItems != 0) {
-                recipesStream.limit(maxItems);
+                recipesStream = recipesStream.limit(maxItems);
             }
             return recipesStream.collect(Collectors.toList());
         } finally {
