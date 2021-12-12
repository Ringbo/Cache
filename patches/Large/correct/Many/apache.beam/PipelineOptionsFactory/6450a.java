diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/options/PipelineOptionsFactory.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/options/PipelineOptionsFactory.java
index f75daee..1f7d8dd 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/options/PipelineOptionsFactory.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/options/PipelineOptionsFactory.java
@@ -1097,7 +1097,7 @@
             @Nonnull
             @Override
             public Iterable<? extends Annotation> apply(@Nonnull Method method) {
-              return FluentIterable.of(method.getAnnotations());
+              return FluentIterable.from(method.getAnnotations());
             }
           })
           .filter(annotationPredicates.forAnnotation));
@@ -1112,7 +1112,7 @@
                   @Nonnull
                   @Override
                   public Iterable<String> apply(final @Nonnull Method method) {
-                    return FluentIterable.of(method.getAnnotations())
+                    return FluentIterable.from(method.getAnnotations())
                         .filter(annotationPredicates.forAnnotation)
                         .transform(new Function<Annotation, String>() {
                           @Nonnull
@@ -1483,7 +1483,7 @@
           }});
 
     private static final Set<Class<?>> DEFAULT_ANNOTATION_CLASSES = Sets.newHashSet(
-        FluentIterable.of(Default.class.getDeclaredClasses())
+        FluentIterable.from(Default.class.getDeclaredClasses())
         .filter(new Predicate<Class<?>>() {
           @Override
           public boolean apply(@Nonnull Class<?> klass) {
