diff --git a/ui/impl/com/intellij/ui/popup/list/ListPopupImpl.java b/ui/impl/com/intellij/ui/popup/list/ListPopupImpl.java
index 7c82a78..81a6ff4 100644
--- a/ui/impl/com/intellij/ui/popup/list/ListPopupImpl.java
+++ b/ui/impl/com/intellij/ui/popup/list/ListPopupImpl.java
@@ -42,7 +42,7 @@
     myList.addMouseMotionListener(myMouseMotionListener);
     myList.addMouseListener(myMouseListener);
 
-    myList.setVisibleRowCount(Math.max(20, myListModel.getSize()));
+    myList.setVisibleRowCount(Math.min(20, myListModel.getSize()));
   }
 
   protected void afterShow() {
