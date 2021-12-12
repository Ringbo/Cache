diff --git a/web/src/main/java/org/apache/shiro/web/util/RedirectView.java b/web/src/main/java/org/apache/shiro/web/util/RedirectView.java
index 359ca80..8e039b1 100644
--- a/web/src/main/java/org/apache/shiro/web/util/RedirectView.java
+++ b/web/src/main/java/org/apache/shiro/web/util/RedirectView.java
@@ -191,7 +191,7 @@
             Map model, HttpServletRequest request, HttpServletResponse response) throws IOException {
 
         // Prepare name URL.
-        StringBuffer targetUrl = new StringBuffer();
+        StringBuilder targetUrl = new StringBuilder();
         if (this.contextRelative && getUrl().startsWith("/")) {
             // Do not apply context path to relative URLs.
             targetUrl.append(request.getContextPath());
@@ -214,12 +214,8 @@
      * @see #urlEncode
      * @see #queryProperties
      * @see #urlEncode(String, String)
-     * @deprecated this method accepts a less-than-ideal StringBuffer argument and will be replaced by
-     * a StringBuilder argument in the next major version (2.x) of Shiro.  It remains in place to retain
-     * 1.0 -> 1.1 backwards compatibility.  See <a href="https://issues.apache.org/jira/browse/SHIRO-196">SHIRO-196</a>.
      */
-    @Deprecated
-    protected void appendQueryProperties(StringBuffer targetUrl, Map model, String encodingScheme)
+    protected void appendQueryProperties(StringBuilder targetUrl, Map model, String encodingScheme)
             throws UnsupportedEncodingException {
 
         // Extract anchor fragment, if any.
