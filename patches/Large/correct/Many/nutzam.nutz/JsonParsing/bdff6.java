diff --git a/src/org/nutz/json/JsonParsing.java b/src/org/nutz/json/JsonParsing.java
index 912da7f..ae40e86 100644
--- a/src/org/nutz/json/JsonParsing.java
+++ b/src/org/nutz/json/JsonParsing.java
@@ -95,7 +95,7 @@
 			Object ary = Array.newInstance(clazz.getComponentType(), list.size());
 			int i = 0;
 
-			for (Iterator it = list.iterator(); it.hasNext();) {
+			for (Iterator it = re.iterator(); it.hasNext();) {
 				if (tt != null)
 					Array.set(ary, i++, convert(tt, it.next()));
 				else
