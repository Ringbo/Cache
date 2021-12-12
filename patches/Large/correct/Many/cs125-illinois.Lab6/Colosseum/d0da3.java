diff --git a/src/main/java/Colosseum.java b/src/main/java/Colosseum.java
index f524c4d..c06137a 100644
--- a/src/main/java/Colosseum.java
+++ b/src/main/java/Colosseum.java
@@ -154,7 +154,7 @@
         System.out.println("=================");
         firstPokemon = buildPokemon();
 
-        System.out.println("");
+        System.out.println();
 
         System.out.println("Player 2, build your Pokemon!");
         System.out.println("==================");
@@ -183,7 +183,7 @@
              * Swap Pokemon for second outcome.
              */
             System.out.print("second");
-            Pokemon tempPokemon = new Pokemon();
+            Pokemon tempPokemon;
             tempPokemon = firstPokemon;
             firstPokemon = secondPokemon;
             secondPokemon = tempPokemon;
@@ -214,16 +214,16 @@
         myScan = new Scanner(System.in);
         initializePokemon();
         determineOrder();
-        System.out.println("");
+        System.out.println();
         boolean ifWinner = false;
 
         /*
          * Let the battle begin!
          */
         for (int i = 0; i < MAX_NUM_ROUNDS && !ifWinner; i++) {
-            System.out.println("");
+            System.out.println();
             System.out.println("Round " + (i + 1) + "!");
-            System.out.println("");
+            System.out.println();
 
             ifWinner = firstPokemon.attack(secondPokemon);
             if (!ifWinner) {
@@ -234,7 +234,7 @@
 
             }
         }
-        System.out.println("");
+        System.out.println();
 
         if (!ifWinner) {
             System.out.println("It's a tie!");
