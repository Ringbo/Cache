diff --git a/server-base/src/main/java/org/apache/kylin/rest/service/QueryService.java b/server-base/src/main/java/org/apache/kylin/rest/service/QueryService.java
index 65054c4..053269a 100644
--- a/server-base/src/main/java/org/apache/kylin/rest/service/QueryService.java
+++ b/server-base/src/main/java/org/apache/kylin/rest/service/QueryService.java
@@ -1087,23 +1087,23 @@
             break;
         case PRIMITIVE_INT:
         case INTEGER:
-            preparedState.setInt(index, isNull ? 0 : Integer.valueOf(param.getValue()));
+            preparedState.setInt(index, isNull ? 0 : Integer.parseInt(param.getValue()));
             break;
         case PRIMITIVE_SHORT:
         case SHORT:
-            preparedState.setShort(index, isNull ? 0 : Short.valueOf(param.getValue()));
+            preparedState.setShort(index, isNull ? 0 : Short.parseShort(param.getValue()));
             break;
         case PRIMITIVE_LONG:
         case LONG:
-            preparedState.setLong(index, isNull ? 0 : Long.valueOf(param.getValue()));
+            preparedState.setLong(index, isNull ? 0 : Long.parseLong(param.getValue()));
             break;
         case PRIMITIVE_FLOAT:
         case FLOAT:
-            preparedState.setFloat(index, isNull ? 0 : Float.valueOf(param.getValue()));
+            preparedState.setFloat(index, isNull ? 0 : Float.parseFloat(param.getValue()));
             break;
         case PRIMITIVE_DOUBLE:
         case DOUBLE:
-            preparedState.setDouble(index, isNull ? 0 : Double.valueOf(param.getValue()));
+            preparedState.setDouble(index, isNull ? 0 : Double.parseDouble(param.getValue()));
             break;
         case PRIMITIVE_BOOLEAN:
         case BOOLEAN:
@@ -1111,7 +1111,7 @@
             break;
         case PRIMITIVE_BYTE:
         case BYTE:
-            preparedState.setByte(index, isNull ? 0 : Byte.valueOf(param.getValue()));
+            preparedState.setByte(index, isNull ? 0 : Byte.parseByte(param.getValue()));
             break;
         case JAVA_UTIL_DATE:
         case JAVA_SQL_DATE:
