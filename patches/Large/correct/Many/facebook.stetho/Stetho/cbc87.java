diff --git a/stetho/src/main/java/com/facebook/stetho/Stetho.java b/stetho/src/main/java/com/facebook/stetho/Stetho.java
index 819d74d..c474679 100644
--- a/stetho/src/main/java/com/facebook/stetho/Stetho.java
+++ b/stetho/src/main/java/com/facebook/stetho/Stetho.java
@@ -274,7 +274,7 @@
       provideIfDesired(new Network(mContext));
       provideIfDesired(new Page(mContext));
       provideIfDesired(new Profiler());
-      provideIfDesired(new Runtime());
+      provideIfDesired(new Runtime(mContext));
       provideIfDesired(new Worker());
       if (Build.VERSION.SDK_INT >= DatabaseConstants.MIN_API_LEVEL) {
         provideIfDesired(new Database(mContext, new DefaultDatabaseFilesProvider(mContext)));
