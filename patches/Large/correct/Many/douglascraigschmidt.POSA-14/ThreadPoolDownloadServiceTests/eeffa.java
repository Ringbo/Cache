diff --git a/grading-drivers/week-6-assignment-5/W6-A5-ThreadedDownloads-StartedServices-Tests/src/edu/vuum/mocca/test/ThreadPoolDownloadServiceTests.java b/grading-drivers/week-6-assignment-5/W6-A5-ThreadedDownloads-StartedServices-Tests/src/edu/vuum/mocca/test/ThreadPoolDownloadServiceTests.java
index ddfeab7..c1cc602 100644
--- a/grading-drivers/week-6-assignment-5/W6-A5-ThreadedDownloads-StartedServices-Tests/src/edu/vuum/mocca/test/ThreadPoolDownloadServiceTests.java
+++ b/grading-drivers/week-6-assignment-5/W6-A5-ThreadedDownloads-StartedServices-Tests/src/edu/vuum/mocca/test/ThreadPoolDownloadServiceTests.java
@@ -140,7 +140,7 @@
         Thread.sleep(Options.SHORT_WAIT_TIME);	
 
         //Create an Intent to start the service
-        mIntent = ThreadPoolIntentService.makeIntent(getContext(), 
+        mIntent = ThreadPoolDownloadService.makeIntent(getContext(), 
                                                      mHandler, 
                                                      Options.TEST_URI);        
 
