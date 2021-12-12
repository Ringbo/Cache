diff --git a/tool/test/org/antlr/v4/test/TestCommonTokenStream.java b/tool/test/org/antlr/v4/test/TestCommonTokenStream.java
index f5ec1e2..6394d9e 100644
--- a/tool/test/org/antlr/v4/test/TestCommonTokenStream.java
+++ b/tool/test/org/antlr/v4/test/TestCommonTokenStream.java
@@ -114,7 +114,7 @@
         tokens.LT(i++); // push it past end
         tokens.LT(i++);
 
-        String result = tokens.toString();
+        String result = tokens.getText();
         String expecting = "x = 3 * 0 + 2 * 0;";
         assertEquals(expecting, result);
     }
@@ -146,7 +146,7 @@
         tokens.consume();
         tokens.LT(1);
 
-        String result = tokens.toString();
+        String result = tokens.getText();
         String expecting = "x = 3 * 0 + 2 * 0;";
         assertEquals(expecting, result);
     }
