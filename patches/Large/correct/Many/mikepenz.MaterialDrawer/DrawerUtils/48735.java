diff --git a/library/src/main/java/com/mikepenz/materialdrawer/DrawerUtils.java b/library/src/main/java/com/mikepenz/materialdrawer/DrawerUtils.java
index bdfb769..360aa66 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/DrawerUtils.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/DrawerUtils.java
@@ -282,9 +282,9 @@
             }
 
             if (drawer.mFooterDivider) {
-                drawer.mAdapter.addHeaderDrawerItems(new ContainerDrawerItem().withView(drawer.mFooterView).withViewPosition(ContainerDrawerItem.Position.BOTTOM));
+                drawer.mAdapter.addFooterDrawerItems(new ContainerDrawerItem().withView(drawer.mFooterView).withViewPosition(ContainerDrawerItem.Position.BOTTOM));
             } else {
-                drawer.mAdapter.addHeaderDrawerItems(new ContainerDrawerItem().withView(drawer.mFooterView).withViewPosition(ContainerDrawerItem.Position.NONE));
+                drawer.mAdapter.addFooterDrawerItems(new ContainerDrawerItem().withView(drawer.mFooterView).withViewPosition(ContainerDrawerItem.Position.NONE));
             }
         }
     }
