diff --git a/library/src/main/java/com/mikepenz/fastadapter/adapters/ItemAdapter.java b/library/src/main/java/com/mikepenz/fastadapter/adapters/ItemAdapter.java
index 72cdd47..1f4fb14 100644
--- a/library/src/main/java/com/mikepenz/fastadapter/adapters/ItemAdapter.java
+++ b/library/src/main/java/com/mikepenz/fastadapter/adapters/ItemAdapter.java
@@ -375,7 +375,7 @@
         int preItemCount = getFastAdapter().getPreItemCount(fromPosition);
         Item item = mItems.get(fromPosition - preItemCount);
         mItems.remove(fromPosition - preItemCount);
-        mItems.set(toPosition - preItemCount, item);
+        mItems.add(toPosition - preItemCount, item);
         getFastAdapter().notifyAdapterItemMoved(fromPosition, toPosition);
         return this;
     }
