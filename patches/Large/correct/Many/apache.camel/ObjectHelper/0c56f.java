diff --git a/camel-core/src/main/java/org/apache/camel/util/ObjectHelper.java b/camel-core/src/main/java/org/apache/camel/util/ObjectHelper.java
index e8d01e5..979b59a 100644
--- a/camel-core/src/main/java/org/apache/camel/util/ObjectHelper.java
+++ b/camel-core/src/main/java/org/apache/camel/util/ObjectHelper.java
@@ -152,7 +152,7 @@
 
         // prefer to coerce to the right hand side at first
         if (rightValue instanceof Comparable) {
-            Object value = converter.convertTo(rightValue.getClass(), leftValue);
+            Object value = converter.tryConvertTo(rightValue.getClass(), leftValue);
             if (value != null) {
                 return ((Comparable) rightValue).compareTo(value) * -1;
             }
@@ -160,7 +160,7 @@
 
         // then fallback to the left hand side
         if (leftValue instanceof Comparable) {
-            Object value = converter.convertTo(leftValue.getClass(), rightValue);
+            Object value = converter.tryConvertTo(leftValue.getClass(), rightValue);
             if (value != null) {
                 return ((Comparable) leftValue).compareTo(value);
             }
