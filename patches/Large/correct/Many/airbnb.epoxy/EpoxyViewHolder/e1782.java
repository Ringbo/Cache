diff --git a/epoxy-adapter/src/main/java/com/airbnb/epoxy/EpoxyViewHolder.java b/epoxy-adapter/src/main/java/com/airbnb/epoxy/EpoxyViewHolder.java
index f8b65b8..841951c 100755
--- a/epoxy-adapter/src/main/java/com/airbnb/epoxy/EpoxyViewHolder.java
+++ b/epoxy-adapter/src/main/java/com/airbnb/epoxy/EpoxyViewHolder.java
@@ -37,7 +37,7 @@
     epoxyModel = model;
   }
 
-  private Object objectToBind() {
+  Object objectToBind() {
     return epoxyHolder != null ? epoxyHolder : itemView;
   }
 
