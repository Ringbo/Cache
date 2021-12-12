diff --git a/support/cas-server-support-consent-rest/src/main/java/org/apereo/cas/consent/RestConsentRepository.java b/support/cas-server-support-consent-rest/src/main/java/org/apereo/cas/consent/RestConsentRepository.java
index 68b138d..f6400ba 100644
--- a/support/cas-server-support-consent-rest/src/main/java/org/apereo/cas/consent/RestConsentRepository.java
+++ b/support/cas-server-support-consent-rest/src/main/java/org/apereo/cas/consent/RestConsentRepository.java
@@ -57,7 +57,7 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage(), e);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     @Override
@@ -74,7 +74,7 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage(), e);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     @Override
