diff --git a/astrid/src/com/todoroo/astrid/adapter/UpdateAdapter.java b/astrid/src/com/todoroo/astrid/adapter/UpdateAdapter.java
index d15920c..0c40cca 100644
--- a/astrid/src/com/todoroo/astrid/adapter/UpdateAdapter.java
+++ b/astrid/src/com/todoroo/astrid/adapter/UpdateAdapter.java
@@ -484,11 +484,11 @@
 
             } else if (History.COL_ATTACHMENT_ADDED.equals(column) || History.COL_ATTACHMENT_REMOVED.equals(column)) {
                 JSONArray attachmentArray = new JSONArray(newValue);
-                String attachmentName = attachmentArray.getString(1);
+                String attachmentName = attachmentArray.getString(0);
                 if (History.COL_ATTACHMENT_ADDED.equals(column))
-                    result = context.getString(R.string.history_attach_added, item, attachmentName);
+                    result = context.getString(R.string.history_attach_added, attachmentName, item);
                 else
-                    result = context.getString(R.string.history_attach_removed, item, attachmentName);
+                    result = context.getString(R.string.history_attach_removed, attachmentName, item);
             } else if (History.COL_ACKNOWLEDGED.equals(column)) {
                 result = context.getString(R.string.history_acknowledged, item);
             } else if (History.COL_SHARED_WITH.equals(column) || History.COL_UNSHARED_WITH.equals(column)) {
