diff --git a/presto-main/src/main/java/com/facebook/presto/type/TimestampOperators.java b/presto-main/src/main/java/com/facebook/presto/type/TimestampOperators.java
index 2d4e462..dad06c4 100644
--- a/presto-main/src/main/java/com/facebook/presto/type/TimestampOperators.java
+++ b/presto-main/src/main/java/com/facebook/presto/type/TimestampOperators.java
@@ -147,7 +147,7 @@
             return parseTimestampWithoutTimeZone(session.getTimeZoneKey(), trim(value).toStringUtf8());
         }
         catch (IllegalArgumentException e) {
-            throw new PrestoException(INVALID_CAST_ARGUMENT, e);
+            throw new PrestoException(INVALID_CAST_ARGUMENT, "Value cannot be cast to timestamp: " + value.toStringUtf8(), e);
         }
     }
 
