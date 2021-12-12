diff --git a/epoxy-processortest/src/test/resources/TestManyTypesViewModel_.java b/epoxy-processortest/src/test/resources/TestManyTypesViewModel_.java
index 3836ff7..1c47e4a 100644
--- a/epoxy-processortest/src/test/resources/TestManyTypesViewModel_.java
+++ b/epoxy-processortest/src/test/resources/TestManyTypesViewModel_.java
@@ -487,14 +487,14 @@
 
   /**
    * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set */
-  public TestManyTypesViewModel_ clickListener_OnClickListener(final OnModelClickListener<TestManyTypesViewModel_, TestManyTypesView> clickListener_OnClickListener) {
+  public TestManyTypesViewModel_ clickListener(final OnModelClickListener<TestManyTypesViewModel_, TestManyTypesView> clickListener) {
     assignedAttributes_epoxyGeneratedModel.set(12);
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
