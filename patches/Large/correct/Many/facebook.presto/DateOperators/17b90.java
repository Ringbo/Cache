diff --git a/presto-main/src/main/java/com/facebook/presto/type/DateOperators.java b/presto-main/src/main/java/com/facebook/presto/type/DateOperators.java
index 67309dc..f8ca299 100644
--- a/presto-main/src/main/java/com/facebook/presto/type/DateOperators.java
+++ b/presto-main/src/main/java/com/facebook/presto/type/DateOperators.java
@@ -136,7 +136,7 @@
             return parseDate(trim(value).toStringUtf8());
         }
         catch (IllegalArgumentException e) {
-            throw new PrestoException(INVALID_CAST_ARGUMENT, e);
+            throw new PrestoException(INVALID_CAST_ARGUMENT, "Value cannot be cast to date: " + value.toStringUtf8(), e);
         }
     }
 
