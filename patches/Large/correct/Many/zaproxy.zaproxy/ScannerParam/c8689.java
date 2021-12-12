diff --git a/src/org/parosproxy/paros/core/scanner/ScannerParam.java b/src/org/parosproxy/paros/core/scanner/ScannerParam.java
index 6261ee3..1bce1ca 100644
--- a/src/org/parosproxy/paros/core/scanner/ScannerParam.java
+++ b/src/org/parosproxy/paros/core/scanner/ScannerParam.java
@@ -134,7 +134,7 @@
 
     // Internal variables
     private int hostPerScan = 2;
-    private int threadPerHost = 1;
+    private int threadPerHost = 2;
     private int delayInMs = 0;
     private int maxResultsToList = 1000;
     private int maxScansInUI = 5;
@@ -193,7 +193,7 @@
     protected void parse() {
         removeOldOptions();
 
-        this.threadPerHost = getInt(THREAD_PER_HOST, 1);
+        this.threadPerHost = getInt(THREAD_PER_HOST, 2);
 
         this.hostPerScan = getInt(HOST_PER_SCAN, 2);
 
