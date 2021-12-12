diff --git a/src/be/ibridge/kettle/trans/step/combinationlookup/CombinationLookupMeta.java b/src/be/ibridge/kettle/trans/step/combinationlookup/CombinationLookupMeta.java
index 8dfb06f..c507e03 100644
--- a/src/be/ibridge/kettle/trans/step/combinationlookup/CombinationLookupMeta.java
+++ b/src/be/ibridge/kettle/trans/step/combinationlookup/CombinationLookupMeta.java
@@ -350,7 +350,7 @@
 		database = null;
 		commitSize = 0;
 		replaceFields    = true;
-		useHash        = true;
+		useHash        = false;
 		hashField   = "hashcode"; //$NON-NLS-1$
 
 		int nrkeys    = 0;
@@ -365,7 +365,7 @@
 		}
 
 		technicalKeyField     = "technical /surrogate key field"; //$NON-NLS-1$
-		useAutoinc  = true;
+		useAutoinc  = false;
 	}
 
 	public Row getFields(Row r, String name, Row info)
