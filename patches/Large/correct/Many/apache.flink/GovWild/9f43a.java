diff --git a/sopremo/sopremo-cleansing/src/main/java/eu/stratosphere/usecase/cleansing/GovWild.java b/sopremo/sopremo-cleansing/src/main/java/eu/stratosphere/usecase/cleansing/GovWild.java
index a625707..ef69d83 100644
--- a/sopremo/sopremo-cleansing/src/main/java/eu/stratosphere/usecase/cleansing/GovWild.java
+++ b/sopremo/sopremo-cleansing/src/main/java/eu/stratosphere/usecase/cleansing/GovWild.java
@@ -248,12 +248,15 @@
 		// ObjectAccess("lastName"), new ConstantExpression(0), new ConstantExpression(2)));
 		DisjunctPartitioning partitioning = new DisjunctPartitioning(
 			new TernaryExpression(
-				new AndExpression(new ObjectAccess("addresses"), new PathExpression(new ObjectAccess("addresses"),
-					new ArrayAccess(0), new ObjectAccess("zipCode"))),
+				new AndExpression(new ObjectAccess("addresses"), 
+					new ComparativeExpression(new ConstantExpression(2), BinaryOperator.LESS_EQUAL, 
+						new FunctionCall("length", new PathExpression(new ObjectAccess("addresses"),
+							new ArrayAccess(0), new ObjectAccess("zipCode"))))),
 				new FunctionCall("substring", new PathExpression(new ObjectAccess("addresses"), new ArrayAccess(0),
-					new ObjectAccess("zipCode"))),
+					new ObjectAccess("zipCode")), new ConstantExpression(0), new ConstantExpression(2)),
 				new ConstantExpression("")),
-				new FunctionCall("extract", new ConstantExpression("([^ ])*"), new ObjectAccess("name")));
+				new FunctionCall("extract", new ConstantExpression("([^ ])*"), 
+					new PathExpression(new ObjectAccess("names"), new ArrayAccess(0))));
 		InterSourceRecordLinkage recordLinkage = new InterSourceRecordLinkage(partitioning, simmFunction, 0.8,
 			this.fused[EARMARK][LEGAL_ENTITY], this.inputs[SPENDING][LEGAL_ENTITY]);
 		recordLinkage.setLinkageMode(LinkageMode.ALL_CLUSTERS_FLAT);
@@ -310,10 +313,10 @@
 
 		ObjectCreation merge = new ObjectCreation();
 		merge.addMapping(new ObjectCreation.CopyFields(new InputSelection(1)));
-		merge.addMapping("names", new FunctionCall("distict", new FunctionCall("unionAll",
+		merge.addMapping("names", new FunctionCall("distinct", new FunctionCall("unionAll",
 			new PathExpression(new InputSelection(0), new ObjectAccess("names")),
 			new PathExpression(new InputSelection(1), new ObjectAccess("names")))));
-		merge.addMapping("addresses", new FunctionCall("distict", new FunctionCall("unionAll",
+		merge.addMapping("addresses", new FunctionCall("distinct", new FunctionCall("unionAll",
 			new PathExpression(new InputSelection(0), new ObjectAccess("addresses")),
 			new PathExpression(new InputSelection(1), new ObjectAccess("addresses")))));
 		// merge.addMapping("funds", new PathExpression(new ArrayAccess(1), new ObjectAccess("enactedFunds")));
@@ -345,10 +348,10 @@
 		
 		ObjectCreation merge = new ObjectCreation();
 		merge.addMapping(new ObjectCreation.CopyFields(new InputSelection(1)));
-		merge.addMapping("names", new FunctionCall("distict", new FunctionCall("unionAll",
+		merge.addMapping("names", new FunctionCall("distinct", new FunctionCall("unionAll",
 			new PathExpression(new InputSelection(0), new ObjectAccess("names")),
 			new PathExpression(new InputSelection(1), new ObjectAccess("names")))));
-		merge.addMapping("addresses", new FunctionCall("distict", new FunctionCall("unionAll",
+		merge.addMapping("addresses", new FunctionCall("distinct", new FunctionCall("unionAll",
 			new PathExpression(new InputSelection(0), new ObjectAccess("addresses")),
 			new PathExpression(new InputSelection(1), new ObjectAccess("addresses")))));
 		// merge.addMapping("funds", new PathExpression(new ArrayAccess(1), new ObjectAccess("enactedFunds")));
