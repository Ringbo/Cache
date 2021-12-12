diff --git a/src/main/java/com/fasterxml/jackson/databind/util/StdDateFormat.java b/src/main/java/com/fasterxml/jackson/databind/util/StdDateFormat.java
index 8bc7921..3faefb9 100644
--- a/src/main/java/com/fasterxml/jackson/databind/util/StdDateFormat.java
+++ b/src/main/java/com/fasterxml/jackson/databind/util/StdDateFormat.java
@@ -447,8 +447,11 @@
             df = _formatISO8601_z;
             formatStr = DATE_FORMAT_STR_ISO8601_Z;
             if (df == null) {
+                // 10-Jun-2017, tatu: As per [databind#1651], when using this format,
+                //    must use UTC, not whatever is configured as default timezone
+                //    (because we know `Z` identifier is used)
                 df = _formatISO8601_z = _cloneFormat(DATE_FORMAT_ISO8601_Z, formatStr,
-                        _timezone, _locale, _lenient);
+                        DEFAULT_TIMEZONE, _locale, _lenient);
             }
             // may be missing milliseconds... if so, add
             if (dateStr.charAt(len-4) == ':') {
@@ -520,8 +523,11 @@
                 df = _formatISO8601_z;
                 formatStr = DATE_FORMAT_STR_ISO8601_Z;
                 if (df == null) {
+                    // 10-Jun-2017, tatu: As per [databind#1651], when using this format,
+                    //    must use UTC, not whatever is configured as default timezone
+                    //    (because we know `Z` identifier is used)
                     df = _formatISO8601_z = _cloneFormat(DATE_FORMAT_ISO8601_Z, formatStr,
-                            _timezone, _locale, _lenient);
+                            DEFAULT_TIMEZONE, _locale, _lenient);
                 }
             }
         }
