diff --git a/core/java/android/widget/SearchView.java b/core/java/android/widget/SearchView.java
index 521597b..8f3a311 100644
--- a/core/java/android/widget/SearchView.java
+++ b/core/java/android/widget/SearchView.java
@@ -511,7 +511,7 @@
     public void setQuery(CharSequence query, boolean submit) {
         mQueryTextView.setText(query);
         if (query != null) {
-            mQueryTextView.setSelection(query.length());
+            mQueryTextView.setSelection(mQueryTextView.length());
             mUserQuery = query;
         }
 
