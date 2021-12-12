diff --git a/astrid/src/com/todoroo/astrid/adapter/FilterAdapter.java b/astrid/src/com/todoroo/astrid/adapter/FilterAdapter.java
index a8522e5..8f6e668 100644
--- a/astrid/src/com/todoroo/astrid/adapter/FilterAdapter.java
+++ b/astrid/src/com/todoroo/astrid/adapter/FilterAdapter.java
@@ -117,7 +117,7 @@
         this.skipIntentFilters = skipIntentFilters;
         this.selectable = selectable;
 
-        if (((AstridActivity) activity).getFragmentLayout() != AstridActivity.LAYOUT_SINGLE)
+        if (activity instanceof AstridActivity && ((AstridActivity) activity).getFragmentLayout() != AstridActivity.LAYOUT_SINGLE)
             filterStyle = R.style.TextAppearance_FLA_Filter_Tablet;
 
         inflater = (LayoutInflater) activity.getSystemService(
