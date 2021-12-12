diff --git a/core/java/com/google/android/gdata2/client/AndroidGDataClient.java b/core/java/com/google/android/gdata2/client/AndroidGDataClient.java
index 4c67eb6..b55ade3 100644
--- a/core/java/com/google/android/gdata2/client/AndroidGDataClient.java
+++ b/core/java/com/google/android/gdata2/client/AndroidGDataClient.java
@@ -464,7 +464,7 @@
                                    GDataSerializer entry)
         throws HttpException, IOException {
         HttpEntity entity = createEntityForEntry(entry, GDataSerializer.FORMAT_UPDATE);
-        final String method = entry.doesSupportPartial() ? "PATCH" : "PUT";
+        final String method = entry.getSupportsPartial() ? "PATCH" : "PUT";
         InputStream in = createAndExecuteMethod(
                 new PostRequestCreator(method, entity),
                 editUri,
