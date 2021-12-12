diff --git a/jOOQ/src/main/java/org/jooq/impl/ResultImpl.java b/jOOQ/src/main/java/org/jooq/impl/ResultImpl.java
index b769f3c..7bd846e 100644
--- a/jOOQ/src/main/java/org/jooq/impl/ResultImpl.java
+++ b/jOOQ/src/main/java/org/jooq/impl/ResultImpl.java
@@ -1519,17 +1519,17 @@
     }
 
     @Override
-    public <E> Map<Record, List<E>> intoGroups(int[] keyFieldIndexes, Class<? extends E> type) {
+    public final <E> Map<Record, List<E>> intoGroups(int[] keyFieldIndexes, Class<? extends E> type) {
         return intoGroups(keyFieldIndexes, Utils.configuration(this).recordMapperProvider().provide(fields, type));
     }
 
     @Override
-    public <E> Map<Record, List<E>> intoGroups(String[] keyFieldNames, Class<? extends E> type) {
+    public final <E> Map<Record, List<E>> intoGroups(String[] keyFieldNames, Class<? extends E> type) {
         return intoGroups(keyFieldNames, Utils.configuration(this).recordMapperProvider().provide(fields, type));
     }
 
     @Override
-    public <E> Map<Record, List<E>> intoGroups(Name[] keyFieldNames, Class<? extends E> type) {
+    public final <E> Map<Record, List<E>> intoGroups(Name[] keyFieldNames, Class<? extends E> type) {
         return intoGroups(keyFieldNames, Utils.configuration(this).recordMapperProvider().provide(fields, type));
     }
 
