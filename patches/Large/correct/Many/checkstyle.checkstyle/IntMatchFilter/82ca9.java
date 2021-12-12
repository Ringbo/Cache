diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/filters/IntMatchFilter.java b/src/main/java/com/puppycrawl/tools/checkstyle/filters/IntMatchFilter.java
index cdbd4dc..f16d241 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/filters/IntMatchFilter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/filters/IntMatchFilter.java
@@ -46,12 +46,12 @@
     }
 
     @Override
-    public int hashCode() {
+    public final int hashCode() {
         return Integer.valueOf(matchValue).hashCode();
     }
 
     @Override
-    public boolean equals(Object object) {
+    public final boolean equals(Object object) {
         if (object instanceof IntMatchFilter) {
             final IntMatchFilter other = (IntMatchFilter) object;
             return matchValue == other.matchValue;
