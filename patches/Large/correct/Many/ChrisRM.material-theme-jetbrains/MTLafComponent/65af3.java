diff --git a/src/main/java/com/chrisrm/idea/themes/MTLafComponent.java b/src/main/java/com/chrisrm/idea/themes/MTLafComponent.java
index 03ed45a..bcd9500 100644
--- a/src/main/java/com/chrisrm/idea/themes/MTLafComponent.java
+++ b/src/main/java/com/chrisrm/idea/themes/MTLafComponent.java
@@ -272,7 +272,7 @@
       if (component != null) {
         IdeStatusBarImpl ideStatusBar = UIUtil.findComponentOfType(component, IdeStatusBarImpl.class);
         if (ideStatusBar != null) {
-          ideStatusBar.setBorder(compactSidebar ? JBUI.Borders.empty() : JBUI.Borders.empty(10, 0));
+          ideStatusBar.setBorder(compactSidebar ? JBUI.Borders.empty() : JBUI.Borders.empty(6, 0));
         }
       }
     });
