diff --git a/support/cas-server-support-consent-jdbc/src/main/java/org/apereo/cas/consent/JpaConsentRepository.java b/support/cas-server-support-consent-jdbc/src/main/java/org/apereo/cas/consent/JpaConsentRepository.java
index 45fafc4..03ae42e 100644
--- a/support/cas-server-support-consent-jdbc/src/main/java/org/apereo/cas/consent/JpaConsentRepository.java
+++ b/support/cas-server-support-consent-jdbc/src/main/java/org/apereo/cas/consent/JpaConsentRepository.java
@@ -49,7 +49,7 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage());
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     @Override
@@ -61,7 +61,7 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage());
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     @Override
