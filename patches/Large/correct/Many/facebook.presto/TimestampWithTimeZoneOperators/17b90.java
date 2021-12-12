diff --git a/presto-main/src/main/java/com/facebook/presto/type/TimestampWithTimeZoneOperators.java b/presto-main/src/main/java/com/facebook/presto/type/TimestampWithTimeZoneOperators.java
index 4cacfd8..f60a51c 100644
--- a/presto-main/src/main/java/com/facebook/presto/type/TimestampWithTimeZoneOperators.java
+++ b/presto-main/src/main/java/com/facebook/presto/type/TimestampWithTimeZoneOperators.java
@@ -152,7 +152,7 @@
             return parseTimestampWithTimeZone(session.getTimeZoneKey(), trim(value).toStringUtf8());
         }
         catch (IllegalArgumentException e) {
-            throw new PrestoException(INVALID_CAST_ARGUMENT, e);
+            throw new PrestoException(INVALID_CAST_ARGUMENT, "Value cannot be cast to timestamp with time zone: " + value.toStringUtf8(), e);
         }
     }
 
