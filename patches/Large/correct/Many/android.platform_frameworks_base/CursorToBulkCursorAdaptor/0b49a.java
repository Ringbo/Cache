diff --git a/core/java/android/database/CursorToBulkCursorAdaptor.java b/core/java/android/database/CursorToBulkCursorAdaptor.java
index 19ad946..748eb99 100644
--- a/core/java/android/database/CursorToBulkCursorAdaptor.java
+++ b/core/java/android/database/CursorToBulkCursorAdaptor.java
@@ -143,8 +143,7 @@
 
     public void close() {
         maybeUnregisterObserverProxy();
-        mCursor.deactivate();       
-        
+        mCursor.close();
     }
 
     public int requery(IContentObserver observer, CursorWindow window) {
