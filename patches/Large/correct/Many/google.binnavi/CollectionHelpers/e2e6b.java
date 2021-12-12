diff --git a/src/main/java/com/google/security/zynamics/zylib/types/common/CollectionHelpers.java b/src/main/java/com/google/security/zynamics/zylib/types/common/CollectionHelpers.java
index cd3c75a..a92e241 100644
--- a/src/main/java/com/google/security/zynamics/zylib/types/common/CollectionHelpers.java
+++ b/src/main/java/com/google/security/zynamics/zylib/types/common/CollectionHelpers.java
@@ -66,7 +66,7 @@
       final ICollectionFilter<ItemType> callback) {
 
     return collection.stream()
-             .filter(itemType -> item.qualifies(itemType))
+             .filter(itemType -> callback.qualifies(itemType))
              .collect(Collectors.toList());
   }
 
