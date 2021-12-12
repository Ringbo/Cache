diff --git a/driver/src/main/org/mongodb/connection/DefaultServer.java b/driver/src/main/org/mongodb/connection/DefaultServer.java
index fa29acd..78bd928 100644
--- a/driver/src/main/org/mongodb/connection/DefaultServer.java
+++ b/driver/src/main/org/mongodb/connection/DefaultServer.java
@@ -121,7 +121,7 @@
 
     private final class DefaultServerStateListener implements ChangeListener<ServerDescription> {
         @Override
-        public synchronized void stateChanged(final ChangeEvent<ServerDescription> event) {
+        public void stateChanged(final ChangeEvent<ServerDescription> event) {
             description = event.getNewValue();
             for (final ChangeListener<ServerDescription> listener : changeListeners) {
                 listener.stateChanged(event);
