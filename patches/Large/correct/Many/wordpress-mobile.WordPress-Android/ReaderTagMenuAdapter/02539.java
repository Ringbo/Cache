diff --git a/WordPress/src/main/java/org/wordpress/android/ui/reader/adapters/ReaderTagMenuAdapter.java b/WordPress/src/main/java/org/wordpress/android/ui/reader/adapters/ReaderTagMenuAdapter.java
index f53b7ba..a0f0835 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/reader/adapters/ReaderTagMenuAdapter.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/reader/adapters/ReaderTagMenuAdapter.java
@@ -62,9 +62,9 @@
 
         holder.textView.setText(tag.getCapitalizedTagName());
         if (isCurrentTag(tag)) {
-            holder.textView.setBackground(mSelectedBackground);
+            holder.textView.setBackgroundDrawable(mSelectedBackground);
         } else {
-            holder.textView.setBackground(null);
+            holder.textView.setBackgroundDrawable(null);
         }
 
         return convertView;
