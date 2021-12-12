diff --git a/byte-buddy-dep/src/main/java/net/bytebuddy/matcher/CollectionRawTypeMatcher.java b/byte-buddy-dep/src/main/java/net/bytebuddy/matcher/CollectionRawTypeMatcher.java
index 127057d..5cd3c96 100644
--- a/byte-buddy-dep/src/main/java/net/bytebuddy/matcher/CollectionRawTypeMatcher.java
+++ b/byte-buddy-dep/src/main/java/net/bytebuddy/matcher/CollectionRawTypeMatcher.java
@@ -17,14 +17,14 @@
     /**
      * The matcher to be applied to the raw types.
      */
-    private final ElementMatcher<? super Iterable<? extends TypeDefinition>> matcher;
+    private final ElementMatcher<? super Iterable<? extends TypeDescription>> matcher;
 
     /**
      * Creates a new raw type matcher.
      *
      * @param matcher The matcher to be applied to the raw types.
      */
-    public CollectionRawTypeMatcher(ElementMatcher<? super Iterable<? extends TypeDefinition>> matcher) {
+    public CollectionRawTypeMatcher(ElementMatcher<? super Iterable<? extends TypeDescription>> matcher) {
         this.matcher = matcher;
     }
 
