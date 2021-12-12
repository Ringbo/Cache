diff --git a/src/com/google/javascript/jscomp/TypeCheck.java b/src/com/google/javascript/jscomp/TypeCheck.java
index 076d740..4a0dc69 100644
--- a/src/com/google/javascript/jscomp/TypeCheck.java
+++ b/src/com/google/javascript/jscomp/TypeCheck.java
@@ -1498,7 +1498,7 @@
     }
   }
 
-  private SuggestionPair getClosestPropertySuggestion(
+  private static SuggestionPair getClosestPropertySuggestion(
       JSType objectType, String propName) {
     return null;
   }
