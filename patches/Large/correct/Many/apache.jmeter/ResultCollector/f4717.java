diff --git a/src/core/org/apache/jmeter/reporters/ResultCollector.java b/src/core/org/apache/jmeter/reporters/ResultCollector.java
index f082035..4c03cf8 100644
--- a/src/core/org/apache/jmeter/reporters/ResultCollector.java
+++ b/src/core/org/apache/jmeter/reporters/ResultCollector.java
@@ -122,7 +122,7 @@
     //@GuardedBy("LOCK")
     private static int instanceCount; // Keep track of how many instances are active
 
-    // Instance variables
+    // Instance variables (guarded by volatile)
     
     private transient volatile PrintWriter out;
 
@@ -131,7 +131,7 @@
     private volatile boolean isStats = false;
     
     /** the summarizer to which this result collector will forward the samples */
-    private Summariser summariser;
+    private volatile Summariser summariser;
 
     /**
      * No-arg constructor.
@@ -170,11 +170,11 @@
         return getPropertyAsBoolean(ERROR_LOGGING);
     }
 
-    public void setErrorLogging(boolean errorLogging) {
+    public final void setErrorLogging(boolean errorLogging) {
         setProperty(new BooleanProperty(ERROR_LOGGING, errorLogging));
     }
 
-    public void setSuccessOnlyLogging(boolean value) {
+    public final void setSuccessOnlyLogging(boolean value) {
         if (value) {
             setProperty(new BooleanProperty(SUCCESS_ONLY_LOGGING, true));
         } else {
@@ -248,7 +248,7 @@
         }
     }
 
-    public synchronized void testStarted(String host) {
+    public void testStarted(String host) {
         synchronized(LOCK){
             instanceCount++;
             try {
