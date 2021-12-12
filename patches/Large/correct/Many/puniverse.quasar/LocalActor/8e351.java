diff --git a/quasar-core/src/main/java/co/paralleluniverse/actors/LocalActor.java b/quasar-core/src/main/java/co/paralleluniverse/actors/LocalActor.java
index 10adc12..41472f7 100644
--- a/quasar-core/src/main/java/co/paralleluniverse/actors/LocalActor.java
+++ b/quasar-core/src/main/java/co/paralleluniverse/actors/LocalActor.java
@@ -370,7 +370,7 @@
     }
 
     @Override
-    protected final void removeLifecycleListener(LifecycleListener listener) {
+    protected final void removeLifecycleListener(Object listener) {
         lifecycleListeners.remove(listener);
     }
 
