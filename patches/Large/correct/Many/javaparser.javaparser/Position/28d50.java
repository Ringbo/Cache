diff --git a/javaparser-core/src/main/java/com/github/javaparser/Position.java b/javaparser-core/src/main/java/com/github/javaparser/Position.java
index 69db576..21c71dd 100644
--- a/javaparser-core/src/main/java/com/github/javaparser/Position.java
+++ b/javaparser-core/src/main/java/com/github/javaparser/Position.java
@@ -30,11 +30,11 @@
     public static final Position ABSOLUTE_END = new Position(Node.ABSOLUTE_END_LINE,-1);
 
     public static Position beginOf(Node node){
-        return new Position(node.getBeginColumn(),node.getBeginColumn());
+        return new Position(node.getBeginLine(),node.getBeginColumn());
     }
 
     public static Position endOf(Node node){
-        return new Position(node.getEndColumn(),node.getEndColumn());
+        return new Position(node.getEndLine(),node.getEndColumn());
     }
 
     public Position(int line, int column){
