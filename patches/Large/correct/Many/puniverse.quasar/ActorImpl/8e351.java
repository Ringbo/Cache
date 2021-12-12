diff --git a/quasar-core/src/main/java/co/paralleluniverse/actors/ActorImpl.java b/quasar-core/src/main/java/co/paralleluniverse/actors/ActorImpl.java
index 4909df9..b192bab 100644
--- a/quasar-core/src/main/java/co/paralleluniverse/actors/ActorImpl.java
+++ b/quasar-core/src/main/java/co/paralleluniverse/actors/ActorImpl.java
@@ -172,7 +172,7 @@
 
     protected abstract void addLifecycleListener(LifecycleListener listener);
 
-    protected abstract void removeLifecycleListener(LifecycleListener listener);
+    protected abstract void removeLifecycleListener(Object listener);
 
     protected abstract LifecycleListener getLifecycleListener();
 
@@ -219,7 +219,7 @@
     public final void unwatch(Actor other1, Object listener) {
         final ActorImpl other = (ActorImpl) other1;
         record(1, "Actor", "unwatch", "Actor %s to stop watching %s (listener: %s)", this, other, listener);
-        other.removeLifecycleListener((LifecycleListener) listener);
+        other.removeLifecycleListener(listener);
     }
 
     static class ActorLifecycleListener implements LifecycleListener, java.io.Serializable {
