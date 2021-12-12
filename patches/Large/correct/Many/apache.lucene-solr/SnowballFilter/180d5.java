diff --git a/sandbox/contributions/snowball/src/java/org/apache/lucene/analysis/snowball/SnowballFilter.java b/sandbox/contributions/snowball/src/java/org/apache/lucene/analysis/snowball/SnowballFilter.java
index b116488..c1511c9 100644
--- a/sandbox/contributions/snowball/src/java/org/apache/lucene/analysis/snowball/SnowballFilter.java
+++ b/sandbox/contributions/snowball/src/java/org/apache/lucene/analysis/snowball/SnowballFilter.java
@@ -91,7 +91,7 @@
       stemmer = (SnowballProgram) stemClass.newInstance();
       stemMethod = stemClass.getMethod("stem", new Class[0]);
     } catch (Exception e) {
-      throw new RuntimeException();
+      throw new RuntimeException(e.toString());
     }
   }
 
@@ -104,7 +104,7 @@
     try {
       stemMethod.invoke(stemmer, EMPTY_ARGS);
     } catch (Exception e) {
-      throw new RuntimeException();
+      throw new RuntimeException(e.toString());
     }
     return new Token(stemmer.getCurrent(),
                      token.startOffset(), token.endOffset(), token.type());
