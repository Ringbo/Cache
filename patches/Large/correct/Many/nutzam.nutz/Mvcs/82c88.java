diff --git a/src/org/nutz/mvc/Mvcs.java b/src/org/nutz/mvc/Mvcs.java
index 79b62fa..3b8833c 100644
--- a/src/org/nutz/mvc/Mvcs.java
+++ b/src/org/nutz/mvc/Mvcs.java
@@ -151,7 +151,7 @@
     public static void updateRequestAttributes(HttpServletRequest req) {
         // 初始化本次请求的多国语言字符串
         Map<String, Map<String, Object>> msgss = getMessageSet();
-        if (msgss == null)
+        if (msgss == null && !ctx.localizations.isEmpty())
         	msgss = ctx.localizations.values().iterator().next();
         if (null != msgss) {
             Map<String, Object> msgs = null;
