diff --git a/core/src/main/java/org/elasticsearch/common/ValidationException.java b/core/src/main/java/org/elasticsearch/common/ValidationException.java
index 1328876..f3fbe5e 100644
--- a/core/src/main/java/org/elasticsearch/common/ValidationException.java
+++ b/core/src/main/java/org/elasticsearch/common/ValidationException.java
@@ -36,7 +36,7 @@
      * Add a new validation error to the accumulating validation errors
      * @param error the error to add
      */
-    public void addValidationError(String error) {
+    public final void addValidationError(String error) {
         validationErrors.add(error);
     }
 
@@ -44,7 +44,7 @@
      * Add a sequence of validation errors to the accumulating validation errors
      * @param errors the errors to add
      */
-    public void addValidationErrors(Iterable<String> errors) {
+    public final void addValidationErrors(Iterable<String> errors) {
         for (String error : errors) {
             validationErrors.add(error);
         }
@@ -52,14 +52,13 @@
 
     /**
      * Returns the validation errors accumulated
-     * @return
      */
-    public List<String> validationErrors() {
+    public final List<String> validationErrors() {
         return validationErrors;
     }
 
     @Override
-    public String getMessage() {
+    public final String getMessage() {
         StringBuilder sb = new StringBuilder();
         sb.append("Validation Failed: ");
         int index = 0;
