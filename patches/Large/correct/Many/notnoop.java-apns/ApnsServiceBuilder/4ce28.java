diff --git a/src/main/java/com/notnoop/apns/ApnsServiceBuilder.java b/src/main/java/com/notnoop/apns/ApnsServiceBuilder.java
index 19936e8..6fe6b2a 100644
--- a/src/main/java/com/notnoop/apns/ApnsServiceBuilder.java
+++ b/src/main/java/com/notnoop/apns/ApnsServiceBuilder.java
@@ -352,7 +352,7 @@
      * @return  this
      */
     public ApnsServiceBuilder withNoErrorDetection() {
-        this.errorDetection = true;
+        this.errorDetection = false;
         return this;
     }
 
