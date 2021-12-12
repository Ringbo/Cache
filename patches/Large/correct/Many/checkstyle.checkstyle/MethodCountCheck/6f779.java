diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/sizes/MethodCountCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/sizes/MethodCountCheck.java
index c7601e2..f453000 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/sizes/MethodCountCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/sizes/MethodCountCheck.java
@@ -234,7 +234,7 @@
          * Increments to counter by one for the supplied scope.
          * @param scope the scope counter to increment.
          */
-        void increment(Scope scope) {
+        private void increment(Scope scope) {
             total++;
             if (inInterface) {
                 counts.put(Scope.PUBLIC, 1 + value(Scope.PUBLIC));
@@ -249,7 +249,7 @@
          * @param scope the scope counter to get the value of
          * @return the value of a scope counter
          */
-        int value(Scope scope) {
+        private int value(Scope scope) {
             final Integer value = counts.get(scope);
 
             if (value == null) {
@@ -263,7 +263,7 @@
         /**
          * @return the total number of methods.
          */
-        int getTotal() {
+        private int getTotal() {
             return total;
         }
     }
