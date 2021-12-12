diff --git a/src/com/facebook/buck/jvm/java/JavaBuckConfig.java b/src/com/facebook/buck/jvm/java/JavaBuckConfig.java
index 7720d44..27d0225 100644
--- a/src/com/facebook/buck/jvm/java/JavaBuckConfig.java
+++ b/src/com/facebook/buck/jvm/java/JavaBuckConfig.java
@@ -113,7 +113,7 @@
   }
 
   public boolean getSkipCheckingMissingDeps() {
-    return delegate.getBooleanValue("java", "skip_checking_missing_deps", false);
+    return delegate.getBooleanValue("java", "skip_checking_missing_deps", true);
   }
 
   public Optional<Integer> getDxThreadCount() {
