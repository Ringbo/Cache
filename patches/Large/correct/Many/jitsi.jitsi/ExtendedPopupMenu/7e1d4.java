diff --git a/src/net/java/sip/communicator/plugin/desktoputil/ExtendedPopupMenu.java b/src/net/java/sip/communicator/plugin/desktoputil/ExtendedPopupMenu.java
index 796d306..c24bcda 100644
--- a/src/net/java/sip/communicator/plugin/desktoputil/ExtendedPopupMenu.java
+++ b/src/net/java/sip/communicator/plugin/desktoputil/ExtendedPopupMenu.java
@@ -30,7 +30,7 @@
     /**
      * The invoker component.
      */
-    private final JComponent invoker;
+    private final Component invoker;
  
     /**
      * Creates this dialog by specifying a list of items to choose from.
@@ -39,7 +39,7 @@
      * @param title
      * @param menuItems the list of items to select through
      */
-    public ExtendedPopupMenu(JComponent invoker,
+    public ExtendedPopupMenu(Component invoker,
                              String title,
                              List<JMenuItem> menuItems)
     {
