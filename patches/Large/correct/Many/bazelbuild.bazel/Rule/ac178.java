diff --git a/src/main/java/com/google/devtools/build/lib/packages/Rule.java b/src/main/java/com/google/devtools/build/lib/packages/Rule.java
index 76f6d47..a4a46bc 100644
--- a/src/main/java/com/google/devtools/build/lib/packages/Rule.java
+++ b/src/main/java/com/google/devtools/build/lib/packages/Rule.java
@@ -656,10 +656,10 @@
     }
   }
 
-  private void checkForNullLabel(Label labelToCheck, String where) {
+  private void checkForNullLabel(Label labelToCheck, Object context) {
     if (labelToCheck == null) {
       throw new IllegalStateException(String.format(
-          "null label in rule %s, %s", getLabel().toString(), where));
+          "null label in rule %s, %s", getLabel().toString(), context));
     }
   }
 
@@ -672,7 +672,7 @@
         new AttributeMap.AcceptsLabelAttribute() {
           @Override
           public void acceptLabelAttribute(Label labelToCheck, Attribute attribute) {
-            checkForNullLabel(labelToCheck, "attribute " + attribute.getName());
+            checkForNullLabel(labelToCheck, attribute);
           }
         });
     for (OutputFile outputFile : getOutputFiles()) {
