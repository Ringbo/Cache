diff --git a/lib/src/main/java/app/philm/in/network/NetworkError.java b/lib/src/main/java/app/philm/in/network/NetworkError.java
index 0af006f..07935a2 100644
--- a/lib/src/main/java/app/philm/in/network/NetworkError.java
+++ b/lib/src/main/java/app/philm/in/network/NetworkError.java
@@ -10,7 +10,7 @@
     public static final int SOURCE_TMDB = 1;
 
     public static NetworkError from(RetrofitError error, int source) {
-        if (error.isNetworkError()) {
+        if (error == null || error.isNetworkError()) {
             return NETWORK_ERROR;
         } else if (error.getResponse().getStatus() == 404) {
             switch (source) {
