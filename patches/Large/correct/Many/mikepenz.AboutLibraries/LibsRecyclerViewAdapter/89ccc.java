diff --git a/library/src/main/java/com/mikepenz/aboutlibraries/ui/adapter/LibsRecyclerViewAdapter.java b/library/src/main/java/com/mikepenz/aboutlibraries/ui/adapter/LibsRecyclerViewAdapter.java
index c6e0de5..2aed67f 100755
--- a/library/src/main/java/com/mikepenz/aboutlibraries/ui/adapter/LibsRecyclerViewAdapter.java
+++ b/library/src/main/java/com/mikepenz/aboutlibraries/ui/adapter/LibsRecyclerViewAdapter.java
@@ -470,7 +470,7 @@
             libraryDescription.setTextColor(UIUtils.getThemeColorFromAttrOrRes(itemView.getContext(), R.attr.about_libraries_text_openSource, R.color.about_libraries_text_openSource));
 
             libraryBottomDivider = itemView.findViewById(R.id.libraryBottomDivider);
-            libraryDescriptionDivider.setBackgroundColor(UIUtils.getThemeColorFromAttrOrRes(itemView.getContext(), R.attr.about_libraries_dividerLight_openSource, R.color.about_libraries_dividerLight_openSource));
+            libraryBottomDivider.setBackgroundColor(UIUtils.getThemeColorFromAttrOrRes(itemView.getContext(), R.attr.about_libraries_dividerLight_openSource, R.color.about_libraries_dividerLight_openSource));
             libraryBottomContainer = itemView.findViewById(R.id.libraryBottomContainer);
 
             libraryVersion = (TextView) itemView.findViewById(R.id.libraryVersion);
