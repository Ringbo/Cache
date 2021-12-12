diff --git a/src/main/java/org/apache/commons/lang3/JavaVersion.java b/src/main/java/org/apache/commons/lang3/JavaVersion.java
index ce2be7d..1ddadfa 100644
--- a/src/main/java/org/apache/commons/lang3/JavaVersion.java
+++ b/src/main/java/org/apache/commons/lang3/JavaVersion.java
@@ -49,7 +49,7 @@
 
     // helper for static importing
     static JavaVersion getJavaVersion(final String nom) {
-        return getJavaVersion(nom);
+        return get(nom);
     }
     static JavaVersion get(final String nom) {
         if("0.9".equals(nom)) {
