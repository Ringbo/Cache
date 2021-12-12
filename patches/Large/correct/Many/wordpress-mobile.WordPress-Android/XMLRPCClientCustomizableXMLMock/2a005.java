diff --git a/tests/java/org/wordpress/android/mocks/XMLRPCClientCustomizableXMLMock.java b/tests/java/org/wordpress/android/mocks/XMLRPCClientCustomizableXMLMock.java
index 2e04cb5..bf38549 100644
--- a/tests/java/org/wordpress/android/mocks/XMLRPCClientCustomizableXMLMock.java
+++ b/tests/java/org/wordpress/android/mocks/XMLRPCClientCustomizableXMLMock.java
@@ -32,7 +32,7 @@
         String filename = prefix + "-" + method + ".xml";
         try {
             InputStream is = mContext.getAssets().open(filename);
-            return XMLRPCClient.parseXMLRPCResponse(is);
+            return XMLRPCClient.parseXMLRPCResponse(is, null);
         } catch (FileNotFoundException e) {
             AppLog.e(T.TESTS, "file not found: " + filename);
         } catch (Exception e) {
