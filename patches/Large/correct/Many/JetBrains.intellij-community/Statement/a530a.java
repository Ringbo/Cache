diff --git a/plugins/java-decompiler/engine/src/org/jetbrains/java/decompiler/modules/decompiler/stats/Statement.java b/plugins/java-decompiler/engine/src/org/jetbrains/java/decompiler/modules/decompiler/stats/Statement.java
index 885b5e2..186ca68 100644
--- a/plugins/java-decompiler/engine/src/org/jetbrains/java/decompiler/modules/decompiler/stats/Statement.java
+++ b/plugins/java-decompiler/engine/src/org/jetbrains/java/decompiler/modules/decompiler/stats/Statement.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2014 JetBrains s.r.o.
+ * Copyright 2000-2015 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -879,7 +879,7 @@
     
     int node_type = matchNode.getType();
     
-    if(node_type == MatchNode.MATCHNODE_STATEMENT) {
+    if (node_type == MatchNode.MATCHNODE_STATEMENT && !this.stats.isEmpty()) {
       String position = (String)matchNode.getRuleValue(MatchProperties.STATEMENT_POSITION);
       if(position != null) {
         if(position.matches("-?\\d+")) {
@@ -888,7 +888,7 @@
       } else if(index < this.stats.size()) { // use 'index' parameter
         return this.stats.get(index);
       }
-    } else if(node_type == MatchNode.MATCHNODE_EXPRENT && this.exprents != null) {
+    } else if(node_type == MatchNode.MATCHNODE_EXPRENT && this.exprents != null && !this.exprents.isEmpty()) {
       String position = (String)matchNode.getRuleValue(MatchProperties.EXPRENT_POSITION);
       if(position != null) {
         if(position.matches("-?\\d+")) {
