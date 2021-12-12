diff --git a/python/src/com/jetbrains/python/validation/CompatibilityVisitor.java b/python/src/com/jetbrains/python/validation/CompatibilityVisitor.java
index f48af7f..9be1594 100644
--- a/python/src/com/jetbrains/python/validation/CompatibilityVisitor.java
+++ b/python/src/com/jetbrains/python/validation/CompatibilityVisitor.java
@@ -295,7 +295,7 @@
       }
     }
     commonRegisterProblem(message, " not support this syntax. Raise with no arguments can only be used in an except block",
-                          len, node, null);
+                          len, node, null, false);
     // raise 1, 2, 3
     len = 0;
     message = new StringBuilder(myCommonMessage);
