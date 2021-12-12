diff --git a/src/java/org/apache/cassandra/db/NativeExpiringCell.java b/src/java/org/apache/cassandra/db/NativeExpiringCell.java
index 5ac0e81..0822fbd 100644
--- a/src/java/org/apache/cassandra/db/NativeExpiringCell.java
+++ b/src/java/org/apache/cassandra/db/NativeExpiringCell.java
@@ -130,7 +130,7 @@
 
     public boolean equals(Cell cell)
     {
-        return cell instanceof ExpiringCell && equals((ExpiringCell) this);
+        return cell instanceof ExpiringCell && equals((ExpiringCell) cell);
     }
 
     protected boolean equals(ExpiringCell cell)
