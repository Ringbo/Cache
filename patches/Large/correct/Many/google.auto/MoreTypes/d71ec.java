diff --git a/common/src/main/java/com/google/auto/common/MoreTypes.java b/common/src/main/java/com/google/auto/common/MoreTypes.java
index d0f40a9..1319092 100644
--- a/common/src/main/java/com/google/auto/common/MoreTypes.java
+++ b/common/src/main/java/com/google/auto/common/MoreTypes.java
@@ -738,7 +738,7 @@
    * Returns a {@link WildcardType} if the {@link TypeMirror} represents a wildcard type or throws
    * an {@link IllegalArgumentException}.
    */
-  public static WildcardType asWildcard(WildcardType maybeWildcardType) {
+  public static WildcardType asWildcard(TypeMirror maybeWildcardType) {
     return maybeWildcardType.accept(WildcardTypeVisitor.INSTANCE, null);
   }
 
