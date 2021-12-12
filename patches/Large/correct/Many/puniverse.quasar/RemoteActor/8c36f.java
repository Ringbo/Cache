diff --git a/quasar-galaxy/src/main/java/co/paralleluniverse/actors/galaxy/RemoteActor.java b/quasar-galaxy/src/main/java/co/paralleluniverse/actors/galaxy/RemoteActor.java
index 73db978..8695cad 100644
--- a/quasar-galaxy/src/main/java/co/paralleluniverse/actors/galaxy/RemoteActor.java
+++ b/quasar-galaxy/src/main/java/co/paralleluniverse/actors/galaxy/RemoteActor.java
@@ -29,7 +29,7 @@
     }
 
     @Override
-    protected void removeLifecycleListener(Object listener) {
+    protected void removeLifecycleListener(LifecycleListener listener) {
         throw new UnsupportedOperationException("Not supported yet.");
     }
 
