diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/InternalDecorator.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/InternalDecorator.java
index b4682ae..62aafc8 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/InternalDecorator.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/InternalDecorator.java
@@ -139,7 +139,7 @@
     myTitlePanel = new TitlePanel() {
       @Override
       public boolean isActive() {
-        return computeActive();
+        return isFocused();
       }
     };
     myTitleTabs = toolWindow.getContentUI().getTabComponent();
@@ -175,7 +175,7 @@
     apply(info);
   }
 
-  private boolean computeActive() {
+  public boolean isFocused() {
     Component component = IdeFocusManager.getInstance(myProject).getFocusedDescendantFor(myToolWindow.getComponent());
     if (component != null) return true;
 
@@ -938,7 +938,7 @@
     }
 
     public boolean isActive() {
-      return InternalDecorator.this.computeActive();
+      return InternalDecorator.this.isFocused();
     }
 
     public void setIcon(final Icon active, Icon inactive) {
