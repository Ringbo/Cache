diff --git a/src-ui/org/pentaho/di/ui/spoon/Spoon.java b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
index 4cbfa35..edcaa1d 100644
--- a/src-ui/org/pentaho/di/ui/spoon/Spoon.java
+++ b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
@@ -4026,7 +4026,7 @@
 					
 					String[] dbNames = new String[transMeta.nrDatabases()];
 					for (int i=0;i<dbNames.length;i++) dbNames[i]=transMeta.getDatabase(i).getName();
-					Arrays.sort(dbNames, 0, dbNames.length-1, new Comparator<String>() { public int compare(String o1, String o2) { return o1.compareToIgnoreCase(o2); } });
+					Arrays.sort(dbNames, new Comparator<String>() { public int compare(String o1, String o2) { return o1.compareToIgnoreCase(o2); } });
 
 					// Draw the connections themselves below it.
 					for (int i = 0; i < dbNames.length ; i++) {
@@ -4110,7 +4110,7 @@
 					// Put the slaves below it.
 					//
 					String[] slaveNames = transMeta.getSlaveServerNames();					
-					Arrays.sort(slaveNames, 0, slaveNames.length-1, new Comparator<String>() { public int compare(String o1, String o2) { return o1.compareToIgnoreCase(o2); } });
+					Arrays.sort(slaveNames, new Comparator<String>() { public int compare(String o1, String o2) { return o1.compareToIgnoreCase(o2); } });
 
 					for (int i = 0; i < slaveNames.length ; i++) {
 						SlaveServer slaveServer = transMeta.findSlaveServer(slaveNames[i]);
