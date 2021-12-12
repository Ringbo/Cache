diff --git a/src/java/org/apache/cassandra/db/NativeCounterCell.java b/src/java/org/apache/cassandra/db/NativeCounterCell.java
index abcf598..2828e13 100644
--- a/src/java/org/apache/cassandra/db/NativeCounterCell.java
+++ b/src/java/org/apache/cassandra/db/NativeCounterCell.java
@@ -180,7 +180,7 @@
 
     public boolean equals(Cell cell)
     {
-        return cell instanceof CounterCell && equals((CounterCell) this);
+        return cell instanceof CounterCell && equals((CounterCell) cell);
     }
 
     public boolean equals(CounterCell cell)
