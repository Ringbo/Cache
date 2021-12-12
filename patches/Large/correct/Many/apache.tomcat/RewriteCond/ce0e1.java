diff --git a/java/org/apache/catalina/valves/rewrite/RewriteCond.java b/java/org/apache/catalina/valves/rewrite/RewriteCond.java
index 42fe0d5..9f735ec 100644
--- a/java/org/apache/catalina/valves/rewrite/RewriteCond.java
+++ b/java/org/apache/catalina/valves/rewrite/RewriteCond.java
@@ -23,11 +23,11 @@
 
 public class RewriteCond {
 
-    public abstract class Condition {
+    public static abstract class Condition {
         public abstract boolean evaluate(String value, Resolver resolver);
     }
 
-    public class PatternCondition extends Condition {
+    public static class PatternCondition extends Condition {
         public Pattern pattern;
         public Matcher matcher = null;
 
@@ -43,7 +43,7 @@
         }
     }
 
-    public class LexicalCondition extends Condition {
+    public static class LexicalCondition extends Condition {
         /**
          * -1: <
          * 0: =
@@ -69,7 +69,7 @@
         }
     }
 
-    public class ResourceCondition extends Condition {
+    public static class ResourceCondition extends Condition {
         /**
          * 0: -d (is directory ?)
          * 1: -f (is regular file ?)
