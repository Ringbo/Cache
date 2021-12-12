diff --git a/config/src/main/java/org/springframework/security/config/annotation/web/configurers/HeadersConfigurer.java b/config/src/main/java/org/springframework/security/config/annotation/web/configurers/HeadersConfigurer.java
index b58d5a3..fb4cfda 100644
--- a/config/src/main/java/org/springframework/security/config/annotation/web/configurers/HeadersConfigurer.java
+++ b/config/src/main/java/org/springframework/security/config/annotation/web/configurers/HeadersConfigurer.java
@@ -71,7 +71,7 @@
      * @return the {@link HeadersConfigurer} for additional customizations
      */
     public HeadersConfigurer<H> xssProtection() {
-        return addHeaderWriter(new XContentTypeOptionsHeaderWriter());
+        return addHeaderWriter(new XXssProtectionHeaderWriter());
     }
 
     /**
