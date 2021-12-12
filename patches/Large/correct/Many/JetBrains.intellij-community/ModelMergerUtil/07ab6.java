diff --git a/dom/openapi/src/com/intellij/util/xml/ModelMergerUtil.java b/dom/openapi/src/com/intellij/util/xml/ModelMergerUtil.java
index dd11d62..0144040 100644
--- a/dom/openapi/src/com/intellij/util/xml/ModelMergerUtil.java
+++ b/dom/openapi/src/com/intellij/util/xml/ModelMergerUtil.java
@@ -42,9 +42,9 @@
     return (V)processor.getFoundValue();
   }
 
-  @Nullable
+  @NotNull
   public static <T, V> Collection<V> getImplementations(final T element, final Class<V> clazz) {
-    if (element == null) return null;
+    if (element == null) return Collections.emptyList();
     CommonProcessors.CollectProcessor<T> processor = new CommonProcessors.CollectProcessor<T>() {
       public boolean process(final T t) {
         return !ReflectionCache.isAssignable(clazz, t.getClass()) || super.process(t);
