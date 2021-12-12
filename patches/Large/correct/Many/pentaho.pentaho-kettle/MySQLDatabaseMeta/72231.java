diff --git a/src/be/ibridge/kettle/core/database/MySQLDatabaseMeta.java b/src/be/ibridge/kettle/core/database/MySQLDatabaseMeta.java
index ff6729b..1f93d6c 100644
--- a/src/be/ibridge/kettle/core/database/MySQLDatabaseMeta.java
+++ b/src/be/ibridge/kettle/core/database/MySQLDatabaseMeta.java
@@ -179,7 +179,7 @@
 		switch(type)
 		{
 		case Value.VALUE_TYPE_DATE      : retval+="DATETIME"; break;
-		case Value.VALUE_TYPE_BOOLEAN   : retval+="BIT"; break;
+		case Value.VALUE_TYPE_BOOLEAN   : retval+="CHAR(1)"; break;
 		case Value.VALUE_TYPE_NUMBER    :
 		case Value.VALUE_TYPE_INTEGER   : 
         case Value.VALUE_TYPE_BIGNUMBER : 
@@ -328,7 +328,7 @@
      */
     public boolean supportsBooleanDataType()
     {
-        return true;
+        return false;
     }
 }
 
