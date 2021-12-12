diff --git a/src/test/java/io/mycat/route/function/RuleFunctionSuitTableTest.java b/src/test/java/io/mycat/route/function/RuleFunctionSuitTableTest.java
index 2ac75c7..d6d3944 100644
--- a/src/test/java/io/mycat/route/function/RuleFunctionSuitTableTest.java
+++ b/src/test/java/io/mycat/route/function/RuleFunctionSuitTableTest.java
@@ -21,23 +21,23 @@
 	public void testAutoPartitionByLong() {
 		AutoPartitionByLong autoPartition=new AutoPartitionByLong();
 		autoPartition.setMapFile("autopartition-long.txt");
-		autoPartition.init(); // partition = 5
-		Assert.assertEquals(5, autoPartition.getPartitionNum());
+		autoPartition.init(); // partition = 3
+		Assert.assertEquals(3, autoPartition.getPartitionNum());
 		RuleConfig rule = new RuleConfig("id", "auto-partition-long");
 		rule.setRuleAlgorithm(autoPartition);
-		TableConfig tableConf = new TableConfig("test", "id", true, false, -1, "dn1,dn2,dn3",
+		TableConfig tableConf = new TableConfig("test", "id", true, false, -1, "dn1,dn2",
 				null, rule, true, null, false, null, null, null);
 		int suit1 = autoPartition.suitableFor(tableConf);
 		Assert.assertEquals(-1, suit1);
 		
 		tableConf.getDataNodes().clear();
-		tableConf.getDataNodes().addAll(Arrays.asList("dn1", "dn2", "dn3", "dn4", "dn5"));
+		tableConf.getDataNodes().addAll(Arrays.asList("dn1", "dn2", "dn3"));
 		
 		int suit2 = autoPartition.suitableFor(tableConf);
 		Assert.assertEquals(0, suit2);
 		
 		tableConf.getDataNodes().clear();
-		tableConf.getDataNodes().addAll(Arrays.asList("dn1", "dn2", "dn3", "dn4", "dn5", "dn6"));
+		tableConf.getDataNodes().addAll(Arrays.asList("dn1", "dn2", "dn3", "dn4"));
 		int suit3 = autoPartition.suitableFor(tableConf);
 		Assert.assertEquals(1, suit3);
 	}
