diff --git a/logback-classic/src/main/java/ch/qos/logback/classic/util/ContextInitializer.java b/logback-classic/src/main/java/ch/qos/logback/classic/util/ContextInitializer.java
index d995023..3cf5458 100644
--- a/logback-classic/src/main/java/ch/qos/logback/classic/util/ContextInitializer.java
+++ b/logback-classic/src/main/java/ch/qos/logback/classic/util/ContextInitializer.java
@@ -122,12 +122,12 @@
             return url;
         }
 
-        url = getResource(GROOVY_AUTOCONFIG_FILE, myClassLoader, updateStatus);
+        url = getResource(TEST_AUTOCONFIG_FILE, myClassLoader, updateStatus);
         if (url != null) {
             return url;
         }
 
-        url = getResource(TEST_AUTOCONFIG_FILE, myClassLoader, updateStatus);
+        url = getResource(GROOVY_AUTOCONFIG_FILE, myClassLoader, updateStatus);
         if (url != null) {
             return url;
         }
