diff --git a/src/java/org/apache/lucene/search/function/CustomScoreQuery.java b/src/java/org/apache/lucene/search/function/CustomScoreQuery.java
index 5bfdb04..87e2304 100755
--- a/src/java/org/apache/lucene/search/function/CustomScoreQuery.java
+++ b/src/java/org/apache/lucene/search/function/CustomScoreQuery.java
@@ -146,13 +146,13 @@
         this.valSrcQueries.length != other.valSrcQueries.length) {
       return false;
     }
-    return Arrays.deepEquals(valSrcQueries, other.valSrcQueries);
+    return Arrays.equals(valSrcQueries, other.valSrcQueries);
   }
 
   /** Returns a hash code value for this object. */
   @Override
   public int hashCode() {
-    return (getClass().hashCode() + subQuery.hashCode() + Arrays.deepHashCode(valSrcQueries))
+    return (getClass().hashCode() + subQuery.hashCode() + Arrays.hashCode(valSrcQueries))
       ^ Float.floatToIntBits(getBoost());
   }  
   
