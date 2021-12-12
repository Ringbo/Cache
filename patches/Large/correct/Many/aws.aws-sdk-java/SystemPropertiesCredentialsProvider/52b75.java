diff --git a/aws-java-sdk-core/src/main/java/com/amazonaws/auth/SystemPropertiesCredentialsProvider.java b/aws-java-sdk-core/src/main/java/com/amazonaws/auth/SystemPropertiesCredentialsProvider.java
index 010e660..f7fa798 100644
--- a/aws-java-sdk-core/src/main/java/com/amazonaws/auth/SystemPropertiesCredentialsProvider.java
+++ b/aws-java-sdk-core/src/main/java/com/amazonaws/auth/SystemPropertiesCredentialsProvider.java
@@ -51,7 +51,7 @@
         if (StringUtils.isNullOrEmpty(sessionToken)) {
             return new BasicAWSCredentials(accessKey, secretKey);
         } else {
-            return new BasicAWSSessionCredentials(accessKey, secretKey, sessionToken);
+            return new BasicSessionCredentials(accessKey, secretKey, sessionToken);
         }
     }
 
