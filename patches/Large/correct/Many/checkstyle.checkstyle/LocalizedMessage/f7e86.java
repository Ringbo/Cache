diff --git a/src/checkstyle/com/puppycrawl/tools/checkstyle/LocalizedMessage.java b/src/checkstyle/com/puppycrawl/tools/checkstyle/LocalizedMessage.java
index 723b069..5601884 100644
--- a/src/checkstyle/com/puppycrawl/tools/checkstyle/LocalizedMessage.java
+++ b/src/checkstyle/com/puppycrawl/tools/checkstyle/LocalizedMessage.java
@@ -30,7 +30,7 @@
  * @author <a href="mailto:checkstyle@puppycrawl.com">Oliver Burn</a>
  * @version 1.0
  */
-class LocalizedMessage
+public class LocalizedMessage
     implements Comparable
 {
     /** name of the resource bundle to get messages from **/
@@ -84,7 +84,7 @@
     }
 
     /** @return the translated message **/
-    String getMessage()
+    public String getMessage()
     {
         // Very simple approach - wait for performance problems
         final ResourceBundle bundle =
@@ -94,13 +94,13 @@
     }
 
     /** @return the line number **/
-    int getLineNo()
+    public int getLineNo()
     {
         return mLineNo;
     }
 
     /** @return the column number **/
-    int getColumnNo()
+    public int getColumnNo()
     {
         return mColNo;
     }
