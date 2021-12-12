diff --git a/requery-processor/src/main/java/io/requery/processor/ListenerAnnotations.java b/requery-processor/src/main/java/io/requery/processor/ListenerAnnotations.java
index 7852ad2..7fe70fc 100644
--- a/requery-processor/src/main/java/io/requery/processor/ListenerAnnotations.java
+++ b/requery-processor/src/main/java/io/requery/processor/ListenerAnnotations.java
@@ -35,7 +35,7 @@
         return Stream.concat(annotationClasses(), jpaAnnotationClasses());
     }
 
-    static Stream<Class<? extends Annotation>> jpaAnnotationClasses() {
+    private static Stream<Class<? extends Annotation>> jpaAnnotationClasses() {
         return Stream.of(
             javax.persistence.PostLoad.class,
             javax.persistence.PostPersist.class,
@@ -46,7 +46,7 @@
             javax.persistence.PreUpdate.class);
     }
 
-    static Stream<Class<? extends Annotation>> annotationClasses() {
+    private static Stream<Class<? extends Annotation>> annotationClasses() {
         return Stream.of(
             PostLoad.class,
             PostInsert.class,
