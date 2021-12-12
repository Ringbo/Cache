diff --git a/astrid/src/com/todoroo/astrid/adapter/TaskAdapter.java b/astrid/src/com/todoroo/astrid/adapter/TaskAdapter.java
index 52329b8..4dc68b6 100644
--- a/astrid/src/com/todoroo/astrid/adapter/TaskAdapter.java
+++ b/astrid/src/com/todoroo/astrid/adapter/TaskAdapter.java
@@ -396,7 +396,7 @@
             }
             else
             {
-                checkBoxView.setBackgroundResource(R.drawable.btn_check);
+                checkBoxView.setButtonDrawable(R.drawable.btn_check);
             }
             if (pictureView.getVisibility() == View.VISIBLE){
                 checkBoxView.setVisibility(View.INVISIBLE);
