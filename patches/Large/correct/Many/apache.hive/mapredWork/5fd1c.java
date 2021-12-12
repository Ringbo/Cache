diff --git a/ql/src/java/org/apache/hadoop/hive/ql/plan/mapredWork.java b/ql/src/java/org/apache/hadoop/hive/ql/plan/mapredWork.java
index cd2d8da..2d6a881 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/plan/mapredWork.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/plan/mapredWork.java
@@ -35,7 +35,7 @@
   
   private LinkedHashMap<String,partitionDesc> pathToPartitionInfo;
   
-  private HashMap<String,Operator<? extends Serializable>> aliasToWork;
+  private LinkedHashMap<String,Operator<? extends Serializable>> aliasToWork;
 
   // map<->reduce interface
   // schema of the map-reduce 'key' object - this is homogeneous
@@ -55,7 +55,7 @@
     final String command,
     final LinkedHashMap<String,ArrayList<String>> pathToAliases,
     final LinkedHashMap<String,partitionDesc> pathToPartitionInfo,
-    final HashMap<String,Operator<? extends Serializable>> aliasToWork,
+    final LinkedHashMap<String,Operator<? extends Serializable>> aliasToWork,
     final tableDesc keyDesc,
     List<tableDesc> tagToValueDesc,
     final Operator<?> reducer,
@@ -93,10 +93,10 @@
   }
   
   @explain(displayName="Alias -> Map Operator Tree")
-  public HashMap<String, Operator<? extends Serializable>> getAliasToWork() {
+  public LinkedHashMap<String, Operator<? extends Serializable>> getAliasToWork() {
     return this.aliasToWork;
   }
-  public void setAliasToWork(final HashMap<String,Operator<? extends Serializable>> aliasToWork) {
+  public void setAliasToWork(final LinkedHashMap<String,Operator<? extends Serializable>> aliasToWork) {
     this.aliasToWork=aliasToWork;
   }
   public tableDesc getKeyDesc() {
