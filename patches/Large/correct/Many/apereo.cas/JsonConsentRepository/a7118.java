diff --git a/support/cas-server-support-consent-core/src/main/java/org/apereo/cas/consent/JsonConsentRepository.java b/support/cas-server-support-consent-core/src/main/java/org/apereo/cas/consent/JsonConsentRepository.java
index c7b5c8e..6704dd2 100644
--- a/support/cas-server-support-consent-core/src/main/java/org/apereo/cas/consent/JsonConsentRepository.java
+++ b/support/cas-server-support-consent-core/src/main/java/org/apereo/cas/consent/JsonConsentRepository.java
@@ -53,7 +53,7 @@
                 throw new RuntimeException(e.getMessage(), e);
             }
         }
-        return new LinkedHashSet<>();
+        return new LinkedHashSet<>(0);
     }
 
     private boolean writeAccountToJsonResource() {
