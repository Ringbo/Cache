diff --git a/requery-processor/src/main/java/io/requery/processor/EntityGraph.java b/requery-processor/src/main/java/io/requery/processor/EntityGraph.java
index 37128b9..8785f13 100644
--- a/requery-processor/src/main/java/io/requery/processor/EntityGraph.java
+++ b/requery-processor/src/main/java/io/requery/processor/EntityGraph.java
@@ -48,7 +48,7 @@
     /**
      * @return the collection of {@link EntityDescriptor} descriptors in this graph.
      */
-    public Collection<EntityDescriptor> entities() {
+    Collection<EntityDescriptor> entities() {
         return Collections.unmodifiableCollection(entities.values());
     }
 
@@ -163,7 +163,8 @@
             return referenced.attributes().values().stream()
                 .filter(other -> other.cardinality() != null)
                 .filter(other -> referencingEntity(other).isPresent())
-                .filter(other -> referencingEntity(other).get() == entity)
+                .filter(other -> referencingEntity(other)
+                        .orElseThrow(IllegalStateException::new) == entity)
                 .collect(Collectors.toSet());
         } else {
             return referenced.attributes().values().stream()
