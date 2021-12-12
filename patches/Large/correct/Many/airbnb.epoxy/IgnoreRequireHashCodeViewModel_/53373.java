diff --git a/epoxy-processortest/src/test/resources/IgnoreRequireHashCodeViewModel_.java b/epoxy-processortest/src/test/resources/IgnoreRequireHashCodeViewModel_.java
index 932c794..36356a8 100644
--- a/epoxy-processortest/src/test/resources/IgnoreRequireHashCodeViewModel_.java
+++ b/epoxy-processortest/src/test/resources/IgnoreRequireHashCodeViewModel_.java
@@ -107,14 +107,14 @@
 
   /**
    * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set */
-  public IgnoreRequireHashCodeViewModel_ clickListener_OnClickListener(final OnModelClickListener<IgnoreRequireHashCodeViewModel_, IgnoreRequireHashCodeView> clickListener_OnClickListener) {
+  public IgnoreRequireHashCodeViewModel_ clickListener(final OnModelClickListener<IgnoreRequireHashCodeViewModel_, IgnoreRequireHashCodeView> clickListener) {
     assignedAttributes_epoxyGeneratedModel.set(0);
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
