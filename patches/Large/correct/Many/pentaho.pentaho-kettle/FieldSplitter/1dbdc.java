diff --git a/src/be/ibridge/kettle/trans/step/fieldsplitter/FieldSplitter.java b/src/be/ibridge/kettle/trans/step/fieldsplitter/FieldSplitter.java
index 2d0c18b..bafc8a1 100644
--- a/src/be/ibridge/kettle/trans/step/fieldsplitter/FieldSplitter.java
+++ b/src/be/ibridge/kettle/trans/step/fieldsplitter/FieldSplitter.java
@@ -46,7 +46,7 @@
 		super(stepMeta, stepDataInterface, copyNr, transMeta, trans);
 	}
 	
-	private synchronized boolean splitField(Row r)
+	private boolean splitField(Row r)
 	{
 		if (first)
 		{
@@ -85,7 +85,7 @@
 			String pol[] = new String[meta.getField().length];
 			int prev=0;
 			int i=0;
-			while(prev<v.getString().length() && i<pol.length)
+			while(v.getString()!=null && prev<v.getString().length() && i<pol.length)
 			{
 				pol[i]=polNext(v.getString(), meta.getDelimiter(), prev);
 				logDebug("pol="+pol[i]+", prev="+prev);
@@ -193,7 +193,7 @@
 	{
 		String retval;
 		
-		if (start>=str.length()) return "";
+		if (str==null || start>=str.length()) return "";
 		
 		int next = str.indexOf(del, start);
 		if (next == start) // ;; or ,, : two consecutive delimiters
