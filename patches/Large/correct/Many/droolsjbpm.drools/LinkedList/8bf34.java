diff --git a/drools-core/src/main/java/org/drools/util/LinkedList.java b/drools-core/src/main/java/org/drools/util/LinkedList.java
index 41290af..33d19b0 100644
--- a/drools-core/src/main/java/org/drools/util/LinkedList.java
+++ b/drools-core/src/main/java/org/drools/util/LinkedList.java
@@ -295,7 +295,7 @@
 
          public JavaUtilIterator(LinkedList list, boolean immutable) {
              this.list = list;
-             this.currentNode = this.list.getFirst();
+             this.nextNode = this.list.getFirst();
              this.immutable = immutable;
          }
 
