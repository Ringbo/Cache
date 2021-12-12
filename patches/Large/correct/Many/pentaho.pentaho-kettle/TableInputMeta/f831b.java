diff --git a/src/be/ibridge/kettle/trans/step/tableinput/TableInputMeta.java b/src/be/ibridge/kettle/trans/step/tableinput/TableInputMeta.java
index 9516ae9..d0806e2 100644
--- a/src/be/ibridge/kettle/trans/step/tableinput/TableInputMeta.java
+++ b/src/be/ibridge/kettle/trans/step/tableinput/TableInputMeta.java
@@ -223,7 +223,7 @@
 		}
 		catch(KettleDatabaseException dbe)
 		{
-			throw new KettleStepException("Unable to get queryfields for SQL: "+Const.CR+sql, dbe);
+			throw new KettleStepException("Unable to get queryfields for SQL: "+Const.CR+sNewSQL, dbe);
 		}
 
 		if (add!=null)
@@ -243,7 +243,7 @@
 				
 				if (getLookupStepname()!=null) param=true;
 				
-				add = db.getQueryFields(sql, param, info);
+				add = db.getQueryFields(sNewSQL, param, info);
 				
 				if (add==null) return row;
 				for (int i=0;i<add.size();i++)
@@ -255,7 +255,7 @@
 			}
 			catch(KettleException ke)
 			{
-				throw new KettleStepException("Unable to get queryfields for SQL: "+Const.CR+sql, ke);
+				throw new KettleStepException("Unable to get queryfields for SQL: "+Const.CR+sNewSQL, ke);
 			}
 			finally
 			{
