diff --git a/src/test/java/com/fasterxml/jackson/failing/TestUnknownProperty426.java b/src/test/java/com/fasterxml/jackson/failing/TestUnknownProperty426.java
index acb1806..48a9ff2 100644
--- a/src/test/java/com/fasterxml/jackson/failing/TestUnknownProperty426.java
+++ b/src/test/java/com/fasterxml/jackson/failing/TestUnknownProperty426.java
@@ -15,7 +15,7 @@
         public String firstName;
         Integer userId; 
 
-        void setUserId(CharSequence id) {
+        public void setUserId(CharSequence id) {
             // 21-Dec-2015, tatu: With a fix in 2.7, use of String would not
             //   trigger the problem, so use CharSequence...
             setUserId(new Integer(id.toString()));
