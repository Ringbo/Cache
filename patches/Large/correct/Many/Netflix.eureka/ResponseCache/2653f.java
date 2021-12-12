diff --git a/eureka-core/src/main/java/com/netflix/eureka/resources/ResponseCache.java b/eureka-core/src/main/java/com/netflix/eureka/resources/ResponseCache.java
index 0550ac2..0d4670d 100644
--- a/eureka-core/src/main/java/com/netflix/eureka/resources/ResponseCache.java
+++ b/eureka-core/src/main/java/com/netflix/eureka/resources/ResponseCache.java
@@ -375,7 +375,7 @@
                 if (null != vipAddress) {
                     String[] vipAddresses = vipAddress.split(",");
                     Arrays.sort(vipAddresses);
-                    if (Arrays.binarySearch(vipAddresses, key.getName()) > 0) {
+                    if (Arrays.binarySearch(vipAddresses, key.getName()) >= 0) {
                         if (null == appToAdd) {
                             appToAdd = new Application(application.getName());
                             toReturn.addApplication(appToAdd);
