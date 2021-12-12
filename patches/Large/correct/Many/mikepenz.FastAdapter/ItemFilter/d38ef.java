diff --git a/library-core/src/main/java/com/mikepenz/fastadapter/adapters/ItemFilter.java b/library-core/src/main/java/com/mikepenz/fastadapter/adapters/ItemFilter.java
index d0e5989..6640020 100644
--- a/library-core/src/main/java/com/mikepenz/fastadapter/adapters/ItemFilter.java
+++ b/library-core/src/main/java/com/mikepenz/fastadapter/adapters/ItemFilter.java
@@ -118,7 +118,8 @@
             mItemAdapter.setInternal((List<Item>) results.values, false, null);
         }
 
-        if (mItemFilterListener != null) {
+        //only fire when we are filtered, not in onreset
+        if (mItemFilterListener != null && mOriginalItems != null) {
             mItemFilterListener.itemsFiltered(constraint, (List<Item>) results.values);
         }
     }
