diff --git a/subprojects/internal-testing/src/main/groovy/org/gradle/util/TestFile.java b/subprojects/internal-testing/src/main/groovy/org/gradle/util/TestFile.java
index 44dc2c5..064acb8 100644
--- a/subprojects/internal-testing/src/main/groovy/org/gradle/util/TestFile.java
+++ b/subprojects/internal-testing/src/main/groovy/org/gradle/util/TestFile.java
@@ -417,10 +417,10 @@
     }
 
     public TestFile createDir() {
-        if (isDirectory()) {
+        if (mkdirs()) {
             return this;
         }
-        if (mkdirs()) {
+        if (isDirectory()) {
             return this;
         }
         throw new AssertionError("Problems creating dir: " + this
