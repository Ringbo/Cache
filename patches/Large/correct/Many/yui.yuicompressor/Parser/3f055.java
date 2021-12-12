diff --git a/src/org/mozilla/javascript/Parser.java b/src/org/mozilla/javascript/Parser.java
index cab459c..9acfab2 100644
--- a/src/org/mozilla/javascript/Parser.java
+++ b/src/org/mozilla/javascript/Parser.java
@@ -183,7 +183,7 @@
                         decompiler.addJScriptConditionalComment(ts.getString());
                     } else if (tt == Token.KEEPCOMMENT) {
                         /* Support for preserved comments */
-                        decompiler.addJScriptConditionalComment(ts.getString());
+                        decompiler.addPreservedComment(ts.getString());
                     }
 
                 } while (tt == Token.EOL || tt == Token.CONDCOMMENT || tt == Token.KEEPCOMMENT);
