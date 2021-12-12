diff --git a/tests/DumpRenderTree/src/com/android/dumprendertree/CallbackProxy.java b/tests/DumpRenderTree/src/com/android/dumprendertree/CallbackProxy.java
index 39ce1f2..97a8b25 100644
--- a/tests/DumpRenderTree/src/com/android/dumprendertree/CallbackProxy.java
+++ b/tests/DumpRenderTree/src/com/android/dumprendertree/CallbackProxy.java
@@ -341,7 +341,7 @@
     }
 
     public void clearAllDatabases() {
-        WebStorage.getInstance().deleteAllDatabases();
+        WebStorage.getInstance().deleteAllData();
     }
 
     public void setDatabaseQuota(long quota) {
