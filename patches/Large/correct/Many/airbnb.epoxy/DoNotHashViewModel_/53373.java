diff --git a/epoxy-processortest/src/test/resources/DoNotHashViewModel_.java b/epoxy-processortest/src/test/resources/DoNotHashViewModel_.java
index a46b5f7..cba96f1 100644
--- a/epoxy-processortest/src/test/resources/DoNotHashViewModel_.java
+++ b/epoxy-processortest/src/test/resources/DoNotHashViewModel_.java
@@ -150,14 +150,14 @@
 
   /**
    * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set */
-  public DoNotHashViewModel_ clickListener_OnClickListener(final OnModelClickListener<DoNotHashViewModel_, DoNotHashView> clickListener_OnClickListener) {
+  public DoNotHashViewModel_ clickListener(final OnModelClickListener<DoNotHashViewModel_, DoNotHashView> clickListener) {
     assignedAttributes_epoxyGeneratedModel.set(1);
     onMutation();
-    if (clickListener_OnClickListener == null) {
+    if (clickListener == null) {
       this.clickListener_OnClickListener = null;
     }
     else {
-      this.clickListener_OnClickListener = new WrappedEpoxyModelClickListener(this, clickListener_OnClickListener);
+      this.clickListener_OnClickListener = new WrappedEpoxyModelClickListener(this, clickListener);
     }
     return this;
   }
