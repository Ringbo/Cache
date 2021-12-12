diff --git a/src/core/org/apache/jmeter/gui/action/ActionRouter.java b/src/core/org/apache/jmeter/gui/action/ActionRouter.java
index d9be5e7..cf4c1b2 100644
--- a/src/core/org/apache/jmeter/gui/action/ActionRouter.java
+++ b/src/core/org/apache/jmeter/gui/action/ActionRouter.java
@@ -237,9 +237,9 @@
         if (action != null) {
             HashSet<ActionListener> listenerSet = preActionListeners.get(action.getName());
             if (listenerSet != null && listenerSet.size() > 0) {
-                Object[] listeners = listenerSet.toArray();
+                ActionListener[] listeners = listenerSet.toArray(new ActionListener[listenerSet.size()]);
                 for (int i = 0; i < listeners.length; i++) {
-                    ((ActionListener) listeners[i]).actionPerformed(e);
+                    listeners[i].actionPerformed(e);
                 }
             }
         }
@@ -249,7 +249,7 @@
         if (action != null) {
             HashSet<ActionListener> listenerSet = postActionListeners.get(action.getName());
             if (listenerSet != null && listenerSet.size() > 0) {
-                ActionListener[] listeners = (ActionListener[]) listenerSet.toArray();
+                ActionListener[] listeners = listenerSet.toArray(new ActionListener[listenerSet.size()]);
                 for (int i = 0; i < listeners.length; i++) {
                     listeners[i].actionPerformed(e);
                 }
