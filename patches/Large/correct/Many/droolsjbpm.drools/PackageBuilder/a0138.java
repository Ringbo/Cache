diff --git a/drools-compiler/src/main/java/org/drools/compiler/PackageBuilder.java b/drools-compiler/src/main/java/org/drools/compiler/PackageBuilder.java
index 4d64b08..0b9d18f 100644
--- a/drools-compiler/src/main/java/org/drools/compiler/PackageBuilder.java
+++ b/drools-compiler/src/main/java/org/drools/compiler/PackageBuilder.java
@@ -388,7 +388,7 @@
      * clear this when there were errors on items that a rule depends on
      * (eg functions), then you will get spurious errors which will not be that helpful.
      */
-    void resetErrors() {
+    protected void resetErrors() {
         this.results.clear();
     }
 
