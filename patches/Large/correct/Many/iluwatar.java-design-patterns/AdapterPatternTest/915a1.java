diff --git a/adapter/src/test/java/com/iluwatar/adapter/AdapterPatternTest.java b/adapter/src/test/java/com/iluwatar/adapter/AdapterPatternTest.java
index 033440b..82a951e 100644
--- a/adapter/src/test/java/com/iluwatar/adapter/AdapterPatternTest.java
+++ b/adapter/src/test/java/com/iluwatar/adapter/AdapterPatternTest.java
@@ -66,7 +66,7 @@
    */
   @Test
   public void testAdapter() {
-    RowingBoat captain = (RowingBoat) beans.get(ROWING_BEAN);
+    Captain captain = (Captain) beans.get(ROWING_BEAN);
 
     // when captain moves
     captain.row();
