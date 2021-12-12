diff --git a/cache/src/main/java/net/runelite/cache/script/Instructions.java b/cache/src/main/java/net/runelite/cache/script/Instructions.java
index a4eb791..3997b80 100644
--- a/cache/src/main/java/net/runelite/cache/script/Instructions.java
+++ b/cache/src/main/java/net/runelite/cache/script/Instructions.java
@@ -29,7 +29,7 @@
 
 public class Instructions
 {
-	private static Map<Integer, Instruction> instructions = new HashMap<>();
+	private static final Map<Integer, Instruction> instructions = new HashMap<>();
 
 	public static void init()
 	{
@@ -404,7 +404,7 @@
 		add(Opcodes.GET_ISRESIZED, 0, 1);
 		add(Opcodes.SET_ISRESIZED, 1, 0);
 		add(5308, 0, 1);
-		add(5308, 1, 0);
+		add(5309, 1, 0);
 		// 5400-5600
 		add(5504, 2, 0);
 		add(5505, 0, 1);
