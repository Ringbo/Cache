diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/CallMaker.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/CallMaker.java
index d9ce684..1dc4a2e 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/CallMaker.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/CallMaker.java
@@ -243,7 +243,7 @@
 
             @Override
             public String toString() {
-                return callElement.toString();
+                return callElement.getText();
             }
         };
     }
