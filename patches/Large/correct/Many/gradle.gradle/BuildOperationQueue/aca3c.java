diff --git a/subprojects/base-services/src/main/java/org/gradle/internal/operations/BuildOperationQueue.java b/subprojects/base-services/src/main/java/org/gradle/internal/operations/BuildOperationQueue.java
index 2d1a90e..b12bab6 100644
--- a/subprojects/base-services/src/main/java/org/gradle/internal/operations/BuildOperationQueue.java
+++ b/subprojects/base-services/src/main/java/org/gradle/internal/operations/BuildOperationQueue.java
@@ -33,12 +33,12 @@
      *
      * @param operation operation to execute
      */
-    public void add(T operation);
+    void add(T operation);
 
     /**
      * Cancels all queued operations in this queue.  Any operations that have started will be allowed to complete.
      */
-    public void cancel();
+    void cancel();
 
     /**
      * Waits for all previously added operations to complete.
@@ -47,10 +47,10 @@
      *
      * @throws MultipleBuildOperationFailures if <em>any</em> operation failed
      */
-    public void waitForCompletion() throws MultipleBuildOperationFailures;
+    void waitForCompletion() throws MultipleBuildOperationFailures;
 
     /**
      * Sets the location of a log file where build operation output can be found.  For use in exceptions.
      */
-    public void setLogLocation(String logLocation);
+    void setLogLocation(String logLocation);
 }
