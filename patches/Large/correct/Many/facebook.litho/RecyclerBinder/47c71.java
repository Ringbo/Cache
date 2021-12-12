diff --git a/litho-widget/src/main/java/com/facebook/litho/widget/RecyclerBinder.java b/litho-widget/src/main/java/com/facebook/litho/widget/RecyclerBinder.java
index 81948c5..1f0d073 100644
--- a/litho-widget/src/main/java/com/facebook/litho/widget/RecyclerBinder.java
+++ b/litho-widget/src/main/java/com/facebook/litho/widget/RecyclerBinder.java
@@ -462,7 +462,7 @@
 
     /** @param c The {@link ComponentContext} the RecyclerBinder will use. */
     public RecyclerBinder build(ComponentContext c) {
-      componentContext = new ComponentContext(c.getBaseContext());
+      componentContext = new ComponentContext(c.getBaseContext(), c.getLogTag(), c.getLogger());
 
       if (layoutInfo == null) {
         layoutInfo = new LinearLayoutInfo(c, VERTICAL, false);
