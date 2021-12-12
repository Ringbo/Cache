diff --git a/graylog2-inputs/src/main/java/org/graylog2/inputs/syslog/SyslogProcessor.java b/graylog2-inputs/src/main/java/org/graylog2/inputs/syslog/SyslogProcessor.java
index ea929c4..ec13062 100644
--- a/graylog2-inputs/src/main/java/org/graylog2/inputs/syslog/SyslogProcessor.java
+++ b/graylog2-inputs/src/main/java/org/graylog2/inputs/syslog/SyslogProcessor.java
@@ -86,7 +86,7 @@
             lm = parse(msg, remoteAddress);
         } catch (Exception e) {
             parsingFailures.mark();
-            LOG.error("Could not parse syslog message. Not further handling.", e);
+            LOG.warn("Could not parse syslog message. Not further handling.", e);
             return;
         }
 
@@ -193,10 +193,10 @@
         // Check if date could be parsed.
         if (msg.getDate() == null) {
             if (config.getBoolean(SyslogInputBase.CK_ALLOW_OVERRIDE_DATE)) {
-                LOG.info("Date could not be parsed. Was set to NOW because {} is true.", SyslogInputBase.CK_ALLOW_OVERRIDE_DATE);
+                LOG.debug("Date could not be parsed. Was set to NOW because {} is true.", SyslogInputBase.CK_ALLOW_OVERRIDE_DATE);
                 return Tools.iso8601();
             } else {
-                LOG.info("Syslog message is missing date or date could not be parsed. (Possibly set {} to true) "
+                LOG.warn("Syslog message is missing date or date could not be parsed. (Possibly set {} to true) "
                         + "Not further handling. Message was: {}", SyslogInputBase.CK_ALLOW_OVERRIDE_DATE, new String(msg.getRaw()));
                 throw new IllegalStateException();
             }
