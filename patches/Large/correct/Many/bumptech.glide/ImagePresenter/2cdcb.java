diff --git a/library/src/com/bumptech/glide/presenter/ImagePresenter.java b/library/src/com/bumptech/glide/presenter/ImagePresenter.java
index 832160f..22ec773 100644
--- a/library/src/com/bumptech/glide/presenter/ImagePresenter.java
+++ b/library/src/com/bumptech/glide/presenter/ImagePresenter.java
@@ -441,7 +441,7 @@
                 if (exceptionHandler != null) {
                     exceptionHandler.onException(e, model, relevant);
                 }
-                if (relevant && canSetPlaceholder()) {
+                if (relevant && canSetPlaceholder() && errorDrawable != null) {
                     target.setPlaceholder(errorDrawable);
                 }
             }
