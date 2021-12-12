diff --git a/src/org/pentaho/di/core/database/MySQLDatabaseMeta.java b/src/org/pentaho/di/core/database/MySQLDatabaseMeta.java
index f853c33..e054b12 100644
--- a/src/org/pentaho/di/core/database/MySQLDatabaseMeta.java
+++ b/src/org/pentaho/di/core/database/MySQLDatabaseMeta.java
@@ -259,7 +259,7 @@
 				// Floating point values...
 				else  
 				{
-					if (length>18)
+					if (length>15)
 					{
 						retval+="DECIMAL("+length;
 						if (precision>0) retval+=", "+precision;
@@ -267,7 +267,9 @@
 					}
 					else
 					{
-						retval+="FLOAT";
+						// A double-precision floating-point number is accurate to approximately 15 decimal places.
+						// http://mysql.mirrors-r-us.net/doc/refman/5.1/en/numeric-type-overview.html 
+						retval+="DOUBLE";
 					}
 				}
 			}
