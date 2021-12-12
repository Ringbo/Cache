diff --git a/src/org/parosproxy/paros/model/SiteMap.java b/src/org/parosproxy/paros/model/SiteMap.java
index 822d09a..43b955d 100644
--- a/src/org/parosproxy/paros/model/SiteMap.java
+++ b/src/org/parosproxy/paros/model/SiteMap.java
@@ -541,7 +541,8 @@
         }
         HttpMessage newMsg = base.cloneRequest();
         
-        URI uri = new URI(sb.toString(), true);
+        // ZAP: Prevents a possible URIException, because the passed string is not escaped.
+        URI uri = new URI(sb.toString(), false);
         newMsg.getRequestHeader().setURI(uri);
         newMsg.getRequestHeader().setMethod(HttpRequestHeader.GET);
         newMsg.getRequestBody().setBody("");
