diff --git a/src/main/java/redis/clients/jedis/Tuple.java b/src/main/java/redis/clients/jedis/Tuple.java
index 07b5033..c16daf1 100644
--- a/src/main/java/redis/clients/jedis/Tuple.java
+++ b/src/main/java/redis/clients/jedis/Tuple.java
@@ -35,7 +35,7 @@
   }
 
   public int compareTo(Tuple other) {
-    if (Arrays.equals(this.element, other.element)) return 0;
+    if (Arrays.equals(this.element, other.element) || this.score == other.getScore()) return 0;
     else return this.score < other.getScore() ? -1 : 1;
   }
 
