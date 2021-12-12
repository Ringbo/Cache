diff --git a/library/src/main/java/it/gmariotti/cardslib/library/view/listener/UndoBarController.java b/library/src/main/java/it/gmariotti/cardslib/library/view/listener/UndoBarController.java
index c0cf409..f854f38 100644
--- a/library/src/main/java/it/gmariotti/cardslib/library/view/listener/UndoBarController.java
+++ b/library/src/main/java/it/gmariotti/cardslib/library/view/listener/UndoBarController.java
@@ -113,7 +113,7 @@
         // the original object removal was not undone. So, execute
         // onUndoBarHide for the previous listener.
         if (mUndoBarHideListener != null) {
-            undoBarHideListener.onUndoBarHide(mUndoToken == null);
+            mUndoBarHideListener.onUndoBarHide(mUndoToken == null);
         }
 
         mUndoToken = undoToken;
