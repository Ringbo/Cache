diff --git a/config/app/src/main/java/com/google/samples/quickstart/config/MainActivity.java b/config/app/src/main/java/com/google/samples/quickstart/config/MainActivity.java
index b0ed37e..042f01c 100644
--- a/config/app/src/main/java/com/google/samples/quickstart/config/MainActivity.java
+++ b/config/app/src/main/java/com/google/samples/quickstart/config/MainActivity.java
@@ -113,7 +113,7 @@
         // more than cacheExpiration seconds ago. Thus the next fetch would go to the server unless
         // throttling is in progress. The default expiration duration is 43200 (12 hours).
         mFirebaseRemoteConfig.fetch(cacheExpiration)
-                .addOnCompleteListener(new OnCompleteListener<Void>() {
+                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                     @Override
                     public void onComplete(@NonNull Task<Void> task) {
                         if (task.isSuccessful()) {
