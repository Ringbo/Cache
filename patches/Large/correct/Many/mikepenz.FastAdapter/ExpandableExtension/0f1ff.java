diff --git a/library-extensions-expandable/src/main/java/com/mikepenz/fastadapter/expandable/ExpandableExtension.java b/library-extensions-expandable/src/main/java/com/mikepenz/fastadapter/expandable/ExpandableExtension.java
index 89a5c8b..579656b 100644
--- a/library-extensions-expandable/src/main/java/com/mikepenz/fastadapter/expandable/ExpandableExtension.java
+++ b/library-extensions-expandable/src/main/java/com/mikepenz/fastadapter/expandable/ExpandableExtension.java
@@ -306,7 +306,7 @@
                 //first we find out how many items were added in total
                 //also counting subitems
                 int totalAddedItems = expandable.getSubItems().size();
-                for (int i = position + 1; i < position + totalAddedItems; i++) {
+                for (int i = position + 1; i <= position + totalAddedItems; i++) {
                     Item tmp = mFastAdapter.getItem(i);
                     if (tmp instanceof IExpandable) {
                         IExpandable tmpExpandable = ((IExpandable) tmp);
