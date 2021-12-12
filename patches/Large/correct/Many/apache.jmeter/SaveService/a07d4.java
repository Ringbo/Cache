diff --git a/src/core/org/apache/jmeter/save/SaveService.java b/src/core/org/apache/jmeter/save/SaveService.java
index 46b4aee..1b6f946 100644
--- a/src/core/org/apache/jmeter/save/SaveService.java
+++ b/src/core/org/apache/jmeter/save/SaveService.java
@@ -348,7 +348,7 @@
 		{
 			if(items[i].getName().equals("property"))
 			{
-				coll.add(items[i].getValue());
+				coll.add(items[i].getValue(""));
 			}
 			else if(items[i].getName().equals("testelement"))
 			{
@@ -360,7 +360,7 @@
 			}
 			else if(items[i].getName().equals("string"))
 			{
-				coll.add(items[i].getValue());
+				coll.add(items[i].getValue(""));
 			}
 		}
 		return coll;
