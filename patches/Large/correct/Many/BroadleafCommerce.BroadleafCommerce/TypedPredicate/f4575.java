diff --git a/common/src/main/java/org/broadleafcommerce/common/util/TypedPredicate.java b/common/src/main/java/org/broadleafcommerce/common/util/TypedPredicate.java
index b960b32..b08273a 100644
--- a/common/src/main/java/org/broadleafcommerce/common/util/TypedPredicate.java
+++ b/common/src/main/java/org/broadleafcommerce/common/util/TypedPredicate.java
@@ -41,7 +41,7 @@
     }
     
     public boolean evaluate(Object value) {
-        if (clazz.isAssignableFrom(value.getClass())) {
+        if (value == null || clazz.isAssignableFrom(value.getClass())) {
             return eval((T) value);
         }
         return false;
