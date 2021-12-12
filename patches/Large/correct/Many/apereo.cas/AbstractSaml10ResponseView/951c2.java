diff --git a/cas-server-support-saml/src/main/java/org/jasig/cas/support/saml/web/view/AbstractSaml10ResponseView.java b/cas-server-support-saml/src/main/java/org/jasig/cas/support/saml/web/view/AbstractSaml10ResponseView.java
index d2a8abe..a3c4c4f 100644
--- a/cas-server-support-saml/src/main/java/org/jasig/cas/support/saml/web/view/AbstractSaml10ResponseView.java
+++ b/cas-server-support-saml/src/main/java/org/jasig/cas/support/saml/web/view/AbstractSaml10ResponseView.java
@@ -88,7 +88,7 @@
         try {
             response.setCharacterEncoding(this.encoding);
             final WebApplicationService service = this.samlArgumentExtractor.extractService(request);
-            if (StringUtils.isBlank(service.getId())) {
+            if (service == null || StringUtils.isBlank(service.getId())) {
                 serviceId = "UNKNOWN";
             } else {
                 serviceId = new URL(service.getId()).getHost();
