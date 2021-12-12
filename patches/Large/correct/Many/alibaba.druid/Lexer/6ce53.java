diff --git a/src/main/java/com/alibaba/druid/sql/parser/Lexer.java b/src/main/java/com/alibaba/druid/sql/parser/Lexer.java
index 4aba23d..0d3ccdb 100644
--- a/src/main/java/com/alibaba/druid/sql/parser/Lexer.java
+++ b/src/main/java/com/alibaba/druid/sql/parser/Lexer.java
@@ -270,7 +270,7 @@
         }
 
         this.posLine = line;
-        this.posColumn = posColumn;
+        this.posColumn = column;
 
         StringBuilder buf = new StringBuilder();
         buf
