diff --git a/core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java b/core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java
index a9f2744..a93015d 100644
--- a/core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java
+++ b/core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java
@@ -21,7 +21,7 @@
 import java.util.Optional;
 
 /** Common utility functions for immutable collections. */
-final class ImmutableCollections {
+public final class ImmutableCollections {
 
   private ImmutableCollections() {}
 
@@ -72,7 +72,7 @@
               java.util.Set.class.getName(), com.google.common.collect.ImmutableSet.class.getName())
           .build();
 
-  static boolean isImmutableType(Type type) {
+  public static boolean isImmutableType(Type type) {
     return MUTABLE_TO_IMMUTABLE_CLASS_NAME_MAP.containsValue(getTypeQualifiedName(type));
   }
 
