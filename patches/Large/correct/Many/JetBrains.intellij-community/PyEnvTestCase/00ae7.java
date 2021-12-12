diff --git a/python/testSrc/com/jetbrains/env/python/debug/PyEnvTestCase.java b/python/testSrc/com/jetbrains/env/python/debug/PyEnvTestCase.java
index eec23e2..82c1d81 100644
--- a/python/testSrc/com/jetbrains/env/python/debug/PyEnvTestCase.java
+++ b/python/testSrc/com/jetbrains/env/python/debug/PyEnvTestCase.java
@@ -244,7 +244,7 @@
           });
         }
 
-        return ((PyRemoteSdkAdditionalData)sdk.getSdkAdditionalData()).getRemoteSdkCredentials().getSdkId();
+        return ((PyRemoteSdkAdditionalData)sdk.getSdkAdditionalData()).getRemoteSdkCredentials(false).getSdkId();
       }
       catch (Exception e) {
         throw new RuntimeException(e);
