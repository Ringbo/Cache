diff --git a/jib-core/src/main/java/com/google/cloud/tools/jib/ncache/CacheStorage.java b/jib-core/src/main/java/com/google/cloud/tools/jib/ncache/CacheStorage.java
index 277654e..1846945 100644
--- a/jib-core/src/main/java/com/google/cloud/tools/jib/ncache/CacheStorage.java
+++ b/jib-core/src/main/java/com/google/cloud/tools/jib/ncache/CacheStorage.java
@@ -24,8 +24,8 @@
 /**
  * Interface for queries to a cache storage engine.
  *
- * <p>The cache storage engine stores layer data as {@link CacheWriteEntry}s. These entries are read
- * out as {@link CacheReadEntry}s. Cache entries can be retrieved by the layer digest.
+ * <p>The cache storage engine stores layer data as {@link CacheWrite}s. These entries are read out
+ * as {@link CacheEntry}s. Cache entries can be retrieved by the layer digest.
  *
  * <p>The cache entries can also be queried by an arbitrarily-defined selector (in digest format).
  * The selectors do not need to be unique. An example of a selector could be the digest of the list
@@ -36,13 +36,13 @@
 public interface CacheStorage {
 
   /**
-   * Saves the {@link CacheWriteEntry}.
+   * Saves the {@link CacheWrite}.
    *
-   * @param cacheWriteEntry the {@link CacheWriteEntry}
-   * @return the {@link CacheReadEntry} for the written {@link CacheWriteEntry}
+   * @param cacheWrite the {@link CacheWrite}
+   * @return the {@link CacheEntry} for the written {@link CacheWrite}
    * @throws IOException if an I/O exception occurs
    */
-  CacheReadEntry save(CacheWriteEntry cacheWriteEntry) throws IOException;
+  CacheEntry write(CacheWrite cacheWrite) throws IOException;
 
   /**
    * Lists all the layer digests stored.
@@ -53,20 +53,20 @@
   List<DescriptorDigest> listDigests() throws IOException;
 
   /**
-   * Retrieves the {@link CacheReadEntry} for the layer with digest {@code layerDigest}.
+   * Retrieves the {@link CacheEntry} for the layer with digest {@code layerDigest}.
    *
    * @param layerDigest the layer digest
-   * @return the {@link CacheReadEntry} referenced by the layer digest
+   * @return the {@link CacheEntry} referenced by the layer digest
    * @throws IOException if an I/O exception occurs
    */
-  Optional<CacheReadEntry> retrieve(DescriptorDigest layerDigest) throws IOException;
+  Optional<CacheEntry> retrieve(DescriptorDigest layerDigest) throws IOException;
 
   /**
    * Queries for layer digests that can be selected with the {@code selector}.
    *
    * @param selector the selector to query with
-   * @return the list of layer digests selected
+   * @return the layer digest selected, or {@link Optional#empty} if none found
    * @throws IOException if an I/O exception occurs
    */
-  List<DescriptorDigest> listDigestsBySelector(DescriptorDigest selector) throws IOException;
+  Optional<DescriptorDigest> select(DescriptorDigest selector) throws IOException;
 }
