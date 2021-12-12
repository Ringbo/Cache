diff --git a/presto-main/src/main/java/com/facebook/presto/type/TimeOperators.java b/presto-main/src/main/java/com/facebook/presto/type/TimeOperators.java
index 1fc47b9..9a001e3 100644
--- a/presto-main/src/main/java/com/facebook/presto/type/TimeOperators.java
+++ b/presto-main/src/main/java/com/facebook/presto/type/TimeOperators.java
@@ -125,7 +125,7 @@
             return parseTimeWithoutTimeZone(session.getTimeZoneKey(), value.toStringUtf8());
         }
         catch (IllegalArgumentException e) {
-            throw new PrestoException(INVALID_CAST_ARGUMENT, e);
+            throw new PrestoException(INVALID_CAST_ARGUMENT, "Value cannot be cast to time: " + value.toStringUtf8(), e);
         }
     }
 
