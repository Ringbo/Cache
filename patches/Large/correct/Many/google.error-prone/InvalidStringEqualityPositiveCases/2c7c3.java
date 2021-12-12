diff --git a/core/src/test/resources/com/google/errorprone/bugpatterns/InvalidStringEqualityPositiveCases.java b/core/src/test/resources/com/google/errorprone/bugpatterns/InvalidStringEqualityPositiveCases.java
index f783bf9..c5ce3d9 100644
--- a/core/src/test/resources/com/google/errorprone/bugpatterns/InvalidStringEqualityPositiveCases.java
+++ b/core/src/test/resources/com/google/errorprone/bugpatterns/InvalidStringEqualityPositiveCases.java
@@ -44,16 +44,16 @@
     retVal = ("str2" == "str");    
     final String constValue = "str";
     //BUG: Suggestion includes "constValue.equals(x)"
-    retval = (x == constValue);
+    retVal = (x == constValue);
     //BUG: Suggestion includes "!constValue.equals(x)"
-    retval = (x != constValue);
+    retVal = (x != constValue);
     //BUG: Suggestion includes "(x + y + constValue).equals(x + y)"
-    retval = (x + y + constValue == x + y);
+    retVal = (x + y + constValue == x + y);
     final String constValue2 = "str2";
     //BUG: Suggestion includes "(constValue + constValue2).equals(x)"
-    retval = (constValue + constValue2 == x);
+    retVal = (constValue + constValue2 == x);
     //BUG: Suggestion includes "(constValue + constValue2).equals(x)"
-    retval = (x == constValue + constValue2);
+    retVal = (x == constValue + constValue2);
 
     return retVal;
   }
