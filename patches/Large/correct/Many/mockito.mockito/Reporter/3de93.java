diff --git a/src/org/mockito/exceptions/Reporter.java b/src/org/mockito/exceptions/Reporter.java
index b428e6c..572fb86 100644
--- a/src/org/mockito/exceptions/Reporter.java
+++ b/src/org/mockito/exceptions/Reporter.java
@@ -79,7 +79,8 @@
                 "Also, this error might show up because:",
                 "1. you stub either of: final/private/equals()/hashCode() methods.",
                 "   Those methods *cannot* be stubbed/verified.",
-                "2. inside when() you don't call method on mock but on some other object."
+                "2. inside when() you don't call method on mock but on some other object.",
+                ""
         ));
     }
 
