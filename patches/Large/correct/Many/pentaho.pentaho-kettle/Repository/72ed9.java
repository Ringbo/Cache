diff --git a/src/org/pentaho/di/repository/Repository.java b/src/org/pentaho/di/repository/Repository.java
index b395972..424b777 100644
--- a/src/org/pentaho/di/repository/Repository.java
+++ b/src/org/pentaho/di/repository/Repository.java
@@ -3259,7 +3259,7 @@
 		else                            r = getStepAttributeRow(id_step, nr, code);
 		if (r == null) return -1L;
 		
-		return r.getInteger(FIELD_STEP_ATTRIBUTE_ID_STEP_ATTRIBUTE, -1L);
+		return r.getInteger(FIELD_STEP_ATTRIBUTE_ID_STEP, -1L);
 	}
 	public synchronized String getStepAttributeString(long id_step, int nr, String code) throws KettleException
 	{
