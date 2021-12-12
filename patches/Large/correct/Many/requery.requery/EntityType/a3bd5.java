diff --git a/requery-processor/src/main/java/io/requery/processor/EntityType.java b/requery-processor/src/main/java/io/requery/processor/EntityType.java
index c4c7c2b..0e1c24c 100644
--- a/requery-processor/src/main/java/io/requery/processor/EntityType.java
+++ b/requery-processor/src/main/java/io/requery/processor/EntityType.java
@@ -342,7 +342,7 @@
     @Override
     public PropertyVisibility propertyVisibility() {
         return annotationOf(Entity.class)
-                .map(Entity::propertVisibility)
+                .map(Entity::propertyVisibility)
                 .orElse(PropertyVisibility.PRIVATE);
     }
 
