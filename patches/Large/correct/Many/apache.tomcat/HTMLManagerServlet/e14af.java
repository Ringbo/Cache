diff --git a/java/org/apache/catalina/manager/HTMLManagerServlet.java b/java/org/apache/catalina/manager/HTMLManagerServlet.java
index 79ef115..a1dd6db 100644
--- a/java/org/apache/catalina/manager/HTMLManagerServlet.java
+++ b/java/org/apache/catalina/manager/HTMLManagerServlet.java
@@ -382,7 +382,7 @@
 
             Map.Entry entry = (Map.Entry) iterator.next();
             String displayPath = (String) entry.getKey();
-            String contextPath = (String) entry.getKey();
+            String contextPath = (String) entry.getValue();
             Context context = (Context) host.findChild(contextPath);
             if (displayPath.equals("")) {
                 displayPath = "/";
