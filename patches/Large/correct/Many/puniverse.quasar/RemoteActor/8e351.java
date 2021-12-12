diff --git a/quasar-galaxy/src/main/java/co/paralleluniverse/actors/galaxy/RemoteActor.java b/quasar-galaxy/src/main/java/co/paralleluniverse/actors/galaxy/RemoteActor.java
index 8695cad..73db978 100644
--- a/quasar-galaxy/src/main/java/co/paralleluniverse/actors/galaxy/RemoteActor.java
+++ b/quasar-galaxy/src/main/java/co/paralleluniverse/actors/galaxy/RemoteActor.java
@@ -29,7 +29,7 @@
     }
 
     @Override
-    protected void removeLifecycleListener(LifecycleListener listener) {
+    protected void removeLifecycleListener(Object listener) {
         throw new UnsupportedOperationException("Not supported yet.");
     }
 
