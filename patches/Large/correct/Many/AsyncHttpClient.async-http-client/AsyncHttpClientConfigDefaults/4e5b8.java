diff --git a/api/src/main/java/org/asynchttpclient/AsyncHttpClientConfigDefaults.java b/api/src/main/java/org/asynchttpclient/AsyncHttpClientConfigDefaults.java
index 88593ba..3cb9ebd 100644
--- a/api/src/main/java/org/asynchttpclient/AsyncHttpClientConfigDefaults.java
+++ b/api/src/main/java/org/asynchttpclient/AsyncHttpClientConfigDefaults.java
@@ -135,6 +135,6 @@
     }
     
     public static boolean defaultAcceptAnyCertificate() {
-        return getBooleanValue(ASYNC_CLIENT + "acceptAnyCertificate", false);
+        return getBoolean(ASYNC_CLIENT + "acceptAnyCertificate", false);
     }
 }
