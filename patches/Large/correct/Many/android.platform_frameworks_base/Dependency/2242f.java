diff --git a/packages/SystemUI/src/com/android/systemui/Dependency.java b/packages/SystemUI/src/com/android/systemui/Dependency.java
index 79190cb..429e859 100644
--- a/packages/SystemUI/src/com/android/systemui/Dependency.java
+++ b/packages/SystemUI/src/com/android/systemui/Dependency.java
@@ -265,7 +265,7 @@
     }
 
     @Override
-    public void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
+    public synchronized void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
         super.dump(fd, pw, args);
         pw.println("Dumping existing controllers:");
         mDependencies.values().stream().filter(obj -> obj instanceof Dumpable)
@@ -273,7 +273,7 @@
     }
 
     @Override
-    protected void onConfigurationChanged(Configuration newConfig) {
+    protected synchronized void onConfigurationChanged(Configuration newConfig) {
         super.onConfigurationChanged(newConfig);
         mDependencies.values().stream().filter(obj -> obj instanceof ConfigurationChangedReceiver)
                 .forEach(o -> ((ConfigurationChangedReceiver) o).onConfigurationChanged(newConfig));
@@ -287,7 +287,7 @@
         return getDependencyInner(key);
     }
 
-    private <T> T getDependencyInner(Object key) {
+    private synchronized <T> T getDependencyInner(Object key) {
         @SuppressWarnings("unchecked")
         T obj = (T) mDependencies.get(key);
         if (obj == null) {
