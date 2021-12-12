diff --git a/core-common/src/main/java/org/glassfish/jersey/message/internal/MediaTypes.java b/core-common/src/main/java/org/glassfish/jersey/message/internal/MediaTypes.java
index 2af3394..9388f25 100644
--- a/core-common/src/main/java/org/glassfish/jersey/message/internal/MediaTypes.java
+++ b/core-common/src/main/java/org/glassfish/jersey/message/internal/MediaTypes.java
@@ -316,7 +316,7 @@
      *         {@link #QUALITY_SOURCE_MEDIA_TYPE_COMPARATOR}.
      */
     public static List<MediaType> createQualitySourceMediaTypes(Produces mime) {
-        if (mime == null) {
+        if (mime == null || mime.value().length == 0) {
             return GENERAL_QUALITY_SOURCE_MEDIA_TYPE_LIST;
         }
 
