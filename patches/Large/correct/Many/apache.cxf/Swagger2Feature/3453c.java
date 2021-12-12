diff --git a/rt/rs/description-swagger/src/main/java/org/apache/cxf/jaxrs/swagger/Swagger2Feature.java b/rt/rs/description-swagger/src/main/java/org/apache/cxf/jaxrs/swagger/Swagger2Feature.java
index 4679e6e..b85f35d 100644
--- a/rt/rs/description-swagger/src/main/java/org/apache/cxf/jaxrs/swagger/Swagger2Feature.java
+++ b/rt/rs/description-swagger/src/main/java/org/apache/cxf/jaxrs/swagger/Swagger2Feature.java
@@ -327,7 +327,7 @@
         // terms of service url
         String theTermsUrl = getTermsOfServiceUrl();
         if (theTermsUrl == null && props != null) {
-            theContact = props.getProperty(TERMS_URL_PROPERTY);
+            theTermsUrl = props.getProperty(TERMS_URL_PROPERTY);
         }
         beanConfig.setTermsOfServiceUrl(theTermsUrl);
         
