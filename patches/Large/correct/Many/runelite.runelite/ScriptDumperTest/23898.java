diff --git a/cache/src/test/java/net/runelite/cache/ScriptDumperTest.java b/cache/src/test/java/net/runelite/cache/ScriptDumperTest.java
index 6de197d..4cc727d 100644
--- a/cache/src/test/java/net/runelite/cache/ScriptDumperTest.java
+++ b/cache/src/test/java/net/runelite/cache/ScriptDumperTest.java
@@ -99,7 +99,7 @@
 			for (int i = 0; i < length; ++i)
 			{
 				int opcode = script.getInstructions()[i];
-				int iop = script.getInstructions()[i];
+				int iop = script.getIntOperands()[i];
 				String sop = script.getStringOperands()[i];
 
 				writer.write(String.format("0x%03x", opcode));
