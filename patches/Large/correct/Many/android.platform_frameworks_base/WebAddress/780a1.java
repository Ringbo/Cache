diff --git a/core/java/android/net/WebAddress.java b/core/java/android/net/WebAddress.java
index a572f60..e5bc6e3 100644
--- a/core/java/android/net/WebAddress.java
+++ b/core/java/android/net/WebAddress.java
@@ -57,7 +57,7 @@
             /* scheme    */ "(?:(http|HTTP|https|HTTPS|file|FILE)\\:\\/\\/)?" +
             /* authority */ "(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?" +
             /* host      */ "([-" + GOOD_IRI_CHAR + "%_]+(?:\\.[-" + GOOD_IRI_CHAR + "%_]+)*|\\[[0-9a-fA-F:\\.]+\\])?" +
-            /* port      */ "(?:\\:([0-9]+))?" +
+            /* port      */ "(?:\\:([0-9]*))?" +
             /* path      */ "(\\/?[^#]*)?" +
             /* anchor    */ ".*");
 
@@ -85,7 +85,8 @@
             t = m.group(MATCH_GROUP_HOST);
             if (t != null) mHost = t;
             t = m.group(MATCH_GROUP_PORT);
-            if (t != null) {
+            if (t != null && t.length() > 0) {
+                // The ':' character is not returned by the regex.
                 try {
                     mPort = Integer.parseInt(t);
                 } catch (NumberFormatException ex) {
