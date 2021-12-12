diff --git a/src/eu/alefzero/owncloud/ui/adapter/FileListListAdapter.java b/src/eu/alefzero/owncloud/ui/adapter/FileListListAdapter.java
index fc28e1f..6008d16 100644
--- a/src/eu/alefzero/owncloud/ui/adapter/FileListListAdapter.java
+++ b/src/eu/alefzero/owncloud/ui/adapter/FileListListAdapter.java
@@ -104,7 +104,7 @@
 
             fileName.setText(name);
             ImageView fileIcon = (ImageView) view.findViewById(R.id.imageView1);
-            if (!file.getMimetype().equals("DIR")) {
+            if (file.getMimetype() == null || !file.getMimetype().equals("DIR")) {
                 fileIcon.setImageResource(R.drawable.file);
             } else {
                 fileIcon.setImageResource(R.drawable.ic_menu_archive);
