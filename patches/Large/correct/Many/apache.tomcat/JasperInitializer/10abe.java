diff --git a/java/org/apache/jasper/servlet/JasperInitializer.java b/java/org/apache/jasper/servlet/JasperInitializer.java
index b7cf07f..2160b30 100644
--- a/java/org/apache/jasper/servlet/JasperInitializer.java
+++ b/java/org/apache/jasper/servlet/JasperInitializer.java
@@ -49,7 +49,7 @@
             LOG.debug(Localizer.getMessage(MSG + ".onStartup", context.getServletContextName()));
         }
 
-        boolean validate = Boolean.valueOf(context.getInitParameter(VALIDATE));
+        boolean validate = Boolean.parseBoolean(context.getInitParameter(VALIDATE));
 
         // scan the application for TLDs
         TldScanner scanner = new TldScanner(context, true, validate);
