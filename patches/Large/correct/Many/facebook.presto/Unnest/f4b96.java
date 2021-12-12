diff --git a/presto-parser/src/main/java/com/facebook/presto/sql/tree/Unnest.java b/presto-parser/src/main/java/com/facebook/presto/sql/tree/Unnest.java
index cfa4598..a689af9 100644
--- a/presto-parser/src/main/java/com/facebook/presto/sql/tree/Unnest.java
+++ b/presto-parser/src/main/java/com/facebook/presto/sql/tree/Unnest.java
@@ -80,7 +80,7 @@
     @Override
     public int hashCode()
     {
-        return Objects.hash(expressions);
+        return Objects.hash(expressions, withOrdinality);
     }
 
     @Override
@@ -93,6 +93,6 @@
             return false;
         }
         Unnest other = (Unnest) obj;
-        return Objects.equals(this.expressions, other.expressions);
+        return Objects.equals(expressions, other.expressions) && withOrdinality == other.withOrdinality;
     }
 }
