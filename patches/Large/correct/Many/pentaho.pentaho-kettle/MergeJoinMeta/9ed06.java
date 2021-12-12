diff --git a/src/be/ibridge/kettle/trans/step/mergejoin/MergeJoinMeta.java b/src/be/ibridge/kettle/trans/step/mergejoin/MergeJoinMeta.java
index 4c27ad8..4a2f74f 100644
--- a/src/be/ibridge/kettle/trans/step/mergejoin/MergeJoinMeta.java
+++ b/src/be/ibridge/kettle/trans/step/mergejoin/MergeJoinMeta.java
@@ -197,7 +197,7 @@
 	
 	public void allocate(int nrKeys1, int nrKeys2)
 	{
-        keyFields1 = new String[nrKeys2];
+        keyFields1 = new String[nrKeys1];
         keyFields2 = new String[nrKeys2];
 	}
 
