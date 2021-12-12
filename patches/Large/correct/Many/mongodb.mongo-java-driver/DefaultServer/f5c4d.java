diff --git a/src/main/com/mongodb/DefaultServer.java b/src/main/com/mongodb/DefaultServer.java
index 161eb6e..56f726c 100644
--- a/src/main/com/mongodb/DefaultServer.java
+++ b/src/main/com/mongodb/DefaultServer.java
@@ -108,7 +108,7 @@
 
     private final class DefaultServerStateListener implements ChangeListener<ServerDescription> {
         @Override
-        public synchronized void stateChanged(final ChangeEvent<ServerDescription> event) {
+        public void stateChanged(final ChangeEvent<ServerDescription> event) {
             description = event.getNewValue();
             for (ChangeListener<ServerDescription> listener : changeListeners.keySet()) {
                 listener.stateChanged(event);
