diff --git a/library/src/main/java/com/mikepenz/aboutlibraries/ui/adapter/LibsRecyclerViewAdapter.java b/library/src/main/java/com/mikepenz/aboutlibraries/ui/adapter/LibsRecyclerViewAdapter.java
index e751fc5..5c4ac62 100755
--- a/library/src/main/java/com/mikepenz/aboutlibraries/ui/adapter/LibsRecyclerViewAdapter.java
+++ b/library/src/main/java/com/mikepenz/aboutlibraries/ui/adapter/LibsRecyclerViewAdapter.java
@@ -254,7 +254,7 @@
                 holder.libraryCreator.setOnLongClickListener(null);
             }
 
-            if (!TextUtils.isEmpty(library.getLibraryWebsite()) && !TextUtils.isEmpty(library.getRepositoryLink())) {
+            if (!TextUtils.isEmpty(library.getLibraryWebsite()) || !TextUtils.isEmpty(library.getRepositoryLink())) {
                 holder.libraryDescription.setOnTouchListener(rippleForegroundListener);
                 holder.libraryDescription.setOnClickListener(new View.OnClickListener() {
                     @Override
