diff --git a/src/org/nutz/mvc/filter/CrossOriginFilter.java b/src/org/nutz/mvc/filter/CrossOriginFilter.java
index 91b272e..e525d10 100644
--- a/src/org/nutz/mvc/filter/CrossOriginFilter.java
+++ b/src/org/nutz/mvc/filter/CrossOriginFilter.java
@@ -36,13 +36,13 @@
     public View match(ActionContext ac) {
         HttpServletResponse resp = ac.getResponse();
         if (!Strings.isBlank(origin))
-            resp.addHeader("Access-Control-Allow-Origin", origin);
+            resp.setHeader("Access-Control-Allow-Origin", origin);
         if (!Strings.isBlank(methods))
-            resp.addHeader("Access-Control-Allow-Methods", methods);
+            resp.setHeader("Access-Control-Allow-Methods", methods);
         if (!Strings.isBlank(headers))
-            resp.addHeader("Access-Control-Allow-Headers", headers);
+            resp.setHeader("Access-Control-Allow-Headers", headers);
         if (!Strings.isBlank(credentials))
-            resp.addHeader("Access-Control-Allow-Credentials", credentials);
+            resp.setHeader("Access-Control-Allow-Credentials", credentials);
         
         if ("OPTIONS".equals(ac.getRequest().getMethod())) {
             if (log.isDebugEnabled())
