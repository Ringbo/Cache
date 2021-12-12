diff --git a/src/be/ibridge/kettle/core/database/Database.java b/src/be/ibridge/kettle/core/database/Database.java
index f557cea..53d184a 100644
--- a/src/be/ibridge/kettle/core/database/Database.java
+++ b/src/be/ibridge/kettle/core/database/Database.java
@@ -2301,7 +2301,8 @@
 					Row par = inform;
 					
 					debug="getParameterMetaData()";
-					if (par==null) par = getParameterMetaData(ps);
+					if (par==null || par.isEmpty()) par = getParameterMetaData(ps);
+                    
 					debug="getParameterMetaData()";
 					if (par==null || par.isEmpty()) par = getParameterMetaData(sql, inform);
 	
