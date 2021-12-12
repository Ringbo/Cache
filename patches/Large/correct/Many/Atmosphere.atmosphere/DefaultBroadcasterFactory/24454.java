diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
index 6fa4002..9d21db5 100755
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
@@ -223,7 +223,7 @@
      * {@inheritDoc}
      */
     @Override
-    public Broadcaster lookup(Class<? extends Broadcaster> c, Object id, boolean createIfNull) {
+    public synchronized Broadcaster lookup(Class<? extends Broadcaster> c, Object id, boolean createIfNull) {
         Broadcaster b = store.get(id);
         if (b != null && !c.isAssignableFrom(b.getClass())) {
             String msg = "Invalid lookup class " + c.getName() + ". Cached class is: " + b.getClass().getName();
