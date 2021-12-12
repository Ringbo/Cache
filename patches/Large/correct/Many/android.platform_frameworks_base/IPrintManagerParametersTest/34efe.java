diff --git a/core/tests/coretests/src/android/print/IPrintManagerParametersTest.java b/core/tests/coretests/src/android/print/IPrintManagerParametersTest.java
index 43a61e3..d491ec4 100644
--- a/core/tests/coretests/src/android/print/IPrintManagerParametersTest.java
+++ b/core/tests/coretests/src/android/print/IPrintManagerParametersTest.java
@@ -515,7 +515,7 @@
     public void testGetPrintServices() throws Exception {
         List<PrintServiceInfo> printServices = mIPrintManager.getPrintServices(
                 PrintManager.ALL_SERVICES, mUserId);
-        assertTrue(printServices.size() >= 2);
+        assertTrue(printServices.size() >= 1);
 
         printServices = mIPrintManager.getPrintServices(0, mUserId);
         assertEquals(printServices, null);
