diff --git a/elasticsearch/x-pack/license-plugin/src/main/java/org/elasticsearch/license/plugin/core/LicensesService.java b/elasticsearch/x-pack/license-plugin/src/main/java/org/elasticsearch/license/plugin/core/LicensesService.java
index fe0be87..1bece25 100644
--- a/elasticsearch/x-pack/license-plugin/src/main/java/org/elasticsearch/license/plugin/core/LicensesService.java
+++ b/elasticsearch/x-pack/license-plugin/src/main/java/org/elasticsearch/license/plugin/core/LicensesService.java
@@ -515,7 +515,7 @@
             logger.debug("notifying [{}] listeners", registeredLicensees.size());
             long now = System.currentTimeMillis();
             if (license.issueDate() > now) {
-                logger.info("license [{}] - invalid", license.uid());
+                logger.warn("license [{}] - invalid", license.uid());
                 return;
             }
             long expiryDuration = license.expiryDate() - now;
@@ -523,7 +523,7 @@
                 for (InternalLicensee licensee : registeredLicensees) {
                     licensee.onChange(license, LicenseState.ENABLED);
                 }
-                logger.info("license [{}] - valid", license.uid());
+                logger.debug("license [{}] - valid", license.uid());
                 final TimeValue delay = TimeValue.timeValueMillis(expiryDuration);
                 // cancel any previous notifications
                 cancelNotifications(expiryNotifications);
@@ -537,7 +537,7 @@
                 for (InternalLicensee licensee : registeredLicensees) {
                     licensee.onChange(license, LicenseState.GRACE_PERIOD);
                 }
-                logger.info("license [{}] - grace", license.uid());
+                logger.warn("license [{}] - grace", license.uid());
                 final TimeValue delay = TimeValue.timeValueMillis(expiryDuration + gracePeriodDuration.getMillis());
                 // cancel any previous notifications
                 cancelNotifications(expiryNotifications);
@@ -551,7 +551,7 @@
                 for (InternalLicensee licensee : registeredLicensees) {
                     licensee.onChange(license, LicenseState.DISABLED);
                 }
-                logger.info("license [{}] - expired", license.uid());
+                logger.warn("license [{}] - expired", license.uid());
             }
             if (!license.equals(currentLicense.get())) {
                 currentLicense.set(license);
