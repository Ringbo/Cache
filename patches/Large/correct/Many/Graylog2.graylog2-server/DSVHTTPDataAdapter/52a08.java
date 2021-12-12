diff --git a/graylog2-server/src/main/java/org/graylog2/lookup/adapters/DSVHTTPDataAdapter.java b/graylog2-server/src/main/java/org/graylog2/lookup/adapters/DSVHTTPDataAdapter.java
index 47337c4..eb6ef3e 100644
--- a/graylog2-server/src/main/java/org/graylog2/lookup/adapters/DSVHTTPDataAdapter.java
+++ b/graylog2-server/src/main/java/org/graylog2/lookup/adapters/DSVHTTPDataAdapter.java
@@ -170,8 +170,8 @@
                     .lineSeparator("\n")
                     .quotechar("\"")
                     .ignorechar("#")
-                    .keyColumn(1)
-                    .valueColumn(2)
+                    .keyColumn(0)
+                    .valueColumn(1)
                     .refreshInterval(60)
                     .caseInsensitiveLookup(false)
                     .checkPresenceOnly(false)
