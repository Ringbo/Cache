diff --git a/library/src/main/java/com/mikepenz/fastadapter/items/GenericAbstractItem.java b/library/src/main/java/com/mikepenz/fastadapter/items/GenericAbstractItem.java
index e8ae6c8..7628c7d 100644
--- a/library/src/main/java/com/mikepenz/fastadapter/items/GenericAbstractItem.java
+++ b/library/src/main/java/com/mikepenz/fastadapter/items/GenericAbstractItem.java
@@ -24,7 +24,7 @@
     }
 
     public void setModel(Model model) {
-        this.mModel = mModel;
+        this.mModel = model;
     }
 
     @Override
