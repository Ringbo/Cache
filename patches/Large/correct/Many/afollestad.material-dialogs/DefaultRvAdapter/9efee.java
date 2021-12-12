diff --git a/core/src/main/java/com/afollestad/materialdialogs/DefaultRvAdapter.java b/core/src/main/java/com/afollestad/materialdialogs/DefaultRvAdapter.java
index 3ae217e..022d04f 100644
--- a/core/src/main/java/com/afollestad/materialdialogs/DefaultRvAdapter.java
+++ b/core/src/main/java/com/afollestad/materialdialogs/DefaultRvAdapter.java
@@ -174,7 +174,7 @@
 
         @Override
         public void onClick(View view) {
-            if (adapter.callback != null) {
+            if (adapter.callback != null && getAdapterPosition()!=RecyclerView.NO_POSITION) {
                 CharSequence text = null;
                 if (adapter.dialog.builder.items != null && getAdapterPosition() < adapter.dialog.builder.items.size())
                     text = adapter.dialog.builder.items.get(getAdapterPosition());
@@ -184,7 +184,7 @@
 
         @Override
         public boolean onLongClick(View view) {
-            if (adapter.callback != null) {
+            if (adapter.callback != null && getAdapterPosition()!=RecyclerView.NO_POSITION) {
                 CharSequence text = null;
                 if (adapter.dialog.builder.items != null && getAdapterPosition() < adapter.dialog.builder.items.size())
                     text = adapter.dialog.builder.items.get(getAdapterPosition());
