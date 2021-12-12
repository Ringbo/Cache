diff --git a/src/rajawali/parser/MD2Parser.java b/src/rajawali/parser/MD2Parser.java
index 175bc68..87de58c 100644
--- a/src/rajawali/parser/MD2Parser.java
+++ b/src/rajawali/parser/MD2Parser.java
@@ -189,7 +189,7 @@
 			if (name.indexOf("_") > 0)
 				name = name.subSequence(0, name.lastIndexOf("_")).toString();
 			else
-				name = name.substring(0, 6).replaceAll("[0-9]{1,2}$", "");
+				name = name.trim().replaceAll("[0-9]{1,2}$", "");
 			frame.setName(name);
 
 			float vertices[] = new float[mHeader.numVerts * 3];
