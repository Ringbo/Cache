diff --git a/realm/realm-library/src/main/java/io/realm/RxJavaFactory.java b/realm/realm-library/src/main/java/io/realm/RxJavaFactory.java
index 06402e2..4a1b2e0 100644
--- a/realm/realm-library/src/main/java/io/realm/RxJavaFactory.java
+++ b/realm/realm-library/src/main/java/io/realm/RxJavaFactory.java
@@ -126,7 +126,7 @@
     }
 
     private void checkRxJavaAvailable() {
-        if (rxJavaAvailble) {
+        if (!rxJavaAvailble) {
             throw new IllegalStateException("RxJava seems to be missing from the classpath. " +
                     "Remember to add it as a compile dependency. See XXX for more details.");
         }
