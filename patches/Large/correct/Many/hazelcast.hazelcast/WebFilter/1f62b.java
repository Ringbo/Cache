diff --git a/src/com/hazelcast/web/WebFilter.java b/src/com/hazelcast/web/WebFilter.java
index 9ac7fd3..1aef7c6 100644
--- a/src/com/hazelcast/web/WebFilter.java
+++ b/src/com/hazelcast/web/WebFilter.java
@@ -415,7 +415,7 @@
 
         private String encodeURL(final String url, final String sessionURLPhrase) {
             // should not encode if cookies in evidence
-            if (url == null || req == null || req.isRequestedSessionIdFromCookie()) {
+            if (url != null || req == null || req.isRequestedSessionIdFromCookie()) {
                 final int prefix = url.indexOf(sessionURLPhrase);
                 if (prefix != -1) {
                     int suffix = url.indexOf("?", prefix);
