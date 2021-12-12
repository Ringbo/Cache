diff --git a/logback-core/src/main/java/ch/qos/logback/core/joran/spi/ConfigurationWatchList.java b/logback-core/src/main/java/ch/qos/logback/core/joran/spi/ConfigurationWatchList.java
index 996058d..567b4d3 100644
--- a/logback-core/src/main/java/ch/qos/logback/core/joran/spi/ConfigurationWatchList.java
+++ b/logback-core/src/main/java/ch/qos/logback/core/joran/spi/ConfigurationWatchList.java
@@ -68,7 +68,7 @@
       File file = new File(URLDecoder.decode(url.getFile()));
       return file;
     } else {
-      addError("URL [" + url + "] is not of type file");
+      addInfo("URL [" + url + "] is not of type file");
       return null;
     }
   }
