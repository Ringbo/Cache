diff --git a/core/cas-server-core-tickets/src/main/java/org/apereo/cas/ticket/support/MultiTimeUseOrTimeoutExpirationPolicy.java b/core/cas-server-core-tickets/src/main/java/org/apereo/cas/ticket/support/MultiTimeUseOrTimeoutExpirationPolicy.java
index 276dc0c..e358e65 100644
--- a/core/cas-server-core-tickets/src/main/java/org/apereo/cas/ticket/support/MultiTimeUseOrTimeoutExpirationPolicy.java
+++ b/core/cas-server-core-tickets/src/main/java/org/apereo/cas/ticket/support/MultiTimeUseOrTimeoutExpirationPolicy.java
@@ -79,7 +79,7 @@
         final ZonedDateTime expirationTime = lastTimeUsed.plus(this.timeToKillInSeconds, ChronoUnit.SECONDS);
 
         if (systemTime.isAfter(expirationTime)) {
-            LOGGER.warn("Ticket has expired because the difference between current time [{}] and ticket time [{}] is greater than or equal to [{}].",
+            LOGGER.debug("Ticket has expired because the difference between current time [{}] and ticket time [{}] is greater than or equal to [{}].",
                     systemTime, lastTimeUsed, this.timeToKillInSeconds);
             return true;
         }
