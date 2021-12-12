diff --git a/src/be/ibridge/kettle/core/database/Database.java b/src/be/ibridge/kettle/core/database/Database.java
index fbd8735..f557cea 100644
--- a/src/be/ibridge/kettle/core/database/Database.java
+++ b/src/be/ibridge/kettle/core/database/Database.java
@@ -2303,7 +2303,7 @@
 					debug="getParameterMetaData()";
 					if (par==null) par = getParameterMetaData(ps);
 					debug="getParameterMetaData()";
-					if (par==null) par = getParameterMetaData(sql, inform);
+					if (par==null || par.isEmpty()) par = getParameterMetaData(sql, inform);
 	
 					setValues(par, ps);
 				}
@@ -3525,7 +3525,7 @@
 		try
 		{
 			ParameterMetaData pmd = ps.getParameterMetaData();
-			for (int i=1;i<pmd.getParameterCount();i++)
+			for (int i=1;i<=pmd.getParameterCount();i++)
 			{
 				String name    = "par"+i;
 				int    sqltype = pmd.getParameterType(i);
