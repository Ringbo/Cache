diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/ExplicitInitializationCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/ExplicitInitializationCheck.java
index c8530e7..d3f8f49 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/ExplicitInitializationCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/ExplicitInitializationCheck.java
@@ -173,7 +173,7 @@
             case TokenTypes.NUM_INT:
             case TokenTypes.NUM_LONG:
                 final String text = expr.getText();
-                return 0 == CheckUtils.parseFloat(text, type);
+                return 0.0 == CheckUtils.parseFloat(text, type);
             default:
                 return false;
         }
