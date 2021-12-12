diff --git a/lang-impl/src/com/intellij/codeInsight/daemon/impl/SeverityRegistrar.java b/lang-impl/src/com/intellij/codeInsight/daemon/impl/SeverityRegistrar.java
index 27b4fc4..0e3ebc4 100644
--- a/lang-impl/src/com/intellij/codeInsight/daemon/impl/SeverityRegistrar.java
+++ b/lang-impl/src/com/intellij/codeInsight/daemon/impl/SeverityRegistrar.java
@@ -131,7 +131,7 @@
   }
 
   public int getSeveritiesCount() {
-    return createCurrentSeverities().size();
+    return getOrder().size();
   }
 
   public HighlightSeverity getSeverityByIndex(final int i) {
