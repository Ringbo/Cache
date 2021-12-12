diff --git a/modules/cpr/src/main/java/org/atmosphere/interceptor/BroadcastOnPostAtmosphereInterceptor.java b/modules/cpr/src/main/java/org/atmosphere/interceptor/BroadcastOnPostAtmosphereInterceptor.java
index ccf4183..0cb3d71 100644
--- a/modules/cpr/src/main/java/org/atmosphere/interceptor/BroadcastOnPostAtmosphereInterceptor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/interceptor/BroadcastOnPostAtmosphereInterceptor.java
@@ -55,7 +55,7 @@
                 InputStream inputStream = r.getRequest().getInputStream();
                 if (inputStream != null) {
                     bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
-                    char[] charBuffer = new char[128];
+                    char[] charBuffer = new char[8192];
                     int bytesRead = -1;
                     while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                         stringBuilder.append(charBuffer, 0, bytesRead);
