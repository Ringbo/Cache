diff --git a/guava/src/com/google/common/graph/AbstractNetwork.java b/guava/src/com/google/common/graph/AbstractNetwork.java
index eee49e6..a1110f5 100644
--- a/guava/src/com/google/common/graph/AbstractNetwork.java
+++ b/guava/src/com/google/common/graph/AbstractNetwork.java
@@ -129,7 +129,7 @@
   }
 
   @Override
-  public boolean equals(@Nullable Object obj) {
+  public final boolean equals(@Nullable Object obj) {
     if (obj == this) {
       return true;
     }
@@ -154,7 +154,7 @@
   }
 
   @Override
-  public int hashCode() {
+  public final int hashCode() {
     Function<N, Set<E>> nodeToOutEdges = new Function<N, Set<E>>() {
       @Override
       public Set<E> apply(N node) {
