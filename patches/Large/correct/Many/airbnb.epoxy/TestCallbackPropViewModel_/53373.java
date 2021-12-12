diff --git a/epoxy-processortest/src/test/resources/TestCallbackPropViewModel_.java b/epoxy-processortest/src/test/resources/TestCallbackPropViewModel_.java
index d869281..b17e702 100644
--- a/epoxy-processortest/src/test/resources/TestCallbackPropViewModel_.java
+++ b/epoxy-processortest/src/test/resources/TestCallbackPropViewModel_.java
@@ -105,14 +105,14 @@
   /**
    * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set */
   @Nullable
-  public TestCallbackPropViewModel_ listener_OnClickListener(final OnModelClickListener<TestCallbackPropViewModel_, TestCallbackPropView> listener_OnClickListener) {
+  public TestCallbackPropViewModel_ listener(final OnModelClickListener<TestCallbackPropViewModel_, TestCallbackPropView> listener) {
     assignedAttributes_epoxyGeneratedModel.set(0);
     onMutation();
-    if (listener_OnClickListener == null) {
+    if (listener == null) {
       this.listener_OnClickListener = null;
     }
     else {
-      this.listener_OnClickListener = new WrappedEpoxyModelClickListener(this, listener_OnClickListener);
+      this.listener_OnClickListener = new WrappedEpoxyModelClickListener(this, listener);
     }
     return this;
   }
