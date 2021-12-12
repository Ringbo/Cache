diff --git a/src/org/thoughtcrime/securesms/database/CursorRecyclerViewAdapter.java b/src/org/thoughtcrime/securesms/database/CursorRecyclerViewAdapter.java
index 18e09be..6855cd8 100644
--- a/src/org/thoughtcrime/securesms/database/CursorRecyclerViewAdapter.java
+++ b/src/org/thoughtcrime/securesms/database/CursorRecyclerViewAdapter.java
@@ -40,7 +40,7 @@
       cursor.registerDataSetObserver(observer);
     }
 
-    setHasStableIds(true);
+    setHasStableIds(false);
   }
 
   public Context getContext() {
