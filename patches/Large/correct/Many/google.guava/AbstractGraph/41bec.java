diff --git a/guava/src/com/google/common/graph/AbstractGraph.java b/guava/src/com/google/common/graph/AbstractGraph.java
index ebdcfc7..2d0900b 100644
--- a/guava/src/com/google/common/graph/AbstractGraph.java
+++ b/guava/src/com/google/common/graph/AbstractGraph.java
@@ -90,7 +90,7 @@
 
   @SuppressWarnings({"unchecked", "rawtypes"})
   @Override
-  public boolean equals(@Nullable Object obj) {
+  public final boolean equals(@Nullable Object obj) {
     if (obj == this) {
       return true;
     }
@@ -116,7 +116,7 @@
   }
 
   @Override
-  public int hashCode() {
+  public final int hashCode() {
     return edgeValueMap().hashCode();
   }
 
