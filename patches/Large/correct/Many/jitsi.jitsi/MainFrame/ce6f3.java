diff --git a/src/net/java/sip/communicator/impl/gui/main/MainFrame.java b/src/net/java/sip/communicator/impl/gui/main/MainFrame.java
index 5dbeac0..db6dd5b 100644
--- a/src/net/java/sip/communicator/impl/gui/main/MainFrame.java
+++ b/src/net/java/sip/communicator/impl/gui/main/MainFrame.java
@@ -1076,7 +1076,7 @@
      */
     public boolean isMenuSelected()
     {
-        return menu.isSelected();
+        return menu.hasSelectedMenus();
     }
 
     /**
