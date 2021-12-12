diff --git a/src/main/java/com/typesafe/config/impl/Tokenizer.java b/src/main/java/com/typesafe/config/impl/Tokenizer.java
index 330e279..aa03891 100644
--- a/src/main/java/com/typesafe/config/impl/Tokenizer.java
+++ b/src/main/java/com/typesafe/config/impl/Tokenizer.java
@@ -95,7 +95,7 @@
             this.input = input;
             this.allowComments = allowComments;
             this.buffer = new LinkedList<Integer>();
-            lineNumber = 0;
+            lineNumber = 1;
             tokens = new LinkedList<Token>();
             tokens.add(Tokens.START);
             whitespaceSaver = new WhitespaceSaver();
