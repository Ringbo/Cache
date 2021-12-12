diff --git a/src/org/pentaho/di/core/Condition.java b/src/org/pentaho/di/core/Condition.java
index fc85b21..17992ae 100644
--- a/src/org/pentaho/di/core/Condition.java
+++ b/src/org/pentaho/di/core/Condition.java
@@ -444,7 +444,7 @@
                         }
                         else
                         {
-                            retval = Pattern.matches(fieldMeta2.getString(field), fieldMeta.getString(field));
+                            retval = Pattern.matches(fieldMeta2.getString(field2), fieldMeta.getString(field));
                         }
                         break;
 					case FUNC_NULL          : retval = (fieldMeta.isNull(field));           break;
