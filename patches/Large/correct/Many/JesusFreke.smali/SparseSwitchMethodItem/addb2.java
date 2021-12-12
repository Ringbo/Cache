diff --git a/baksmali/src/main/java/org/jf/baksmali/Adaptors/Format/SparseSwitchMethodItem.java b/baksmali/src/main/java/org/jf/baksmali/Adaptors/Format/SparseSwitchMethodItem.java
index 5c7ec54..46f49dc 100644
--- a/baksmali/src/main/java/org/jf/baksmali/Adaptors/Format/SparseSwitchMethodItem.java
+++ b/baksmali/src/main/java/org/jf/baksmali/Adaptors/Format/SparseSwitchMethodItem.java
@@ -51,7 +51,7 @@
 
         targets = new ArrayList<SparseSwitchTarget>();
         Iterator<SparseSwitchDataPseudoInstruction.SparseSwitchTarget> iterator = instruction.iterateKeysAndTargets();
-        if (baseCodeAddress != 0) {
+        if (baseCodeAddress >= 0) {
             while (iterator.hasNext()) {
                 SparseSwitchDataPseudoInstruction.SparseSwitchTarget target = iterator.next();
                 SparseSwitchLabelTarget sparseSwitchLabelTarget = new SparseSwitchLabelTarget();
