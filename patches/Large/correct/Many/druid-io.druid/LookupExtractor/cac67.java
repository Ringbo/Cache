diff --git a/processing/src/main/java/io/druid/query/extraction/LookupExtractor.java b/processing/src/main/java/io/druid/query/extraction/LookupExtractor.java
index 091f1f1..2de937d 100644
--- a/processing/src/main/java/io/druid/query/extraction/LookupExtractor.java
+++ b/processing/src/main/java/io/druid/query/extraction/LookupExtractor.java
@@ -44,7 +44,7 @@
    * @return The lookup, or null key cannot have the lookup applied to it and should be treated as missing.
    */
   @Nullable
-  abstract String apply(@NotNull String key);
+  public abstract String apply(@NotNull String key);
 
   /**
    * @param keys set of keys to apply lookup for each element
@@ -54,7 +54,7 @@
    * User can override this method if there is a better way to perform bulk lookup
    */
 
-  Map<String, String> applyAll(Iterable<String> keys)
+  public Map<String, String> applyAll(Iterable<String> keys)
   {
     if (keys == null) {
       return Collections.emptyMap();
@@ -88,7 +88,7 @@
    * User can override this method if there is a better way to perform bulk reverse lookup
    */
 
-  Map<String, List<String>> unapplyAll(Iterable<String> values)
+  public Map<String, List<String>> unapplyAll(Iterable<String> values)
   {
     if (values == null) {
       return Collections.emptyMap();
@@ -107,5 +107,5 @@
    */
 
   @Nullable
-  abstract byte[] getCacheKey();
+  public abstract byte[] getCacheKey();
 }
