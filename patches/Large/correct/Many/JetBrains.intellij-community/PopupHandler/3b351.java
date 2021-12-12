diff --git a/openapi/src/com/intellij/ui/PopupHandler.java b/openapi/src/com/intellij/ui/PopupHandler.java
index 5f881ca..40ddf3d 100644
--- a/openapi/src/com/intellij/ui/PopupHandler.java
+++ b/openapi/src/com/intellij/ui/PopupHandler.java
@@ -56,12 +56,12 @@
     }
   }
 
-  public static void installPopupHandler(Component component, @NonNls String groupId, String place) {
+  public static void installPopupHandler(JComponent component, @NonNls String groupId, String place) {
     ActionGroup group = (ActionGroup)ActionManager.getInstance().getAction(groupId);
     installPopupHandler(component, group, place, ActionManager.getInstance());
   }
 
-  public static MouseListener installPopupHandler(Component component, final ActionGroup group, final String place, final ActionManager actionManager) {
+  public static MouseListener installPopupHandler(JComponent component, final ActionGroup group, final String place, final ActionManager actionManager) {
     if (ApplicationManager.getApplication() == null) return new MouseAdapter(){};
     PopupHandler popupHandler = new PopupHandler() {
       public void invokePopup(Component comp, int x, int y) {
