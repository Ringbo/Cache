diff --git a/aws-java-sdk-cloudfront/src/main/java/com/amazonaws/services/cloudfront/util/SignerUtils.java b/aws-java-sdk-cloudfront/src/main/java/com/amazonaws/services/cloudfront/util/SignerUtils.java
index 772153d..f2eaaf5 100644
--- a/aws-java-sdk-cloudfront/src/main/java/com/amazonaws/services/cloudfront/util/SignerUtils.java
+++ b/aws-java-sdk-cloudfront/src/main/java/com/amazonaws/services/cloudfront/util/SignerUtils.java
@@ -54,22 +54,22 @@
      * Returns a custom policy for the given parameters.
      */
     public static String buildCustomPolicy(String resourcePath,
-            Date activeFrom, Date expiresOn, String ipAddress) {
+            Date expiresOn, Date activeFrom, String ipAddress) {
         return "{\"Statement\": [{"
                 + "\"Resource\":\""
                 + resourcePath
                 + "\""
                 + ",\"Condition\":{"
                 + "\"DateLessThan\":{\"AWS:EpochTime\":"
-                + MILLISECONDS.toSeconds(activeFrom.getTime())
+                + MILLISECONDS.toSeconds(expiresOn.getTime())
                 + "}"
                 + ",\"IpAddress\":{\"AWS:SourceIp\":\""
                 + ipAddress
                 + "\"}"
-                + (expiresOn == null
+                + (activeFrom == null
                    ? ""
                    : ",\"DateGreaterThan\":{\"AWS:EpochTime\":"
-                     + MILLISECONDS.toSeconds(expiresOn.getTime()) + "}"
+                     + MILLISECONDS.toSeconds(activeFrom.getTime()) + "}"
                   )
                 + "}}]}";
     }
