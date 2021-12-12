diff --git a/core/src/main/java/tachyon/client/TachyonFS.java b/core/src/main/java/tachyon/client/TachyonFS.java
index e266543..3e85f2c 100644
--- a/core/src/main/java/tachyon/client/TachyonFS.java
+++ b/core/src/main/java/tachyon/client/TachyonFS.java
@@ -577,11 +577,11 @@
    * @param fileId the id of the queried file. If it is -1, uses path.
    * @param path the path of the queried file. If fielId is not -1, this parameter is ignored.
    * @param useCachedMetaData whether to use the cached data or not.
-   * @return
+   * @return the clientFileInfo.
    * @throws IOException
    */
-  private synchronized <KeyType> ClientFileInfo getFileStatus(Map<KeyType, ClientFileInfo> cache,
-      KeyType key, int fileId, String path, boolean useCachedMetaData) throws IOException {
+  private synchronized <K> ClientFileInfo getFileStatus(Map<K, ClientFileInfo> cache, K key,
+      int fileId, String path, boolean useCachedMetaData) throws IOException {
     ClientFileInfo info = null;
     if (useCachedMetaData) {
       info = cache.get(key);
