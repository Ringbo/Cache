diff --git a/core/src/main/java/com/yahoo/ycsb/workloads/CoreWorkload.java b/core/src/main/java/com/yahoo/ycsb/workloads/CoreWorkload.java
index 2d17889..29c967c 100644
--- a/core/src/main/java/com/yahoo/ycsb/workloads/CoreWorkload.java
+++ b/core/src/main/java/com/yahoo/ycsb/workloads/CoreWorkload.java
@@ -570,15 +570,15 @@
 
 		//do the transaction
 		
-		long st=System.currentTimeMillis();
+		long st=System.nanoTime();
 
 		db.read(table,keyname,fields,new HashMap<String,ByteIterator>());
 		
 		db.update(table,keyname,values);
 
-		long en=System.currentTimeMillis();
+		long en=System.nanoTime();
 		
-		Measurements.getMeasurements().measure("READ-MODIFY-WRITE", (int)(en-st));
+		Measurements.getMeasurements().measure("READ-MODIFY-WRITE", (int)((en-st)/1000));
 	}
 	
 	public void doTransactionScan(DB db)
