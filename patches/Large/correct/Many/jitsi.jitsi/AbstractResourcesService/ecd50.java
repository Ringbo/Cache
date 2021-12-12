diff --git a/src/net/java/sip/communicator/service/resources/AbstractResourcesService.java b/src/net/java/sip/communicator/service/resources/AbstractResourcesService.java
index dd2b4d1..0fe9028 100644
--- a/src/net/java/sip/communicator/service/resources/AbstractResourcesService.java
+++ b/src/net/java/sip/communicator/service/resources/AbstractResourcesService.java
@@ -429,7 +429,7 @@
      */
     public String getI18NString(String key)
     {
-        return getI18NString(key, Locale.getDefault());
+        return getI18NString(key, null, Locale.getDefault());
     }
 
     /**
@@ -454,8 +454,7 @@
      */
     public String getI18NString(String key, Locale locale)
     {
-        return processI18NString(
-                doGetI18String(key, locale));
+        return getI18NString(key, null, locale);
     }
 
     /**
@@ -506,8 +505,7 @@
      */
     public String getI18NString(String key, String[] params, Locale locale)
     {
-        String resourceString = getI18NString(key, locale);
-
+        String resourceString = doGetI18String(key, locale);
         if (resourceString == null)
         {
             logger.warn("Missing resource for key: " + key);
@@ -520,7 +518,7 @@
                     = MessageFormat.format(resourceString, (Object[]) params);
         }
 
-        return resourceString;
+        return processI18NString(resourceString);
     }
 
     /**
