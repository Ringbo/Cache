diff --git a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
index 32d13e3..8c587cf 100644
--- a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
+++ b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
@@ -511,7 +511,7 @@
         Object answer = null;
         for (Iterator iter = self.iterator(); iter.hasNext();) {
             Object value = iter.next();
-            if (comparator.compare(value, answer) > 0) {
+            if (answer == null || comparator.compare(value, answer) > 0) {
                 answer = value;
             }
         }
@@ -541,7 +541,7 @@
         Object answer = null;
         for (Iterator iter = self.iterator(); iter.hasNext();) {
             Object value = iter.next();
-            if (comparator.compare(value, answer) < 0) {
+            if (answer == null || comparator.compare(value, answer) < 0) {
                 answer = value;
 
             }
